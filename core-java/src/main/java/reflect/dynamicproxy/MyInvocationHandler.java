package reflect.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @anthor LingChen
 * @create 2018-07-03-15:08
 * 动态代理
 * 每一个动态代理类都必须要实现InvocationHandler这个接口，并且每个代理类的实例都关联到了一个handler
 * 当我们通过代理对象调用一个方法的时候
 * 这个方法的调用就会被转发为由InvocationHandler这个接口的 invoke 方法来进行调用。
 * Proxy这个类的作用就是用来动态创建一个代理对象的类
 * newProxyInstance 这个方法就是得到一个动态的代理对象
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object obj = null;

    public Object bind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object temp = method.invoke(this.obj, args);
        return temp;
    }
}
