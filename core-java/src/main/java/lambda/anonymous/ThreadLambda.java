package lambda.anonymous;

/**
 * @program: fresh-languages
 * @Date: 2019/5/26 23:14
 * @Author: Ling Chen
 * @Description:
 */
public class ThreadLambda {

    private void thread1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Old way to run a thread");
            }
        }).start();
    }

    private void thread2() {
        new Thread(() -> {
            System.out.println("New way to run a thread");
            System.out.println("short");
        }).start();
    }

    public static void main(String[] args) {
        ThreadLambda threadLambda = new ThreadLambda();
        threadLambda.thread1();
        threadLambda.thread2();
    }
}
