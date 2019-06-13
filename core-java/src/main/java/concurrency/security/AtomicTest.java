package concurrency.security;

import concurrency.MockConcurrency;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @anthor LingChen
 * @create 5/31/2019 10:09 AM
 * @Description
 */
@Slf4j
public class AtomicTest {

    AtomicBoolean result = new AtomicBoolean(false);
    AtomicLong count = new AtomicLong(0);

    public void changeBoolean() {
        if (result.compareAndSet(false, true)) {
            log.info("i am changing the result !!!");
        }
    }

    public void add(){
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        AtomicTest test = new AtomicTest();
        MockConcurrency mock = new MockConcurrency(5000, 50);
        // 可以看到只执行了一次
        mock.mockSingle(test, "changeBoolean");

        mock.mockSingle(test, "add");
        log.info("The count is: {}", test.count);
    }
}
