package exception;

import javax.management.BadStringOperationException;

public class Demo2 {

    public static void printSecondLetter(String s) {
        try {
            Demo1.printSecondLetter(s);
            System.out.println("一切正常");
        } catch (BadStringOperationException e) {
            System.out.println("出事了");
            throw new NullPointerException("123");
        }
        System.out.println("demo 2");
    }

    public static void printSecondLetter1(String s) {
        try {
            Demo1.printSecondLetter(s);
            System.out.println("一切正常");
        } catch (BadStringOperationException e) {
            System.out.println("出事了");
            e.printStackTrace();
        }
        System.out.println("demo 2");
    }

    public static void main(String[] args) {
        Demo2.printSecondLetter("1");
        Demo2.printSecondLetter1("1");
    }
}
