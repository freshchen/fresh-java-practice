package concurrency.aqstools;

import java.util.Scanner;
import java.util.concurrent.*;

public class BlockingQueueTest {

    public void case1() throws InterruptedException {
        BlockingQueue queue = new ArrayBlockingQueue(10);
        Consumer consumer = new Consumer(queue);
        new Thread(consumer).start();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            queue.put(s);
        }
    }

    public void case2() throws InterruptedException {
        Delayed el1 = new DelayedElement("nihao1", 2000);
        Thread.sleep(1005);
        Delayed el2 = new DelayedElement("nihao2", 1000);
        Delayed el3 = new DelayedElement("nihao3", 5000);
        Delayed el4 = new DelayedElement("nihao4", 3000);
        BlockingQueue queue = new DelayQueue();
        queue.put(el1);
        queue.put(el2);
        queue.put(el3);
        queue.put(el4);
        Consumer consumer = new Consumer(queue);
        new Thread(consumer).start();

    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueueTest test = new BlockingQueueTest();
        test.case2();

    }

    public static class Consumer implements Runnable {

        private BlockingQueue queue = null;

        public Consumer(BlockingQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("收到消息: " + queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class DelayedElement implements Delayed {

        Object element = null;
        private long startTime = System.currentTimeMillis();
        private long ttl;

        public DelayedElement(Object element, long ttl) {
            this.element = element;
            this.ttl = ttl;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            long remaining = (startTime + ttl) - System.currentTimeMillis();
            return unit.convert(remaining, TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
        }


        @Override
        public String toString() {
            return "DelayedElement{" +
                    "element=" + element +
                    ", startTime=" + startTime +
                    ", ttl=" + ttl +
                    '}';
        }
    }
}
