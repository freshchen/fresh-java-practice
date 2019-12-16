package reflect.annotations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @author : freshchen
 * <P>Created on 2019-12-16 21:27 </p>
 **/
public class Proxys implements InvocationHandler {

    private Object target;

    public Proxys(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (this.target instanceof Person) {
            Person person = (Person) this.target;
            if (person.getClass().getDeclaredField("name").isAnnotationPresent(Chinese.class)){
                if (Objects.nonNull(person.getName()) && !person.getName().matches("[\\u4E00-\\u9FA5]+")) {
                    throw new IllegalArgumentException("Person Name is not chinese");
                }
            }
            Method targetMethod = person.getClass().getMethod(methodName);
            if ("order".equals(methodName)) {
                if (targetMethod.isAnnotationPresent(Hello.class)) {
                    System.out.println("服务员你好," + targetMethod.getAnnotation(Hello.class).value());
                } else if (method.isAnnotationPresent(Hello.class)) {
                    System.out.println("服务员你好," + method.getAnnotation(Hello.class).value());
                }
                return method.invoke(this.target, args);
            }
        }
        return null;
    }

    public static Object getProxy(Object action) {
        Proxys handler = new Proxys(action);
        return Proxy.newProxyInstance(
                action.getClass().getClassLoader(),
                action.getClass().getInterfaces(),
                handler);
    }
}
