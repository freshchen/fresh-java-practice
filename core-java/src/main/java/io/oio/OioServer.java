package io.oio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @anthor LingChen
 * @create 6/13/2019 11:11 AM
 * @Description
 */
@Slf4j
public class OioServer {

    public void server(int port) throws IOException {
        final ServerSocket serverSocket = new ServerSocket(port);
        for (; ; ) {
            final Socket clientSocket = serverSocket.accept();
            log.info("Accept connection from [{}]:[{}] .", clientSocket);
            new Thread(() -> {
                OutputStream out;
                try {
                    out = clientSocket.getOutputStream();
                    out.write("Hi!\r\nI am fresh".getBytes(Charset.forName("UTF-8")));
                    out.flush();
                } catch (IOException e) {
                    log.error("[{}]", e);
                }finally {
                    try {
                        clientSocket.close();
                    } catch (IOException e) {
                        log.error("[{}]", e);
                    }
                }
            }).start();
        }
    }

}
