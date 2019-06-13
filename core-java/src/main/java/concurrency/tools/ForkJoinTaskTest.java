package concurrency.tools;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @anthor LingChen
 * @create 6/5/2019 3:22 PM
 * @Description
 */
@Slf4j
public class ForkJoinTaskTest extends RecursiveTask<Integer> {

    private static final int threshld = 2;
    private int start;
    private int end;

    public ForkJoinTaskTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;

        boolean canComputer = (end - start) <= threshld;
        if (canComputer) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            int middle = (end + start) / 2;
            ForkJoinTaskTest left = new ForkJoinTaskTest(start, middle);
            ForkJoinTaskTest right = new ForkJoinTaskTest(middle + 1, end);

            left.fork();
            right.fork();
            int leftResult = left.join();
            int rightResult = right.join();

            sum = leftResult + rightResult;
        }
        return sum;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTaskTest taskTest = new ForkJoinTaskTest(1, 1000);
        Future<Integer> result = forkJoinPool.submit(taskTest);
        log.info("result is : [{}]", result.get());
    }
}
