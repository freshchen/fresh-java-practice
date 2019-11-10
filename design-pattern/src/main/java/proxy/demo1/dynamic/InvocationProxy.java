package proxy.demo1.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.Clock;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/9 16:21
 * @Author: Ling Chen
 * @Description:
 */
public class InvocationProxy implements InvocationHandler {

    // 被监控的对象（此例中为Person类实例）
    private LifeService lifeService;

    // 监控启动拿到需要被监控的对象
    public InvocationProxy(LifeService lifeService) {
        this.lifeService = lifeService;
    }

    /**
     * 监控的行为发生时，JVM会拦截到行为执行invoke
     *
     * @param proxy  监控对象：监控行为是否发生
     * @param method 被监控的行为方法
     * @param args   被监控行为方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 因为我们拦截了行为，并且加了一些次要行为，完成之后我们要替被拦截行为把值返回
        Object result = null;

        String methodName = method.getName();
        if ("sleep".equals(methodName)) {
            result = getTime();
            result += (String) method.invoke(this.lifeService, args);
        } else if ("wake".equals(methodName)) {
            result = getTime();
            result += (String) method.invoke(this.lifeService, args);
        }
        return result;
    }

    // 辅助行为
    private String getTime() {
        return Clock.systemDefaultZone().instant().toString() + "\n";
    }

}
