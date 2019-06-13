package reflect.constructor;

/**
 * @anthor LingChen
 * @create 2018-07-02-22:52
 * 通过Class实例化其他类的对象
 * 如果newInstance()没有无参构造器贼报错
 */
public class NullConstructor {
    public static void main(String[] args) {

        Class<?> personClass = null;
        try {
            personClass = Class.forName("reflect.constructor.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person person = null;

        try {
            assert personClass != null;
            person = (Person) personClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        person.setAge(20);
        person.setName("freshchen");
        System.out.println(person);
    }
}
