package concurrency.security;

import concurrency.annoations.ThreadSafe;

/**
 * @program: fresh-languages
 * @Date: 2019/6/2 14:09
 * @Author: Ling Chen
 * @Description: 饿汉单例模式性能不行虽然可以满足线程安全。
 * 传统的双检查懒汉单例模式也不能满足线程安全
 * 主要原因是：
 * 对象发布主要有三步 1.分配内存空间 2初始化对象 3引用指向分配的内存
 * 由于指令重排的存在，可能出现132的顺序，多线程环境下，可能出现 instance != null  但是初始化工作还没完成的情况
 * 在占有锁的线程没有完成初始化时，另一个线程认为以及初始化完毕了去使用对象的时候便会有问题
 * 加上 volatile 关键字就可以解决指令重排的问题
 */
@ThreadSafe
public class SafePublish {

    private SafePublish() {
    }

    private volatile static SafePublish instance = null;

    public static SafePublish getInstance() {
        if (instance == null) {
            synchronized (SafePublish.class) {
                if (instance == null){
                    instance = new SafePublish();
                }
            }
        }
        return instance;
    }
}
