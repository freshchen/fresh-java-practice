package endecode;

import io.netty.channel.CombinedChannelDuplexHandler;

/**
 * @anthor LingChen
 * @create 6/17/2019 2:33 PM
 * @Description 将编解码器结合起来
 */
public class MyCombineEcdec extends CombinedChannelDuplexHandler<MyIntegerToStringDecoder, MyShortToByteEncoder> {
    public MyCombineEcdec() {
        super(new MyIntegerToStringDecoder(), new MyShortToByteEncoder());
    }
}
