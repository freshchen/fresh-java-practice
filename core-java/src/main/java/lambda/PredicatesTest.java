package lambda;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @anthor LingChen
 * @create 8/19/2019 1:47 PM
 * @Description Predicate是一个布尔类型的函数，该函数只有一个输入参数。Predicate接口包含
 * 了多种默认方法，用于处理复杂的逻辑动词
 */
public class PredicatesTest {
    public static void main(String[] args) {
        Predicate<String> predicate = (s -> s.length() > 3);
        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
        System.out.println(predicate.test("11"));
        System.out.println(predicate.test("112233"));
        System.out.println(isEmpty.test("1"));
    }
}
