package handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * @anthor LingChen
 * @create 6/14/2019 4:01 PM
 * @Description
 */
// 可以被加入多个pipeline，只有确保线程安全的时候才能使用
@ChannelHandler.Sharable
public class DiscardInHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 释放资源
        ReferenceCountUtil.release(msg);

    }
}
