package study;

/**
 * @anthor LingChen
 * @create 10/12/2019 4:13 PM
 * @Description
 */
public class ObjectWaitNotifyTest {

    private volatile boolean flag = true;

    public static void main(String[] args) {
        ObjectWaitNotifyTest obj = new ObjectWaitNotifyTest();

        new Thread(() -> {
            synchronized (obj) {
                System.out.println("绝食!");
                while (obj.flag == true) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("真香!");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (obj) {
                obj.flag = false;
                obj.notify();
                System.out.println("海底捞走起!");
            }
        }).start();

        /**
         * 输出：
         * 绝食!
         * 海底捞走起!
         * 真香!
         */
    }
}
