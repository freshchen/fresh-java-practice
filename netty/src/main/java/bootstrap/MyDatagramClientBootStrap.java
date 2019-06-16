package bootstrap;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.nio.NioDatagramChannel;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/14 22:48
 * @Author: Ling Chen
 * @Description:
 */
@Slf4j
public class MyDatagramClientBootStrap {

    public static void main(String[] args) {
        Bootstrap bootstrap = new Bootstrap()
                .group(new NioEventLoopGroup())
                .channel(NioDatagramChannel.class)
                .handler(new SimpleChannelInboundHandler<DatagramPacket>() {
                    @Override
                    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DatagramPacket datagramPacket) throws Exception {
                        log.info("data !");
                    }
                });
        // 因为走的无连接通信，所以用bind不用connect
        ChannelFuture future = bootstrap.bind(new InetSocketAddress("localhost", 8888));
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
