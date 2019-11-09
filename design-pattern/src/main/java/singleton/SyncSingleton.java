package singleton;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/23 23:03
 * @Author: Ling Chen
 * @Description:
 */
public class SyncSingleton {
    private static SyncSingleton syncSingleton;

    public static SyncSingleton getInstance() {
        if (syncSingleton == null) {
            synchronized (SyncSingleton.class) {
                if (syncSingleton == null) {
                    syncSingleton = new SyncSingleton();
                }
            }
        }
        return syncSingleton;
    }

    private SyncSingleton() {
    }

}
