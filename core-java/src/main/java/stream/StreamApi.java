package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @anthor LingChen
 * @create 8/20/2019 10:04 AM
 * @Description
 */
public class StreamApi {
    public static void main(String[] args) {
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.range(1, 4)
                .forEach(System.out::println);

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("ling", "wang", "zhang");
        System.out.println(names);

        names.stream().map((s -> "name: " + s)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(names);

        System.out.println(names.stream().collect(Collectors.joining(" and ", "Names are: ", " ...")));

        System.out.println(names);

        names.stream().reduce( (s1, s2) -> s1.length() > s2.length() ? s1 : s2).ifPresent(System.out::println);

        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }
}
