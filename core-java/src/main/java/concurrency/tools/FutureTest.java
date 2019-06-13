package concurrency.tools;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @anthor LingChen
 * @create 6/5/2019 1:39 PM
 * @Description
 */
@Slf4j
public class FutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new MyCallable());
        String result = future.get();
        log.info("result is : [{}]", result);
    }
}
