package reflect.method_field_interface;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @program: fresh-core-java
 * @Date: 2019/5/24 0:40
 * @Author: Ling Chen
 * @Description:
 */
public class Methods {

    public void showMethods(Class<?> personClass) {
        Method[] methods = personClass.getMethods();
        int length = methods.length;
        for (int i = 0; i < length; i++) {
            Method method = methods[i];
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" field " + (i + 1));
            stringBuffer.append(Modifier.toString(method.getModifiers()));
            stringBuffer.append(method.getName());
            System.out.println(stringBuffer);
            Arrays.stream(method.getParameterTypes()).forEach(System.out::println);
        }
    }

    public void invokeSayNothing(Class<?> personClass) {
        try {
            Method method = personClass.getMethod("sayNothing");
            method.invoke(personClass.getDeclaredConstructor().newInstance());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void invokeSayNiceToMeetYou(Class<?> personClass) {
        try {
            // 要写参数类型的Class
            Method method = personClass.getMethod("niceToMeetYou", String.class, int.class);
            method.invoke(personClass.getDeclaredConstructor().newInstance(), " ling", 22);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Class<?> personClass = Person.getMyClass();

        Methods method = new Methods();
        method.showMethods(personClass);
        method.invokeSayNothing(personClass);
        method.invokeSayNiceToMeetYou(personClass);


    }

}
