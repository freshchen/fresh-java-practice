package lambda;

import java.util.function.Supplier;

/**
 * @anthor LingChen
 * @create 8/19/2019 2:31 PM
 * @Description Supplier接口产生一个给定类型的结果。与Function不同的是，Supplier没有输入参
 * 数。
 */
public class SuppliersTest {

    public static void main(String[] args) {
        Supplier<Object> supplier = Object::new;
        System.out.println(supplier.get().hashCode());
    }
}
