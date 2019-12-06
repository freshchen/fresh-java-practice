package study.default_method;

/**
 * @anthor LingChen
 * @create 11/14/2019 10:52 AM
 * @Description
 */
public interface Sports {

    default void pingPong(){
        System.out.println("打乒乓球");
    }

}
