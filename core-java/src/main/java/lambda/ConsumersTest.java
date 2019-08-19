package lambda;

import java.util.function.Consumer;

/**
 * @anthor LingChen
 * @create 8/19/2019 2:49 PM
 * @Description Consumer代表了在一个输入参数上需要进行的操作。
 */
public class ConsumersTest {
    public static void main(String[] args) {
        Consumer<Object> consumer = (o -> System.out.println("Hello" + o.hashCode()));
        consumer.accept(new Object());
    }
}
