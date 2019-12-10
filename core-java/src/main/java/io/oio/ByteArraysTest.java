package io.oio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArraysTest {

    public static void case1() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write("Hello World!".getBytes());
        byte[] in = outputStream.toByteArray();
        InputStream input = new ByteArrayInputStream(in);
        int data = input.read();
        while(data != -1) {
            System.out.print((char) data);
            data = input.read();
        }
    }


    public static void main(String[] args) throws IOException {
        ByteArraysTest.case1();
    }
}
