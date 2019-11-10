package proxy.demo1.state;


/**
 * @program: fresh-java-practice
 * @Date: 2019/11/9 16:46
 * @Author: Ling Chen
 * @Description:
 */
public class ProxyFactory {

    public static Proxy getLifeServiceProxy(Class clz) {
        LifeService target = null;
        try {
            target = (LifeService) clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return new Proxy(target);
    }
}
