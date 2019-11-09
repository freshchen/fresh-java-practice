package builder;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 16:54
 * @Author: Ling Chen
 * @Description:
 */
public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();

    Product getResult();
}
