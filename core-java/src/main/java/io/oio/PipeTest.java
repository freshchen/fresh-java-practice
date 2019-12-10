package io.oio;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeTest {

    public static void case1() throws IOException {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

        new Thread(()->{
            try {
                pipedOutputStream.write("Hello World 1 !".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                int data = pipedInputStream.read();
                while(data != -1){
                    System.out.print((char) data);
                    data = pipedInputStream.read();
                }
            } catch (IOException e) {
            }
        }).start();
    }

    public static void case2() throws IOException {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();
        pipedInputStream.connect(pipedOutputStream);

        new Thread(()->{
            try {
                pipedOutputStream.write("Hello World 2 !".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                int data = pipedInputStream.read();
                while(data != -1){
                    System.out.print((char) data);
                    data = pipedInputStream.read();
                }
            } catch (IOException e) {
            }
        }).start();
    }


    public static void main(String[] args) throws IOException {
        PipeTest.case1();
        PipeTest.case2();
    }
}
