package endecode;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/15 23:03
 * @Author: Ling Chen
 * @Description: 固定长度帧解码
 */
public class MyFixedLengthFrameDecoder extends ByteToMessageDecoder {

    private final int frameLength;

    public MyFixedLengthFrameDecoder(int frameLength) {
        if (frameLength <= 0) {
            throw new IllegalArgumentException("frameLength : " + frameLength);
        }
        this.frameLength = frameLength;
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf in, List <Object> out) throws Exception {
        while (in.readableBytes() >= this.frameLength) {
            ByteBuf buf = in.readBytes(frameLength);
            out.add(buf);

        }
    }
}
