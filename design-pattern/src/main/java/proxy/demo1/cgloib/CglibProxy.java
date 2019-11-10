package proxy.demo1.cgloib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.time.Clock;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/10 13:45
 * @Author: Ling Chen
 * @Description:
 */
public class CglibProxy implements MethodInterceptor {
    //需要代理的目标对象
    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    /**
     *
     * @param o 监控对象：监控行为是否发生
     * @param method 被监控的行为方法
     * @param objects 被监控行为方法的参数
     * @param methodProxy 代理中生成的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;

        String methodName = method.getName();
        if ("sleep".equals(methodName)) {
            result = getTime();
            result += (String) method.invoke(this.target, objects);
        } else if ("wake".equals(methodName)) {
            result = getTime();
            result += (String) method.invoke(this.target, objects);
        }
        return result;
    }

    // 辅助行为
    private String getTime() {
        return Clock.systemDefaultZone().instant().toString() + "\n";
    }
}
