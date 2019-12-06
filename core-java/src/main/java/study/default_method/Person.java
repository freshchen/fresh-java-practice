package study.default_method;

/**
 * @anthor LingChen
 * @create 11/14/2019 1:35 PM
 * @Description
 */
public class Person implements Sports, Programs {
    @Override
    public void pingPong() {
        Programs.super.pingPong();
    }
}
