package concurrency.aqstools;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @program: fresh-languages
 * @Date: 2019/6/3 21:40
 * @Author: Ling Chen
 * @Description: 可以设置等待时间
 */
@Slf4j
public class CountDownLatchTest {

    private final static int threadcount = 100;

    public void usage1(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(threadcount);
        for (int i = 0; i < threadcount; i++) {
            int num = i;
            executorService.execute(() -> {
                log.info("i : {}", num);
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("finished !");
        executorService.shutdown();
    }

    public void usage2(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(threadcount);
        for (int i = 0; i < threadcount; i++) {
            int num = i;
            executorService.execute(() -> {
                try {
                    Thread.sleep(51);
                    log.info("i : {}", num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await(50, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("finished !");
        executorService.shutdown();
    }


    public static void main(String[] args) {
        CountDownLatchTest test = new CountDownLatchTest();
        //test.usage1();
        test.usage2();
    }
}
