package concurrency.security;

import concurrency.MyServlet;
import concurrency.annoations.ThreadSafe;

/**
 * @program: fresh-languages
 * @Date: 2019/5/28 23:23
 * @Author: Ling Chen
 * @Description: 线程安全但是性能极差
 */
@ThreadSafe
public class SynchronizedFactorizer implements MyServlet {

    private long count = 0;

    @Override
    public synchronized void service(String request, String response) {
        System.out.println("request: " + request + " response: " + response);
        ++count;
    }
}
