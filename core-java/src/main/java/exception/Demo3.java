package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo3 {

    public static void printFile() throws IOException {

        try (FileInputStream input = new FileInputStream("exception/file.txt")) {

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Demo3.printFile();
    }
}
