package lambda.anonymous;

import java.util.Arrays;
import java.util.List;

/**
 * @program: fresh-languages
 * @Date: 2019/5/27 22:09
 * @Author: Ling Chen
 * @Description:
 */
public class CollectionApi {

    private void eachOverThree() {
        System.out.println("Prints a string of length greater than 3");
        List<String> list = Arrays.asList("every", "body", "fucking", "jump");
        list.forEach((str) -> {
            if (str.length() > 4)
                System.out.println(str);
        });
    }

    private void toUpperCase() {
        System.out.println("Change to Upper Case");
        List<String> list = Arrays.asList("every", "body", "fucking", "jump");
        list.replaceAll(s -> s.toUpperCase());
        list.forEach(System.out::println);
    }

    private void compare() {
        System.out.println("compare short < long");
        List<String> list = Arrays.asList("every", "body", "fucking", "jump");
        list.sort((s1, s2) -> s1.length() - s2.length());
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        CollectionApi api = new CollectionApi();

        api.eachOverThree();
        api.toUpperCase();
        api.compare();

    }
}
