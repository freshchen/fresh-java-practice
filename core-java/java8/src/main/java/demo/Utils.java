package demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author chenling
 */
public class Utils {

    public static synchronized void invokeAllCases(Class<?> clz) {
        Method[] methods = clz.getMethods();
        Arrays.asList(methods).stream()
                .filter(method -> method.getName().startsWith("case"))
                .forEach(method -> {
                    try {
                        System.out.println("Case Name: " + method.getName());
                        method.invoke(null, null);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                });
    }
}
