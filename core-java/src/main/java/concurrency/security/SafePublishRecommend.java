package concurrency.security;

import concurrency.annoations.ThreadSafe;

/**
 * @program: fresh-languages
 * @Date: 2019/6/2 14:31
 * @Author: Ling Chen
 * @Description: 枚举单例，JVM保证安全的
 */
@ThreadSafe
public class SafePublishRecommend {

    public static SafePublishRecommend getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;
        private SafePublishRecommend safePublishRecommend;
        Singleton(){
            safePublishRecommend = new SafePublishRecommend();
        }

        public SafePublishRecommend getInstance(){
            return safePublishRecommend;
        }
    }

    private SafePublishRecommend() {
    }
}
