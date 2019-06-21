package udp;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;

import java.io.File;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/21 21:55
 * @Author: Ling Chen
 * @Description:
 */
public class LogEventBroadcaster {

    private final EventLoopGroup loopGroup;
    private final Bootstrap bootstrap;
    private final File file;

    public LogEventBroadcaster(InetSocketAddress address, File file) {
        loopGroup = new NioEventLoopGroup();
        bootstrap = new Bootstrap();
        bootstrap.group(loopGroup).channel(NioDatagramChannel.class).option(ChannelOption.SO_BROADCAST, true).handler(new MyLogEventEncoder(address));
        this.file = file;
    }

    public void start() throws Exception {
        Channel channel = bootstrap.bind().sync().channel();
        long pointer = 0;
        for (; ; ) {
            long length = file.length();
            if (length < pointer) {
                pointer = length;
            } else if (length > pointer) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                randomAccessFile.seek(pointer);
                String line;
                while ((line = randomAccessFile.readLine()) != null) {
                    channel.writeAndFlush(new LogEventBean(null, line, file.getAbsolutePath(), -1));
                }
                pointer = randomAccessFile.getFilePointer();
                randomAccessFile.close();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public void stop() {
        loopGroup.shutdownGracefully();
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException();
        }
        LogEventBroadcaster broadcaster = new LogEventBroadcaster(new InetSocketAddress("255.255.255.255", Integer.parseInt(args[0])),new File(args[1]));
        try {
            broadcaster.start();
        }finally {
            broadcaster.stop();
        }
    }
}
