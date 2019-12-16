package reflect.annotations;

public class Test {

    public static void main(String[] args) {
        Action person = (Action) Proxys.getProxy(new Person("匿名"));
        person.order();
    }
}
