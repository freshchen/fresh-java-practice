package simplefactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 0:28
 * @Author: Ling Chen
 * @Description:简单工厂模式：通过继承多态实现操作的解耦
 */
public class OptFactoryTest {

    public static void main(String[] args) throws Exception {
        Operation operation = OptFactory.createOpt("0");
        operation.setNumberOne(12);
        operation.setNumberTwo(0);
        double result = operation.getResult();
        System.out.println(result);
    }
}
