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
    public void set(@PathVariable String key,@PathVariable Object value){
        redisUtil.set(key,value);
    }
}
