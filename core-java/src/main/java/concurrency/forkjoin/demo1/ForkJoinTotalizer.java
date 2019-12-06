package concurrency.forkjoin.demo1;

import concurrency.tools.ForkJoinTaskTest;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * @anthor LingChen
 * @create 11/12/2019 1:55 PM
 * @Description
 */
public class ForkJoinTotalizer extends RecursiveTask<Long> {

    private final long[] numbers;
    private final int start;
    private final int end;

    public static final long THRESHOLD = 1000;

    public ForkJoinTotalizer(long[] numbers) {
        this(numbers, 0, numbers.length);
    }


    public ForkJoinTotalizer(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }


    @Override
    protected Long compute() {
        int len = end -start;
        if (len <= THRESHOLD){
            return computeSequentially();
        }
        int mid = start + len >> 2;
        ForkJoinTaskTest left = new ForkJoinTaskTest(start, mid);
        ForkJoinTaskTest right = new ForkJoinTaskTest(mid + 1, end);

        left.fork();
        right.fork();
        long leftResult = left.join();
        long rightResult = right.join();

        return leftResult + rightResult;
    }

    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] numbers = LongStream.rangeClosed(1, 10001).toArray();
        ForkJoinTask<Long> task = new ForkJoinTotalizer(numbers);
        System.out.println(new ForkJoinPool().invoke(task));
    }
}
