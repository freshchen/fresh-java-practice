package concurrency.security;

import concurrency.MockConcurrency;
import concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: fresh-languages
 * @Date: 2019/5/29 22:27
 * @Author: Ling Chen
 * @Description:
 */
@NotThreadSafe
@Slf4j
public class ConcurrencyTest {

    private int count = 0;

    public void add(){
        ++count;
    }

    public static void main(String[] args)  {
        ConcurrencyTest test = new ConcurrencyTest();
        MockConcurrency mock = new MockConcurrency(5000, 50);
        mock.mockSingle(test, "add");
        log.info("count: {}", test.count);
    }

}
