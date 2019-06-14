package handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @anthor LingChen
 * @create 6/14/2019 4:03 PM
 * @Description
 */
@ChannelHandler.Sharable
public class SimpleDiscardInHandler extends SimpleChannelInboundHandler<Object> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        // 不需要显示的释放资源，该方法中的属性全部自动释放
    }
}
