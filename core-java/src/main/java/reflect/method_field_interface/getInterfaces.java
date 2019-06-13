package reflect.method_field_interface;

/**
 * @anthor LingChen
 * @create 2018-07-02-23:19
 * 返回一个类实现的接口
 */
public class getInterfaces {
    public static void main(String[] args) {
        Class<?> personClass = Person.getMyClass();
        //保存所有的接口
        Class<?> intes[] = personClass.getInterfaces();

        for (int i = 0; i < intes.length; i++) {
            System.out.println("implement interface： " + intes[i].getName());
        }
    }
}
