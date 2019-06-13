package reflect.dynamicproxy;

/**
 * @anthor LingChen
 * @create 2018-07-03-15:05
 */
public class RealSubject implements Subject {

    @Override
    public String say(String name, int age) {
        return name + " is " + age + " years old";
    }
}
