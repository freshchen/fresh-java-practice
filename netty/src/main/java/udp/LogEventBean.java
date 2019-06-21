package udp;

import java.net.InetSocketAddress;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/21 21:34
 * @Author: Ling Chen
 * @Description:
 */
public class LogEventBean {

    public static final byte SEPARATOR = Byte.parseByte(":");
    private final InetSocketAddress address;
    private String logFile;
    private String message;
    private long received;

    public LogEventBean(String logFile, String message) {
        this(null, logFile, message, -1);
    }

    public LogEventBean(InetSocketAddress address, String logFile, String message, long received) {
        this.address = address;
        this.logFile = logFile;
        this.message = message;
        this.received = received;
    }

    public InetSocketAddress getAddress() {
        return address;
    }

    public String getLogFile() {
        return logFile;
    }

    public String getMessage() {
        return message;
    }

    public long getReceived() {
        return received;
    }
}
