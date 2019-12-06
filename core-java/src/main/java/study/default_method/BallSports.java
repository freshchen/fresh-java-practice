package study.default_method;

/**
 * @anthor LingChen
 * @create 11/14/2019 2:04 PM
 * @Description
 */
public interface BallSports extends Sports{

    @Override
    default void pingPong() {
        System.out.println("打乒乓球（球类运动）");
    }
}
