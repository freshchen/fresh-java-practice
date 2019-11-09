package singleton;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/23 23:07
 * @Author: Ling Chen
 * @Description:饿汉式
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private HungrySingleton() {
    }
}
