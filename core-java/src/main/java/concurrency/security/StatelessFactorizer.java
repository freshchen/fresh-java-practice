package concurrency.security;

import concurrency.MyServlet;
import concurrency.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: fresh-languages
 * @Date: 2019/5/28 22:05
 * @Author: Ling Chen
 * @Description: 无状态对象一定是线程安全的，无状态对象不包含任何域，也不包含其他类中域的引用。
 */
@ThreadSafe
@Slf4j
public class StatelessFactorizer implements MyServlet {

    @Override
    public void service(String request, String response) {
        System.out.println("request: " + request + " response: " + response);
    }

}
