package reflect.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @anthor LingChen
 * @create 2018-07-02-23:04
 * 通过Class调用其他类中的构造函数 （也可以通过这种方式通过Class创建其他类的对象）
 */
public class Constructors {
    public static void main(String[] args) {

        Class<?> personClass = null;
        try {
            personClass = Class.forName("reflect.constructor.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person person1 = null;
        Person person2 = null;
        Person person3 = null;
        //获取全部的构造函数,构造方法栈存储，调用顺序与定义顺序相反
        Constructor<?> cons[] = personClass.getConstructors();
        System.out.println("we have " + cons.length + " kind of constructor");
        try {
            person1 = (Person) cons[0].newInstance(22);
            person2 = (Person) cons[1].newInstance("freshchen");
            person3 = (Person) cons[2].newInstance("freshchen", 23);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}
