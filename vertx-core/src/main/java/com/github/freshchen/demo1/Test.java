package com.github.freshchen.demo1;

import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.FileSystem;
import java.util.Random;

public class Test {

    public int count;

    public synchronized int add() {
        System.out.println(++count);
        return count;
    }

    public static void sync() {
        MockConcurrency concurrency = new MockConcurrency(50, 10);
        concurrency.mockSingle(new Test(), "add");
    }

    /**
     * 定时器事件
     */
    public static void case1() {
        Vertx vertx = Vertx.vertx();
        vertx.setPeriodic(1000, id -> {
            System.out.println("Hello");
        });
    }

    /**
     * 运行阻塞代码
     */
    public static void case2() {
        Vertx vertx = Vertx.vertx();
        vertx.executeBlocking(promise -> {
            sync();
        }, res -> {
        });
    }

    /**
     * 自定义worker pool运行阻塞代码
     */
    public static void case3() {
        Vertx vertx = Vertx.vertx();
        WorkerExecutor executor = vertx.createSharedWorkerExecutor("my-worker-pool");
        executor.executeBlocking(promise -> {
            sync();
        }, res -> {
        });
        executor.close();
    }

    /**
     * 异步组合
     */
    public static void case4() {
        int num = new Random().nextInt();
        Future<Boolean> booleanFuture1 = Future.future(promise -> promise.complete(num > 0));
        Future<Boolean> booleanFuture2 = Future.future(promise -> promise.complete(num < 100));

        CompositeFuture.all(booleanFuture1, booleanFuture2).setHandler(ar -> {
            if (booleanFuture1.result() && booleanFuture2.result()) {
                System.out.println("Success" + num);
            } else {
                System.out.println("failed" + num);
            }
        });
    }

    /**
     * 链式组合
     */
    public static void case5() {
        Vertx vertx = Vertx.vertx();
        FileSystem fs = vertx.fileSystem();

        Future<Void> fut1 = Future.future(promise -> fs.createFile("/foo", promise));

        Future<Void> startFuture = fut1
                .compose(v -> {
                    // When the file is created (fut1), execute this:
                    return Future.<Void>future(promise -> fs.writeFile("/foo", Buffer.buffer(), promise));
                })
                .compose(v -> {
                    // When the file is written (fut2), execute this:
                    return Future.future(promise -> fs.move("/foo", "/bar", promise));
                });
    }

    public static void main(String[] args) {
//        Test.case1();
//        Test.sync();
//        Test.case3();
        Test.case4();
    }
}
