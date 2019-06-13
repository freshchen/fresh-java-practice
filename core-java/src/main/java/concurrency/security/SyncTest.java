package concurrency.security;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: fresh-languages
 * @Date: 2019/5/31 19:40
 * @Author: Ling Chen
 * @Description:
 */
@Slf4j
public class SyncTest {

    // 修饰方法,作用范围当前对象
    public synchronized void test1() {
        for (int i = 0; i < 10; i++) {
            log.info("test1 count : {}", i + 1);
        }
    }

    // 修饰代码块,作用范围当前对象
    public void test2() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                log.info("test2 count : {}", i + 1);
            }
        }
    }

    // 修饰静态方法,作用范围类所有对象
    public static synchronized void test3() {
        for (int i = 0; i < 10; i++) {
            log.info("test2 count : {}", i + 1);
        }

    }

    // 修饰类,作用范围类所有对象
    public void test4() {
        synchronized (SyncTest.class) {
            for (int i = 0; i < 10; i++) {
                log.info("test2 count : {}", i + 1);
            }
        }
    }

}
