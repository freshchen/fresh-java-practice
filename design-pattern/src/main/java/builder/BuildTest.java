package builder;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 16:48
 * @Author: Ling Chen
 * @Description:
 */
public class BuildTest {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuliderOne();
        director.construct(builder1);
        builder1.getResult().show();

        Builder builder2 = new ConcreteBuliderTwo();
        director.construct(builder2);
        builder2.getResult().show();

    }
}
