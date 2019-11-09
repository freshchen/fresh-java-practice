package builder;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 16:59
 * @Author: Ling Chen
 * @Description:
 */
public class Director {

    void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
