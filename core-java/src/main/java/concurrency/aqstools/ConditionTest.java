package concurrency.aqstools;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @anthor LingChen
 * @create 6/5/2019 1:04 PM
 * @Description
 */
@Slf4j
public class ConditionTest {

    public void usage() {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        CountDownLatch latch = new CountDownLatch(1);

        new Thread(() -> {
            try {
                log.info("thread 1 entry lock queue");
                reentrantLock.lock();
                log.info("thread 1 get lock");
                latch.countDown();
                log.info("thread 1 entry condition queue");
                condition.await();
                log.info("thread 1 get condition");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        }).start();

        new Thread(() -> {
            try {
                latch.await();
                log.info("thread 2 entry lock queue");
                reentrantLock.lock();
                log.info("thread 2 get lock");
                condition.signalAll();
                log.info("thread 2 signal condition queue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        }).start();
    }

    public static void main(String[] args) {
        ConditionTest test = new ConditionTest();
        test.usage();
    }

}
