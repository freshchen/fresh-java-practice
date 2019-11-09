package study;

/**
 * @program: fresh-java-practice
 * @Date: 2019/10/14 22:05
 * @Author: Ling Chen
 * @Description:
 */
public class ThreadJoinTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("你好");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("你更好！");
        });

        thread1.start();

        new Thread(() -> {
            System.out.println("你也好");
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("你最好！！");
        }).start();
    }

    /**
     * 输出：
     * 你好
     * 你也好
     * 你更好！
     * 你最好！！
     */
}
