package com.ecnu.springbootmvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/22 17:31
 * @Author: Ling Chen
 * @Description:
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Autowired
    private MyHandlerInterceptor myHandlerInterceptor;

    /**
     * 加入了一个拦截器，实现重定向
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myHandlerInterceptor).addPathPatterns("/msg");
    }

    /**
     * 跨域访问，允许"http://domain.com"的跨域访问，限定访问路径/cors，访问方法GET
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/cors/**").allowedOrigins("http://domain.com").allowedMethods("GET");
    }

    /**
     * 添加日期参数格式化规则
     * @param registry
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }
}
