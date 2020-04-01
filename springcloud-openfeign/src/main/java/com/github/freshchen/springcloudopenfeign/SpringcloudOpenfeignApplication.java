package com.github.freshchen.springcloudopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringcloudOpenfeignApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringcloudOpenfeignApplication.class, args);
    }

}
