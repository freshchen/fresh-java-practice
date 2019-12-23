package com.github.freshchen.demo1;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.*;

/**
 * @anthor LingChen
 * @create 5/31/2019 1:07 PM
 * @Description
 */
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
        for (int i = 0; i < requestTotal; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    testObject.getClass().getMethod(methodName).invoke(testObject);
                    semaphore.release();
                } catch (InterruptedException e) {

                } catch (IllegalAccessException e) {

                } catch (InvocationTargetException e) {

                } catch (NoSuchMethodException e) {

                }
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {

        }

        try {

            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {

        } finally {
            if (!executorService.isTerminated()) {

            }
            executorService.shutdownNow();

        }
    }

}
