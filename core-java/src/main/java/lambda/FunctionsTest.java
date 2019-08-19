package lambda;

import java.util.function.Function;

/**
 * @anthor LingChen
 * @create 8/19/2019 1:57 PM
 * @Description Function<T, R></>接口接收一个参数，并返回单一的结果。默认方法可以将多个函数串在一
 * 起（compse, andThen）
 * T为输入 R为输出
 */
public class FunctionsTest {

    public static void main(String[] args) {
        Function<String, Integer> hashCode = String::hashCode;
        Function<String, String> str = hashCode.andThen(String::valueOf);
        Function<String, Integer> length = str.andThen(String::length);

        System.out.println(hashCode.apply("123"));
        System.out.println(str.apply("123"));
        System.out.println(length.apply("123"));
    }
}
