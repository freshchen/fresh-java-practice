package reflect.ioc;


import java.lang.reflect.InvocationTargetException;

/**
 * @anthor LingChen
 * @create 2018-07-03-16:18
 */
public class Factory {

    public static Fruit getInstance(String className) {

        Fruit fruit = null;

        try {
            fruit = (Fruit) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return fruit;
    }
}
