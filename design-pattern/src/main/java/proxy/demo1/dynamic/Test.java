package proxy.demo1.dynamic;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/9 16:56
 * @Author: Ling Chen
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InterruptedException {
        LifeService zhang = ProxyFactory.getLifeServiceProxyInstance(Person.class);
        System.out.println(zhang.sleep());
        System.out.println(zhang.wake());
    }

    /**
     * 输出：
     * 2019-11-10T05:24:16.932Z
     * 晚安晚安
     * 2019-11-10T05:24:16.942Z
     * 早鸭
     */
}
