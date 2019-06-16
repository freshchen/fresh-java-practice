package bootstrap;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/15 21:08
 * @Author: Ling Chen
 * @Description: 绑定多个channel hanlder
 */
@Slf4j
public class MyMutihanlderServerStrap {
    public static void main(String[] args) {
        ServerBootstrap bootstrap = new ServerBootstrap()
                .group(new NioEventLoopGroup(), new NioEventLoopGroup())
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer <Channel>() {
                    @Override
                    protected void initChannel(Channel channel) throws Exception {
                        ChannelPipeline pipeline = channel.pipeline();
                        pipeline.addLast(new HttpClientCodec());
                        pipeline.addLast(new HttpObjectAggregator(Integer.MAX_VALUE));
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
