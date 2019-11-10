package proxy.demo1.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/9 16:46
 * @Author: Ling Chen
 * @Description:
 */
public class ProxyFactory {

    public static LifeService getLifeServiceProxyInstance(Class clz) throws IllegalAccessException, InstantiationException {
        // 创建被代理对象
        LifeService target = (LifeService) clz.newInstance();
        // 绑定到代理执行器中
        InvocationHandler handler = new InvocationProxy(target);
        // JVM层面对被代理对象进行监控，行为发生就动态创建代理对象处理
        LifeService $proxy = (LifeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        return $proxy;
    }
}
