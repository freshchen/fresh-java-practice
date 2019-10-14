package study;

/**
 * @anthor LingChen
 * @create 10/14/2019 3:50 PM
 * @Description
 */
public class ThreadTest {

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
            synchronized (object) {
                thread1.interrupt();
                object.notify();

            }
        }).start();
    }

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            ThreadTest.testInterrupt();
        }

    }
}
