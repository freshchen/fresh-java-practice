package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @anthor LingChen
 * @create 10/23/2019 5:20 PM
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(2, 4, 7, 9);
        List<Integer> listB = Arrays.asList(3, 2, 5, 7);
        listA.stream()
                .flatMap(a -> listB.stream()
                        .filter( b -> a + b == 9)
                        .map(b -> new int[]{a, b})
                )
                .forEach( pair -> System.out.println("(" + pair[0] + "," + pair[1] + ")"));
    }
}
