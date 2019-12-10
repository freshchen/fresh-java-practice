package io.oio;

import java.io.*;

public class FileTest {

    public static void case1() throws IOException {
        Writer writer = new FileWriter("core-java\\src\\main\\java\\io\\oio\\a.txt");
        writer.write("Hello World !");
        writer.close();
    }

    public static void case2() throws IOException {
        Reader reader = new FileReader("core-java\\src\\main\\java\\io\\oio\\a.txt");
        int data = reader.read();
        while(data != -1){
            char dataChar = (char) data;
            System.out.print(dataChar);
            data = reader.read();
        }
        System.out.println();
    }

    public static void case3() throws IOException {
        RandomAccessFile file = new RandomAccessFile("core-java\\src\\main\\java\\io\\oio\\a.txt", "rw");
        file.seek(1);
        System.out.println((char) file.read());
    }

    public static void case4() throws IOException {
        PushbackInputStream file = new PushbackInputStream(new FileInputStream("core-java\\src\\main\\java\\io\\oio\\a.txt"),3);
        int aByte = file.read();
        System.out.println((char) aByte);
        file.unread(aByte);
        aByte = file.read();
        System.out.println((char) aByte);
    }


    public static void main(String[] args) throws IOException {
        FileTest.case1();
        FileTest.case2();
        FileTest.case3();
        FileTest.case4();
    }
}
