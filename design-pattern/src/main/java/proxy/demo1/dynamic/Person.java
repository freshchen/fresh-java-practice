package proxy.demo1.dynamic;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/9 16:17
 * @Author: Ling Chen
 * @Description:
 */
public class Person implements LifeService {
    @Override
    public String sleep() {
        return "晚安晚安";
    }

    @Override
    public String wake() {
        return "早鸭";
    }
}
