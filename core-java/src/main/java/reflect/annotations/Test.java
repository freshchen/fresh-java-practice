package reflect.annotations;

public class Test {

    public static void main(String[] args) {
        Action person1 = (Action) Proxys.getProxy(new Person("匿名"));
        person1.order();
        Action person2 = (Action) Proxys.getProxy(new Person("Sun"));
        person2.order();
    }

    /**
     * 输出：
     * 你好,服务员
     * 可以给我一个汉堡包么？
     * Exception in thread "main" java.lang.IllegalArgumentException: Person Name is not chinese
     * 	at reflect.annotations.Proxys.invoke(Proxys.java:32)
     * 	at com.sun.proxy.$Proxy0.order(Unknown Source)
     * 	at reflect.annotations.Test.main(Test.java:9)
     */
}
