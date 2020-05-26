package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

/**
 * @author darcy
 * @since 2020/04/21
 **/
public class SemaphoreDemo {

    public void shop(Semaphore semaphore) {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "进店");
            Thread.sleep(1000);
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + "离店");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Semaphore semaphore = new Semaphore(2);
        IntStream.rangeClosed(0, 5)
                .forEach(num -> executorService
                        .execute(() -> new SemaphoreDemo().shop(semaphore))
                );
    }

    /**
     * 输出：
     * pool-1-thread-1进店
     * pool-1-thread-2进店
     * pool-1-thread-2离店
     * pool-1-thread-3进店
     * pool-1-thread-1离店
     * pool-1-thread-4进店
     * pool-1-thread-4离店
     * pool-1-thread-6进店
     * pool-1-thread-5进店
     * pool-1-thread-3离店
     * pool-1-thread-6离店
     * pool-1-thread-5离店
     */
}
