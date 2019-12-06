package exception;

import javax.management.BadStringOperationException;

public class Demo1 {

    public static void printSecondLetter(String s) throws BadStringOperationException {
        if (s.length() < 2) {
            throw new BadStringOperationException("Sting too short");
        }
        System.out.println(s.charAt(1));
    }

    public static void main(String[] args) throws BadStringOperationException {
        Demo1.printSecondLetter("");
        Demo1.printSecondLetter("12312");
    }
}
