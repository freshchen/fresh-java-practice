package concurrency.aqstools;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: fresh-languages
 * @Date: 2019/6/4 21:14
 * @Author: Ling Chen
 * @Description:
 */
@Slf4j
public class ReentrantLockTest {

    private static int count = 0;

    public void usage1(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        Lock lock = new ReentrantLock();
        int thradCount = 10000;
        for (int i = 0; i < thradCount; i++) {
            executorService.execute(() -> {
                try {
                    lock.lock();
                    ++count;
                }finally {
                    lock.unlock();
                }
            });
        }
        executorService.shutdown();
        log.info("final count is [{}]", count);
    }

    public static void main(String[] args) {
        ReentrantLockTest test = new ReentrantLockTest();
        test.usage1();
    }
}
