package concurrency.security;

import concurrency.MyServlet;
import concurrency.annoations.NotThreadSafe;

/**
 * @program: fresh-languages
 * @Date: 2019/5/28 22:31
 * @Author: Ling Chen
 * @Description: 不是线程安全的，++count不是原子操作
 */
@NotThreadSafe
public class UnsafeCountingFactorizer implements MyServlet {

    private long count = 0;

    @Override
    public void service(String request, String response) {
        System.out.println("request: " + request + " response: " + response);
        ++count;
    }
}
