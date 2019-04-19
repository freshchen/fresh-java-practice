package com.ecnu.springbootredis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @anthor LingChen
 * @create 4/19/2019 1:31 PM
 * @Description
 */
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate <String, Object> redisTemplate;

    private static String SUCCESS = "success";
    private static String FAILURE = "failure";

    /**
     * set expiration time for key
     *
     * @param key
     * @param time
     * @return
     */
    public String expire(String key, long time) {
        try {
            if (time > 0) {
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return FAILURE;
        }
    }

    /**
     * get key expiration time
     *
     * @param key
     * @return
     */
    public long getExpire(String key) {
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }


    /**
     * judge the key exist?
     *
     * @param key
     * @return true or false
     */
    public boolean hasKey(String key) {
        try {
            return redisTemplate.hasKey(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * String
     * set key value
     * @param key
     * @param value
     * @return
     */
    public String set(String key, Object value) {

        try {
            redisTemplate.opsForValue().set(key, value);
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return FAILURE;
        }
    }

    /**
     * String
     * get the value
     * @param key
     * @return
     */
    public Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * set  key value and  expire time
     * @param key
     * @param value
     * @param time
     * @return
     */
    public String  set(String key, Object value, long time) {
        try {
            if (time > 0) {
                redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
            } else {
                set(key, value);
            }
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return FAILURE;
        }
    }

    /**
     * increase
     * @param key
     * @param delta
     * @return
     */
    public long incr(String key, long delta) {
        return redisTemplate.opsForValue().increment(key, delta);
    }

    /**
     * decrease
     * @param key
     * @param delta
     * @return
     */
    public long decr(String key, long delta) {
        return redisTemplate.opsForValue().decrement(key, delta);
    }


}
