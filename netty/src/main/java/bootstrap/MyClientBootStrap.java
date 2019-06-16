package bootstrap;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/14 22:48
 * @Author: Ling Chen
 * @Description:
 */
@Slf4j
public class MyClientBootStrap {

    public static void main(String[] args) {
        EventLoopGroup loopGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap().group(loopGroup)
                .channel(NioSocketChannel.class)
                .handler(new SimpleChannelInboundHandler <ByteBuf>() {
                    @Override
                    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
                        log.info("Received data");
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
