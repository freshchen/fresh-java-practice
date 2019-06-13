package reflect.method_field_interface;

/**
 * @anthor LingChen
 * @create 2018-07-02-23:26
 * 取得其他类中的父类
 */
public class SupreClass {
    public static void main(String[] args) {

        Class<?> personClass = Person.getMyClass();
        //取得父类
        Class<?> superClass = personClass.getSuperclass();
        System.out.println("extend class：  " + superClass.getName());
    }
}
