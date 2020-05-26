package demo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author darcy
 * @since 2020/04/21
 **/
public class CountDownLatchDemo {

    public void run(CountDownLatch countDownLatch) {
        System.out.println(Thread.currentThread().getName() + "就位");
        countDownLatch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatchDemo countDownLatchDemo = new CountDownLatchDemo();
        CountDownLatch countDownLatch = new CountDownLatch(5);
        IntStream.rangeClosed(0, 4)
                .forEach(num -> executorService
                        .execute(() -> countDownLatchDemo.run(countDownLatch))
                );

        countDownLatch.await();
        System.out.println("已到齐");
    }

    /**
     * 输出：
     * pool-1-thread-2就位
     * pool-1-thread-5就位
     * pool-1-thread-4就位
     * pool-1-thread-3就位
     * pool-1-thread-1就位
     * 已到齐
     */
}
