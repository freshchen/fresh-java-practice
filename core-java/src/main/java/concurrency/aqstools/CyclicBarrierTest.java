package concurrency.aqstools;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: fresh-languages
 * @Date: 2019/6/4 20:54
 * @Author: Ling Chen
 * @Description:
 */
@Slf4j
public class CyclicBarrierTest {

    public void usage1(){
        CyclicBarrier barrier = new CyclicBarrier(5, () ->{
            log.info("start running");
        });
        int threadCount = 20;
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadCount; i++) {
            final int index = i;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(() -> {
                log.info("Thead [{}] is comming", index);
                try {
                    barrier.await();
                    log.info("Thead [{}] finished", index);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
    }

    public static void main(String[] args) {
        CyclicBarrierTest test = new CyclicBarrierTest();
        test.usage1();
    }
}
