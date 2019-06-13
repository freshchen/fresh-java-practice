package concurrency.security;

import concurrency.MyServlet;
import concurrency.annoations.NotThreadSafe;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: fresh-languages
 * @Date: 2019/5/28 23:15
 * @Author: Ling Chen
 * @Description: 虽然都是原子操作，但是不能保证两个原子操作之间不会破坏线程安全性
 */
@NotThreadSafe
public class UnsafeSwapFactorizer implements MyServlet {

    private AtomicReference<BigInteger> number1 = new AtomicReference<>();
    private AtomicReference<BigInteger> number2 = new AtomicReference<>();

    @Override
    public void service(String request, String response) {
        BigInteger input = BigInteger.valueOf(Integer.parseInt(request));
        if (input.equals(number2.get())) {
            System.out.println("request: " + request + " response: " + response);
        } else {
            number2.set(number1.get());
            number1.set(input);
        }
    }
}
