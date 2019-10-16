package study;

import java.util.concurrent.locks.LockSupport;

/**
 * @anthor LingChen
 * @create 10/16/2019 5:47 PM
 * @Description
 */
public class LockSupportTest {

    public static void main(String[] args) {


        Thread thread = new Thread(() -> {
            System.out.println("1");
            LockSupport.park();
            System.out.println("3");
        });

        thread.start();
        new Thread(() -> {
            System.out.println("2");
            LockSupport.unpark(thread);
        }).start();




    }
}
