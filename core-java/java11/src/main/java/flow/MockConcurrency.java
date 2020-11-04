package flow;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;
import java.util.function.Supplier;

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

    public void mockSingle(Supplier supplier) {
        log.info("requestTotal: {} threadTotal: {}", requestTotal, threadTotal);
        long time = System.currentTimeMillis();
        for (int i = 0; i < requestTotal; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    supplier.get();
                    semaphore.release();
                } catch (InterruptedException e) {
                    log.error("InterruptedException: {}", e);
                }
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            log.error("InterruptedException: {}", e);
        }

        try {
            log.info("attempt to shutdown executor");
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            log.error("tasks interrupted");
        } finally {
            if (!executorService.isTerminated()) {
                log.info("cancel non-finished tasks");
            }
            executorService.shutdownNow();
            log.info("shutdown finished");
        }
        long l = System.currentTimeMillis() - time;
        System.out.println("耗时 " + l);
    }

}
