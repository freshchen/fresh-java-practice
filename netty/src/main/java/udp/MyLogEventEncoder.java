package udp;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.DatagramPacket;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.CharsetUtil;

import java.net.InetSocketAddress;
import java.util.List;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/21 21:43
 * @Author: Ling Chen
 * @Description:
 */
public class MyLogEventEncoder extends MessageToMessageEncoder <LogEventBean> {

    private final InetSocketAddress remoteAddress;

    public MyLogEventEncoder(InetSocketAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, LogEventBean logEventBean, List <Object> list) throws Exception {
        byte[] bytes = logEventBean.getLogFile().getBytes(CharsetUtil.UTF_8);
        byte[] message = logEventBean.getMessage().getBytes(CharsetUtil.UTF_8);
        ByteBuf buf = channelHandlerContext.alloc().buffer(bytes.length + message.length + 1);
        buf.writeBytes(bytes);
        buf.writeByte(logEventBean.SEPARATOR);
        buf.writeBytes(message);
        list.add(new DatagramPacket(buf, remoteAddress));
    }
}
