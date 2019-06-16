package bootstrap;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.AttributeKey;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/15 21:21
 * @Author: Ling Chen
 * @Description: 加入可选项加入属性
 */
@Slf4j
public class MyOptionalBootstrap {

    public static void main(String[] args) {
        final AttributeKey<Integer> id = AttributeKey.valueOf("sedqw-qwd-qw");
        Bootstrap bootstrap = new Bootstrap()
                .group(new NioEventLoopGroup())
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE,true)
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS,5000)
                .attr(id,123456)
                .handler(new SimpleChannelInboundHandler <ByteBuf>() {
                    @Override
                    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
                        log.info("Received data");
                    }

                    @Override
                    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
                        Integer idValue = ctx.channel().attr(id).get();
                        log.info("idValue is : [{}]", idValue);
                    }
                });
        ChannelFuture future = bootstrap.connect(new InetSocketAddress("localhost", 8888));
        future.addListener((ChannelFutureListener) channelFuture -> {
            if (channelFuture.isSuccess()) {
                log.info("Connection established");
            } else {
                log.error("Connection failure");
                channelFuture.cause().printStackTrace();
            }
        });
    }
}
