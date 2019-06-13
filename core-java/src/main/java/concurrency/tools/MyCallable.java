package concurrency.tools;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

/**
 * @anthor LingChen
 * @create 6/5/2019 1:38 PM
 * @Description
 */
@Slf4j
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        log.info("do something");
        Thread.sleep(5000);
        return "Done";
    }
}
