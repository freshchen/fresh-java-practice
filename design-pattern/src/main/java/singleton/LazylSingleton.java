package singleton;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/23 22:54
 * @Author: Ling Chen
 * @Description:懒汉式
 */
public class LazylSingleton {

    private static LazylSingleton lazylSingleton;

    public static LazylSingleton getInstance() {
        if (lazylSingleton == null) {
            lazylSingleton = new LazylSingleton();
        }
        return lazylSingleton;
    }

    private LazylSingleton() {
    }

}
