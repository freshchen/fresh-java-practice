package concurrency.tools;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @anthor LingChen
 * @create 6/5/2019 1:51 PM
 * @Description
 */
@Slf4j
public class FutureTaskTest {

    public void usage1() throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<String>(() ->{
            log.info("future task do something ");
            Thread.sleep(5000);
            return "Done";
        });

        new Thread(futureTask).start();
        String result = futureTask.get();
        log.info("result is : [{}]", result);
    }



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTaskTest test = new FutureTaskTest();
        test.usage1();
    }
}
