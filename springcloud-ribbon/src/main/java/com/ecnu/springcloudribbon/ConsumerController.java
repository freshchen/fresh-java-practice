package com.ecnu.springcloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/23 20:23
 * @Author: Ling Chen
 * @Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("ribbon-consumer")
    public String hello(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

}
