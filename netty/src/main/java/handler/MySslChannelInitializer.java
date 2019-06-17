package handler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.ssl.OpenSslEngine;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslHandler;

import javax.net.ssl.SSLEngine;

/**
 * @anthor LingChen
 * @create 6/17/2019 2:43 PM
 * @Description
 */
public class MySslChannelInitializer extends ChannelInitializer<Channel> {

    private final SslContext sslContext;
    private final boolean startTls;

    public MySslChannelInitializer(SslContext sslContext, boolean startTls) {
        this.sslContext = sslContext;
        this.startTls = startTls;
    }

    @Override
    protected void initChannel(Channel channel) throws Exception {
        SSLEngine engine = sslContext.newEngine(channel.alloc());
        channel.pipeline().addFirst("ssl", new SslHandler(engine, startTls));
    }
}
