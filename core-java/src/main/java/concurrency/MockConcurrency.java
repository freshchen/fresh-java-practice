package concurrency;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @anthor LingChen
 * @create 5/31/2019 1:07 PM
 * @Description
 */
@Slf4j
public class MockConcurrency {

    private int requestTotal = 50000;
    private int threadTotal = 50;
    ExecutorService executorService = Executors.newCachedThreadPool();
    final Semaphore semaphore = new Semaphore(threadTotal);
    final CountDownLatch countDownLatch = new CountDownLatch(threadTotal);

    public MockConcurrency(int requestTotal, int threadTotal) {
        this.requestTotal = requestTotal;
        this.threadTotal = threadTotal;
    }

    public void mockSingle(Object testObject, String methodName) {
        log.info("requestTotal: {} threadTotal: {}", requestTotal, threadTotal);
        for (int i = 0; i < requestTotal; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    testObject.getClass().getMethod(methodName).invoke(testObject);
                    semaphore.release();
                } catch (InterruptedException e) {
                    log.error("InterruptedException: {}", e);
                } catch (IllegalAccessException e) {
                    log.error("IllegalAccessException: {}", e);
                } catch (InvocationTargetException e) {
                    log.error("InvocationTargetException: {}", e);
                } catch (NoSuchMethodException e) {
                    log.error("NoSuchMethodException: {}", e);
                }
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            log.error("InterruptedException: {}", e);
        }
        executorService.shutdown();
    }

}
