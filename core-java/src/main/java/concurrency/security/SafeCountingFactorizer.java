package concurrency.security;

import concurrency.MyServlet;
import concurrency.annoations.ThreadSafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: fresh-languages
 * @Date: 2019/5/28 23:05
 * @Author: Ling Chen
 * @Description:
 */
@ThreadSafe
public class SafeCountingFactorizer implements MyServlet {

    private final AtomicInteger count = new AtomicInteger(0);

    @Override
    public void service(String request, String response) {
        System.out.println("request: " + request + " response: " + response);
        count.incrementAndGet();
    }
}
