package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenling
 */
public class StreamDemo {

    static {
        map = new HashMap<>();
        list = new ArrayList<>();
        init();
    }

    private static final Map<String, String> map;
    private static final List<String> list;

    private static void init() {
        map.put("name", "wang");
        map.put("age", "12");

        list.add("name");
        list.add("age");
        list.add("time");
        list.add("title");
        list.add("year");
    }

    public static void case1() {
        list.stream().forEach(System.out::println);
    }

    public static void case2() {
        list.stream().filter(s -> s.length() > 2).forEach(System.out::println);
    }

    public static void case3() {
        System.out.println(list.stream().anyMatch(s -> s.startsWith("a")));
        System.out.println(list.stream().allMatch(s -> s.startsWith("a")));
    }

    public static void case4() {
        list.stream().findAny().ifPresent(System.out::print);
    }

    public static void case5() {
        list.stream().map(s -> s.charAt(0)).forEach(System.out::println);
    }

    public static void case6() {
        list.stream().flatMap(s -> map.values().stream().map(s1 -> s + s1)).forEach(System.out::println);
    }

    public static void case7() {
        list.stream().map(s -> String.valueOf(s.charAt(0))).reduce((s1, s2) -> s1 + s2).ifPresent(System.out::print);
    }

    public static void main(String[] args) {
        Utils.invokeAllCases(StreamDemo.class);
    }
}
