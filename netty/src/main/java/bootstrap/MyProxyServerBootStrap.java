package bootstrap;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/15 20:18
 * @Author: Ling Chen
 * @Description: 让客户端连接转移到另一个服务器
 */
@Slf4j
public class MyProxyServerBootStrap {

    public static void main(String[] args) {
        ServerBootstrap bootstrap = new ServerBootstrap()
                .group(new NioEventLoopGroup(), new NioEventLoopGroup())
                .channel(NioServerSocketChannel.class)
                .childHandler(new SimpleChannelInboundHandler <ByteBuf>() {
                    @Override
                    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
                        log.info("Received proxy 8888");
                    }

                    @Override
                    public void channelActive(ChannelHandlerContext ctx) throws Exception {
                        Bootstrap clientStrap = new Bootstrap()
                                .group(ctx.channel().eventLoop())
                                .channel(NioSocketChannel.class)
                                .handler(new SimpleChannelInboundHandler <ByteBuf>() {
                                    @Override
                                    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
                                        log.info("Received proxy 9999");
                                    }
                                });
                        ChannelFuture future = clientStrap.connect(new InetSocketAddress("localhost", 9999));
                    }
                });
        ChannelFuture future = bootstrap.bind(new InetSocketAddress("localhost", 8888));
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (channelFuture.isSuccess()) {
                    log.info("Server bound 8888");
                } else {
                    log.error("Bound failure 8888");
                    channelFuture.cause().printStackTrace();
                }
            }
        });
    }
}
