package endecode;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.TooLongFrameException;

import java.util.List;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/16 21:47
 * @Author: Ling Chen
 * @Description:
 */
public class MyFrameChunkDecoder extends ByteToMessageDecoder {

    private final int maxFrameSize;

    public MyFrameChunkDecoder(int maxFrameSize) {
        this.maxFrameSize = maxFrameSize;
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf in, List <Object> out) throws Exception {
        int readableBytes = in.readableBytes();
        if (readableBytes > maxFrameSize){
            in.clear();
            // 因为是异步的，所以处理前需要放入内存，为了不让内存耗尽，可以指定最大占用，超过的报错
            throw new TooLongFrameException();
        }
        ByteBuf buf = in.readBytes(readableBytes);
        out.add(buf);
    }
}
