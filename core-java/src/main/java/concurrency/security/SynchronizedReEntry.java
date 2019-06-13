package concurrency.security;

/**
 * @program: fresh-languages
 * @Date: 2019/5/28 23:27
 * @Author: Ling Chen
 * @Description: 内置锁是可重入锁的例子,如果不是可重入则此段代码死锁。
 */
public class SynchronizedReEntry {

    public synchronized void say(){
        System.out.println("hello");
    }
}

class SynchronizedReEntrySon extends SynchronizedReEntry {

    public synchronized void say(){
        System.out.println("hello father");
        super.say();
    }
}
