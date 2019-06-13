package concurrency.aqstools;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: fresh-languages
 * @Date: 2019/6/4 21:51
 * @Author: Ling Chen
 * @Description:
 */
public class ReentrantReadWriteLockTest {

    private Map<String, String> stringStringMap = new HashMap<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock readLock = lock.readLock();
    private Lock writeLock = lock.writeLock();

    public Set<String> getKeys() {
        try {
            readLock.lock();
            return stringStringMap.keySet();
        } finally {
            readLock.unlock();
        }
    }

    public String put(String key, String value) {
        try {
            writeLock.lock();
            return stringStringMap.put(key, value);
        } finally {
            writeLock.unlock();
        }

    }

}
