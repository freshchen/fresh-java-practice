package bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @anthor LingChen
 * @create 6/13/2019 4:15 PM
 * @Description
 */
public class ByteBufType {

    public static void main(String[] args) {
        // 堆缓存
        ByteBuf heapbuf = Unpooled.buffer();
        ByteBuf heapbuf1 = new NioSocketChannel().alloc().buffer();
        // 系统直接缓存
        ByteBuf directBuf = Unpooled.directBuffer();
        ByteBuf directBuf1 = new NioSocketChannel().alloc().directBuffer();
        // 可以整合前两种缓存
        ByteBuf compositeBuf = Unpooled.compositeBuffer();
        ByteBuf compositeBuf1 = new NioSocketChannel().alloc().compositeBuffer();
    }
}
