package com.ecnu.springbootredis.controller;

import com.ecnu.springbootredis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @anthor LingChen
 * @create 4/19/2019 4:34 PM
 * @Description
 */
@RestController
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/redis/set/{key}/{value}")
    public String set(@PathVariable String key, @PathVariable Object value) {
        return redisUtil.set(key, value);
    }

    @RequestMapping("/redis/set/{key}/{value}/{time}")
    public String set(@PathVariable String key, @PathVariable Object value, @PathVariable long time) {
        return redisUtil.set(key, value, time);
    }

    @RequestMapping("/redis/get/{key}")
    public Object get(@PathVariable String key) {
        return redisUtil.get(key);
    }

    @RequestMapping("/redis/expire/get/{key}")
    public Object getExpire(@PathVariable String key) {
        return redisUtil.getExpire(key);
    }

}
