package demo;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author darcy
 * @since 2020/05/11
 **/
public class Quick {
    public static void main(String[] args) {

        String s = "12312,123123,12,3,esaf,dsf";
        Stream.of(",".split(s)).forEach((s1 -> System.out.println(s1)));
    }
}
