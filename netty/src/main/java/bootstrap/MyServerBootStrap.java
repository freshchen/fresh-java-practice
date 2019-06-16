package bootstrap;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/14 23:10
 * @Author: Ling Chen
 * @Description:
 */
@Slf4j
public class MyServerBootStrap {
    public static void main(String[] args) {

        EventLoopGroup loopGroup = new NioEventLoopGroup();
        ServerBootstrap bootstrap = new ServerBootstrap()
                .group(loopGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new SimpleChannelInboundHandler <ByteBuf>() {
                    @Override
                    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
                        log.info("Received data 9999");
                    }
                });
        ChannelFuture future = bootstrap.bind(new InetSocketAddress("localhost", 9999));
        future.addListener((ChannelFutureListener) channelFuture -> {
            if (channelFuture.isSuccess()) {
                log.info("Server bound 9999");
            } else {
                log.error("Bound failure 9999");
                channelFuture.cause().printStackTrace();
            }
        });

    }
}
