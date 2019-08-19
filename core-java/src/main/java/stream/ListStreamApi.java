package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @program: fresh-languages
 * @Date: 2019/5/27 23:22
 * @Author: Ling Chen
 * @Description:
 */
public class ListStreamApi {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yo");
        list.add("yo");
        list.add("check in");
        list.add("now");

        System.out.println("使用Stream.forEach()迭代");
        list.stream().forEach(System.out::println);
        System.out.println("保留长度等于3的字符串");
        list.stream().filter(s -> s.length() > 3).forEach(System.out::println);
        System.out.println("去重");
        list.stream().distinct().forEach(System.out::println);
        System.out.println("排序");
        list.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
        System.out.println("找出最长的单词");
        System.out.println(list.stream().reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2).get());
        System.out.println(list.stream().max((s1, s2) -> s1.length() - s2.length()).get());
        System.out.println("求单词长度之和");
        System.out.println(list.stream().reduce(0, (sum, str) -> sum + str.length(), (a, b) -> a + b));
        System.out.println("转为Set");
        Set set = list.stream().collect(Collectors.toSet());
        set.stream().forEach(System.out::println);
        System.out.println("转为Map");
        Map map = list.stream().distinct().collect(Collectors.toMap(s -> s.hashCode(), Function.identity()));
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        System.out.println("字符串join");
        System.out.println(list.stream().collect(Collectors.joining()));
        System.out.println(list.stream().collect(Collectors.joining(" ")));
        System.out.println(list.stream().collect(Collectors.joining(" ", "[", "]")));


    }
}
