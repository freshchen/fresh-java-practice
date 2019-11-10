package proxy.demo1.cgloib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/9 16:46
 * @Author: Ling Chen
 * @Description:
 */
public class ProxyFactory {

    public static Object getCglibProxyInstance(Class clz) throws IllegalAccessException, InstantiationException {
        // Enhancer类是CGLib中的一个字节码增强器
        Enhancer enhancer=new Enhancer();
        // 设置被代理类的字节码文件，这里我们关注的不再是接口
        enhancer.setSuperclass(clz);
        // 创建被代理对象
        Object target = clz.newInstance();
        // 绑定到代理执行器中
        CglibProxy proxy = new CglibProxy(target);
        // 设置回调这个代理对象
        enhancer.setCallback(proxy);
        // 生成返回代理对象
        return enhancer.create();
    }
}
