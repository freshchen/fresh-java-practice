package chat;

import io.netty.channel.*;
import io.netty.handler.codec.http.*;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.stream.ChunkedNioFile;

import java.io.File;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @anthor LingChen
 * @create 6/21/2019 2:23 PM
 * @Description
 */
public class MyHttpRequestHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

    private String webSocketUri;
    private static final File INDEX;

    static {
        URL location = MyHttpRequestHandler.class.getProtectionDomain().getCodeSource().getLocation();
        try {
            String path = location.toURI() + "index.html";
            path = !path.contains("file:") ? path : path.substring(5);
            INDEX = new File(path);
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Unable to locate index.html", e);
        }
    }

    MyHttpRequestHandler(String webSocketUri) {
        this.webSocketUri = webSocketUri;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, FullHttpRequest fullHttpRequest) throws Exception {
        if (webSocketUri.equalsIgnoreCase(fullHttpRequest.uri())) {
            // 如果请求了WebSocket协议升级，则增加引用计数
            channelHandlerContext.fireChannelRead(fullHttpRequest.retain());
        } else {
            if (HttpUtil.is100ContinueExpected(fullHttpRequest)) {
                // http1.1 规范
                send100Continue(channelHandlerContext);
            }
        }
        // 读取index.html
        RandomAccessFile file = new RandomAccessFile(INDEX, "r");
        HttpResponse response = new DefaultFullHttpResponse(fullHttpRequest.protocolVersion(), HttpResponseStatus.OK);
        response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/html; charset=UTF-8");
        boolean keepAlive = HttpUtil.isKeepAlive(fullHttpRequest);
        if (keepAlive) {
            response.headers().set(HttpHeaderNames.CONTENT_LENGTH, file.length()).set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        }
        channelHandlerContext.write(response);
        if (channelHandlerContext.pipeline().get(SslHandler.class) == null) {
            channelHandlerContext.write(new DefaultFileRegion(file.getChannel(), 0, file.length()));
        } else {
            channelHandlerContext.write(new ChunkedNioFile(file.getChannel()));
        }
        ChannelFuture future = channelHandlerContext.writeAndFlush(LastHttpContent.EMPTY_LAST_CONTENT);
        if (!keepAlive) {
            future.addListener(ChannelFutureListener.CLOSE);
        }
    }

    private static void send100Continue(ChannelHandlerContext ctx) {
        FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.CONTINUE);
        ctx.writeAndFlush(response);
    }

    private static void send100Continue(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
