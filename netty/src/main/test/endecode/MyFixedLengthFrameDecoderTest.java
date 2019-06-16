package endecode;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/16 21:19
 * @Author: Ling Chen
 * @Description:
 */
public class MyFixedLengthFrameDecoderTest {

    @Test
    public void decode() {
        ByteBuf buf = Unpooled.buffer();
        for (int i = 0; i < 9; i++) {
            buf.writeByte(i);
        }
        ByteBuf input = buf.duplicate();
        EmbeddedChannel channel = new EmbeddedChannel(new MyFixedLengthFrameDecoder(3));

        assertFalse(channel.writeInbound(input.readBytes(2)));
        assertTrue(channel.writeInbound(input.readBytes(7)));
        assertTrue(channel.writeInbound(input.retain()));
        assertTrue(channel.finish());
        // 前三位
        ByteBuf read = channel.readInbound();
        assertEquals(buf.readSlice(3), read);
        read.release();
        // 三到六位
        read = channel.readInbound();
        assertEquals(buf.readSlice(3), read);
        read.release();
        // 六到九位
        read = channel.readInbound();
        assertEquals(buf.readSlice(3), read);
        read.release();

        assertNull(channel.readInbound());
        buf.release();
    }
}