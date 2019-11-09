package strategy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/17 0:10
 * @Author: Ling Chen
 * @Description:策略模式和简单工厂模式结合
 */
public class PayContextFactoryTest {

    public static void main(String[] args) {
        PayContextFactory payContextFactory = new PayContextFactory("retrun");
        System.out.println(payContextFactory.getResult(1000));
    }
}
