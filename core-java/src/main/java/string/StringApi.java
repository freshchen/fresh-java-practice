package string;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @anthor LingChen
 * @create 8/21/2019 10:16 AM
 * @Description
 */
public class StringApi {

    public static void main(String[] args) {
        System.out.println(String.join(":", "foobar", "foo", "bar"));

        "foobar:foo:bar"
                .chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char)c))
                .sorted()
                .forEach(System.out::print);

        System.out.println();

        Pattern pattern = Pattern.compile(".*@gmail\\.com");
        Stream.of("bob@gmail.com", "alice@hotmail.com")
                .filter(pattern.asPredicate())
                .count();
    }
}
