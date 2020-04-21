package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * @author darcy
 * @since 2020/04/15
 **/
public class ReentrantLockConditionDemo {

    private final ReentrantLock reentrantLock = new ReentrantLock();
    private final Condition wait1 = reentrantLock.newCondition();
    private final Condition wait2 = reentrantLock.newCondition();
    private int wait1Count = 0;
    private int wait2Count = 0;

    public void buy() {
        int price = 999;
        reentrantLock.lock();
        try {
            while (wait1Count++ < 1) {
                System.out.println(Thread.currentThread().getName() + "减500");
                wait1.await();
                price -= 500;
            }
            wait1.signal();
            while (wait2Count++ < 2) {
                System.out.println(Thread.currentThread().getName() + "减100");
                wait2.await();
                price -= 100;
            }
            wait2.signal();
            System.out.println(Thread.currentThread().getName() + "到手价" + price);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ReentrantLockConditionDemo reentrantLockConditionDemo = new ReentrantLockConditionDemo();
        IntStream.rangeClosed(0, 4)
                .forEach(num -> executorService
                        .execute(reentrantLockConditionDemo::buy)
                );
    }

    /**
     * 输出：
     *
     * pool-1-thread-1减500
     * pool-1-thread-2减100
     * pool-1-thread-3减100
     * pool-1-thread-4到手价999
     * pool-1-thread-5到手价999
     * pool-1-thread-1到手价499
     * pool-1-thread-2到手价899
     * pool-1-thread-3到手价899
     */
}
