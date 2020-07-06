package flow;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author darcy
 * @since 2020/06/16
 **/
public class TestLang {

    public static void testString() {
        System.out.println("###### isBlank");
        System.out.println("".isBlank());
        System.out.println("1".isBlank());
        System.out.println("\n".isBlank());
        System.out.println("\n1".isBlank());
        System.out.println("###### isEmpty");
        System.out.println("".isEmpty());
        System.out.println("1".isEmpty());
        System.out.println("\n".isEmpty());
        System.out.println("\n1".isEmpty());
        System.out.println("###### lines");
        "wu 123 123".lines().forEach(System.out::println);
        "n \n123".lines().forEach(System.out::println);
        "r \r123".lines().forEach(System.out::println);
        // 不识别 \r\n
        "rn \r\n123".lines().forEach(System.out::println);
        System.out.println("###### repeat");
        System.out.println("A".repeat(10));
        System.out.println("###### strip");
        String a = "  \u2000    aaa   \t   ";
        System.out.println(a.trim());
        System.out.println(a.strip());
        System.out.println(a.stripLeading());
        System.out.println(a.stripTrailing());
    }

    public static void testCollection() {
        // 不可变
        List<String> strings = List.of(",", "3", "4");
        String[] strings1 = strings.toArray(String[]::new);
        System.out.println(Arrays.toString(strings1));

    }

    public static void testStream() {
        System.out.println("###### takeWhile");
        Stream.of("1", "@", "2", "", "232", "").takeWhile(StringUtils::isNoneBlank).forEach(System.out::println);

        System.out.println("###### dropWhile");
        Stream.of("1", "@", "2", "", "232", "").dropWhile(StringUtils::isNoneBlank).forEach(System.out::println);

        System.out.println("###### iterate");
        IntStream.iterate(0, n -> n < 3, n -> n + 1).forEach(System.out::println);

        System.out.println("###### ofNullable");
        System.out.println(Stream.ofNullable(null).count());

    }

    public static void testOptional() {
        System.out.println("###### Optional stream");
        Optional.ofNullable(List.of(1, 2, 3)).stream().flatMap(List::stream).forEach(System.out::println);

        Optional.ofNullable(1).isEmpty();

        System.out.println("###### Optional ifPresentOrElse");
        Optional.ofNullable(1).ifPresentOrElse(System.out::println, () -> System.out.println("em"));
        Optional.ofNullable(null).ifPresentOrElse(System.out::println, () -> System.out.println("em"));

        System.out.println("###### Optional or");
        Optional<Object> or = Optional.ofNullable(null).or(() -> Optional.ofNullable(1));
        System.out.println(or);

        System.out.println("###### Optional orElseThrow");
//        Optional.ofNullable(null).orElseThrow();


        System.out.println("###### Optional ifPresentOrElse");
        Optional.ofNullable(null).ifPresentOrElse(
                (value) -> System.out.println(value),
                () -> {
                    try {
                        Thread.sleep(1111);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("in lambda");
                });
        System.out.println("in main");
    }

    public static void main(String[] args) {
        TestLang.testString();
        TestLang.testCollection();
        TestLang.testStream();
        TestLang.testOptional();

    }
}
