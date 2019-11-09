package study;

/**
 * @anthor LingChen
 * @create 10/14/2019 3:50 PM
 * @Description
 */
public class ThreadInterruptTest {

    /**
     * 如果我们同时调用了notify和interrupt方法，程序有可能正常执行结束，有可能抛出异常结束,
     * 原因是不管是因为notify还是interrupt,线程离开了等待池，都需要去竞争锁,
     * 如果interrupt调用瞬间拿到锁，notify还没有调用，就抛中断异常
     * 如果是interrupt调用瞬间拿不到锁，此时中断标志位被重置，然后notify把线程拉到正常轨道，就继续执行不抛中断异常
     */
    private static void testInterrupt() {
        Object object = new Object();
        Thread thread1 = new Thread(() -> {
            synchronized (object) {
                try {
                    object.wait();
                    System.out.println("我还活着！");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }

            }

        });

        thread1.start();

        new Thread(() -> {
            // 只为了演示，实际很少用到这些方法，而且我们在执行中断的同步代码块中最好不要做别的事情，例如这里的notify
            synchronized (object) {
                thread1.interrupt();
                object.notify();
            }
        }).start();
    }

    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            ThreadInterruptTest.testInterrupt();
        }

    }
}

/**
 * 输出：
 * 我还活着！
 * java.lang.InterruptedException
 * 	at java.lang.Object.wait(Native Method)
 * 	at java.lang.Object.wait(Object.java:502)
 * 	at study.ThreadInterruptTest.lambda$testInterrupt$0(ThreadInterruptTest.java:15)
 * 	at java.lang.Thread.run(Thread.java:748)
 * java.lang.InterruptedException
 * 	at java.lang.Object.wait(Native Method)
 * 	at java.lang.Object.wait(Object.java:502)
 * 	at study.ThreadInterruptTest.lambda$testInterrupt$0(ThreadInterruptTest.java:15)
 * 	at java.lang.Thread.run(Thread.java:748)
 * 我还活着！
 * java.lang.InterruptedException
 * 	at java.lang.Object.wait(Native Method)
 * 	at java.lang.Object.wait(Object.java:502)
 * 	at study.ThreadInterruptTest.lambda$testInterrupt$0(ThreadInterruptTest.java:15)
 * 	at java.lang.Thread.run(Thread.java:748)
 *
 */