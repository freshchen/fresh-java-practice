package concurrency.read;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * @author darcy
 * @since 2020/04/01
 **/
public class ReentrantLockDemo {

    // 默认是非公平锁和 synchronized 一样
    private static ReentrantLock reentrantLock = new ReentrantLock();

    public void printThreadInfo(int num) {
        reentrantLock.lock();
        try {
            System.out.println(num + " : " + Thread.currentThread().getName());
            System.out.println(num + " : " + Thread.currentThread().toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.rangeClosed(0, 5)
                .forEach(num -> executorService
                        .execute(() -> new ReentrantLockDemo().printThreadInfo(num))
                );
    }

    /**
     * 输出:
     * 0 : pool-1-thread-1
     * 0 : Thread[pool-1-thread-1,5,main]
     * 3 : pool-1-thread-4
     * 3 : Thread[pool-1-thread-4,5,main]
     * 1 : pool-1-thread-2
     * 1 : Thread[pool-1-thread-2,5,main]
     * 2 : pool-1-thread-3
     * 2 : Thread[pool-1-thread-3,5,main]
     * 4 : pool-1-thread-5
     * 4 : Thread[pool-1-thread-5,5,main]
     * 5 : pool-1-thread-6
     * 5 : Thread[pool-1-thread-6,5,main]
     */
}
