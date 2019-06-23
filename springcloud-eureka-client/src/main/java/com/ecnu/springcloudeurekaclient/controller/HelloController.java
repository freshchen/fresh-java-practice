package com.ecnu.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/23 16:22
 * @Author: Ling Chen
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("hello")
    public String hello(){
        return client.description();
    }
}
