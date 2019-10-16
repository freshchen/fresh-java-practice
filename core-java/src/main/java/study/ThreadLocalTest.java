package study;

import java.util.concurrent.CountDownLatch;

/**
 * @anthor LingChen
 * @create 10/15/2019 10:12 AM
 * @Description
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);

        Thread thread1 = new Thread(() -> {
            ThreadLocal<String> local = new ThreadLocal<>().withInitial(() -> "我叫小王");
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(local.get());
            local.remove();
        });

        Thread thread2 = new Thread(() -> {
            ThreadLocal<String> local = new ThreadLocal<>().withInitial(() -> "我叫小李");
            local.set("我叫小李");
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(local.get());
            local.remove();
        });

        thread1.start();
        thread2.start();

        latch.countDown();

    }
}
