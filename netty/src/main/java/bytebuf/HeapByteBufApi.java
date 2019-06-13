package bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;


/**
 * @anthor LingChen
 * @create 6/13/2019 4:15 PM
 * @Description
 */
@Slf4j
public class HeapByteBufApi {

    public static void main(String[] args) {
        ByteBuf heatBuf = Unpooled.buffer().writeBytes(Unpooled.copiedBuffer("Netty is very nice !", CharsetUtil.UTF_8));
        log.info(heatBuf.toString(CharsetUtil.UTF_8));
        log.info(String.valueOf(heatBuf.getByte(0)));
        heatBuf.setByte(0, 101);
        log.info(String.valueOf(heatBuf.getByte(0)));
        log.info(heatBuf.toString(CharsetUtil.UTF_8));
        log.info(String.valueOf(heatBuf.readByte()));
        log.info(String.valueOf(heatBuf.readByte()));
        log.info(String.valueOf(heatBuf.readByte()));
        log.info(String.valueOf(heatBuf.isReadable()));
        log.info(String.valueOf(heatBuf.writableBytes()));
    }
}
