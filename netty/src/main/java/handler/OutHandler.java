package handler;

import io.netty.channel.*;
import io.netty.util.ReferenceCountUtil;

/**
 * @anthor LingChen
 * @create 6/14/2019 4:01 PM
 * @Description
 */
// 可以被加入多个pipeline
@ChannelHandler.Sharable
public class OutHandler extends ChannelOutboundHandlerAdapter {
    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        super.write(ctx, msg, promise);
    }
}
