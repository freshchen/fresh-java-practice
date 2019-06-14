package handler;

import io.netty.channel.*;
import io.netty.util.ReferenceCountUtil;

/**
 * @anthor LingChen
 * @create 6/14/2019 4:03 PM
 * @Description
 */
@ChannelHandler.Sharable
public class DiscardOutHandler extends ChannelOutboundHandlerAdapter {
    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        ReferenceCountUtil.release(msg);
    }
}
