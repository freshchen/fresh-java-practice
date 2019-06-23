package com.ecnu.springcloudribbon;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: fresh-java-practice
 * @Date: 2019/6/23 20:28
 * @Author: Ling Chen
 * @Description:
 */
@Configuration
public class ConsumerConfig {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
