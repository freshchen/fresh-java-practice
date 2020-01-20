package com.example.springcloudcontractprovider.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/user")
    public User hello(){
        return new User("xiang",22);
    }
}
