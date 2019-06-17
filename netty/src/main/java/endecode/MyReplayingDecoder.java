package endecode;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

/**
 * @anthor LingChen
 * @create 6/17/2019 1:48 PM
 * @Description ReplayingDecoder更复杂的子类HttpObjectAggregator
 */
public class MyReplayingDecoder extends ReplayingDecoder<Void> {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        // 扩展ReplayingDecoder不需要再判断传入的字节长度，不够会报错，等待条件满足之后重试
        list.add(byteBuf.readInt());
    }
}
