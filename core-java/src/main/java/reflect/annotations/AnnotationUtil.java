package reflect.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface AnnotationUtil {

    static Object excute(Class<?> clz, String methodName) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Method method = clz.getDeclaredMethod(methodName);
        for (Annotation annotation: method.getAnnotations()) {
            if (annotation instanceof Hello){
                System.out.println("Hello " + ((Hello) annotation).value());
            }
        }
        return method.invoke(clz.newInstance());
    }
}
