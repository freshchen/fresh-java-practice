package proxy.demo1.cgloib;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/10 13:59
 * @Author: Ling Chen
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Person zhang = (Person) ProxyFactory.getCglibProxyInstance(Person.class);
        System.out.println(zhang.sleep());
        System.out.println(zhang.wake());
    }

    /**
     * 输出：
     * 2019-11-10T06:01:13.105Z
     * 晚安晚安
     * 2019-11-10T06:01:13.115Z
     * 早鸭
     */
}
