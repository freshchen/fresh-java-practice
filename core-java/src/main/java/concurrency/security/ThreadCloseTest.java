package concurrency.security;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: fresh-languages
 * @Date: 2019/6/2 20:21
 * @Author: Ling Chen
 * @Description: 利用Threadlocal实现线程封闭
 */
@Slf4j
public class ThreadCloseTest {

    private final static ThreadLocal<Long> LONG_THREAD_LOCAL = new ThreadLocal<>();

    public void set(Long id){
        LONG_THREAD_LOCAL.set(id);
    }

    public Long get(){
        return LONG_THREAD_LOCAL.get();
    }

    public void remove(){
        LONG_THREAD_LOCAL.remove();
    }
}
