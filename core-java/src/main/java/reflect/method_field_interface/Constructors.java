package reflect.method_field_interface;

import java.lang.reflect.Constructor;

/**
 * @anthor LingChen
 * @create 2018-07-02-23:30
 * 获得其他类中的全部构造函数
 */
public class Constructors {
    public static void main(String[] args) {

        Class<?> personClass = Person.getMyClass();

        Constructor<?> cons[] = personClass.getConstructors();
        for (int i = 0; i < cons.length; i++) {
            System.out.println("Constructors ： " + cons[i]);
        }
    }

}
