package demo;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author darcy
 * @since 2020/02/14
 **/
public class TestCases {

    public static void case1() {
        ArrayList<String> strings = Lists.newArrayList("1", "2", "3", "4");
//        strings.stream().
//        Stream.builder().add("1").andThen();
    }

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3");
        Stream<Object> empty = Stream.empty();

    }
}
