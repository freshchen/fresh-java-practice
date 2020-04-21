package demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author darcy
 * @since 2020/04/08
 **/
public class Tes {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        condition.await();
        new Thread(() -> {
            reentrantLock.lock();
            System.out.println( Thread.currentThread().getName() + "拿到锁了");
            System.out.println( Thread.currentThread().getName() + "开始睡");
            try {
                Thread.sleep(1111);
            } catch (InterruptedException e) {
            }
            System.out.println( Thread.currentThread().getName() + "释放锁");
            reentrantLock.unlock();
        }, "线程1").start();

        Thread.sleep(10);

        Thread thread2 = new Thread(() -> {
            try {
                reentrantLock.lockInterruptibly();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( Thread.currentThread().getName() + "拿到锁了");
        }, "线程2");

        thread2.start();

        Thread.sleep(10);
        thread2.interrupt();
    }
}
