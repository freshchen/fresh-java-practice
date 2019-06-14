package pipeline;

import handler.DiscardInHandler;
import handler.DiscardOutHandler;
import handler.OutHandler;
import handler.SimpleDiscardInHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * @anthor LingChen
 * @create 6/14/2019 4:06 PM
 * @Description
 */
public class ChannelPiplineApi {

    public static void main(String[] args) {
        NioServerSocketChannel channel = new NioServerSocketChannel();
        ChannelPipeline pipeline = channel.pipeline();
        SimpleDiscardInHandler inHandler1 = new SimpleDiscardInHandler();
        DiscardInHandler inHandler2 = new DiscardInHandler();
        OutHandler outHandler1 = new OutHandler();
        DiscardOutHandler outHandler2 = new DiscardOutHandler();
        pipeline.addLast("inHandler1",inHandler1);
        pipeline.addLast("inHandler2",inHandler2);
        pipeline.addFirst("outHandler1",outHandler1);
        pipeline.addFirst("outHandler2",outHandler2);
        pipeline.remove("inHandler2");
        pipeline.replace("inHandler1", "outHandler2", outHandler2);
        pipeline.fireChannelActive();
        pipeline.fireChannelRead("hello");
        pipeline.bind(new InetSocketAddress(11232));
        pipeline.context("2323");
        pipeline.writeAndFlush("1");
        pipeline.read();
        // 从EventLoop中取消注册,默认都是调用下一个handler
        pipeline.deregister();
        pipeline.close();
    }
}
