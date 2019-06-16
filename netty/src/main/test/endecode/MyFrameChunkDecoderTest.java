package endecode;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.TooLongFrameException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/16 21:51
 * @Author: Ling Chen
 * @Description:
 */
public class MyFrameChunkDecoderTest {

    @Test
    public void decode() {
        ByteBuf buf = Unpooled.buffer();
        for (int i = 0; i < 9; i++) {
            buf.writeByte(i);
        }
        ByteBuf input = buf.duplicate();
        EmbeddedChannel channel = new EmbeddedChannel(new MyFrameChunkDecoder(3));

        assertTrue(channel.writeInbound(input.readBytes(2)));
        try {
            channel.writeInbound(input.readBytes(4));
            Assert.fail();
        } catch (TooLongFrameException e) {
            System.out.println("Ok");
        }
        assertTrue(channel.writeInbound(input.readBytes(3)));
        assertTrue(channel.finish());
    }
}