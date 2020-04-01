package com.github.freshchen.springcloudopenfeign.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * @author darcy
 * @since 2020/03/24
 **/
@Configuration
public class ClientInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("token", "this is an apple");
    }
}
