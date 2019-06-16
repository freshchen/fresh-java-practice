package bootstrap;


import io.netty.bootstrap.Bootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.util.concurrent.Future;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/15 21:50
 * @Author: Ling Chen
 * @Description:
 */
public class MyCloseBootstrap {

    public static void main(String[] args) {
        EventLoopGroup loopGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap()
                .group(new NioEventLoopGroup());

        Future future = loopGroup.shutdownGracefully();
        future.syncUninterruptibly();
    }
}
