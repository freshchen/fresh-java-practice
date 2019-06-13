package concurrency.aqstools;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @program: fresh-languages
 * @Date: 2019/6/3 22:48
 * @Author: Ling Chen
 * @Description:
 */
@Slf4j
public class SemaphoreTest {

    private final static int threadcount = 20;

    public void usage1() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(threadcount);
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < threadcount; i++) {
            int num = i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    log.info("i : {}", num);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    public void usage2() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(threadcount);
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < threadcount; i++) {
            int num = i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(() -> {
                try {
                    try {
                        if (semaphore.tryAcquire(10, TimeUnit.MILLISECONDS)){
                            log.info("i : {}", num);
                            semaphore.release();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    public static void main(String[] args) {
        SemaphoreTest test = new SemaphoreTest();
        test.usage2();
    }
}
