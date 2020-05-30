package com.example.springbootcache.controller;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author darcy
 * @since 2020/04/23
 **/
@RestController
@CacheConfig(cacheNames = {"CacheController"})
public class CacheController {

    @Cacheable(key = "#id")
    @RequestMapping("/api/{id}")
    public int get(@PathVariable Integer id) {
        System.out.println(id);
        int i = new Random().nextInt();
        System.out.println(i);
        return i;
    }
}
