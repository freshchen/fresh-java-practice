package com.ecnu.springbootmvc.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/22 17:43
 * @Author: Ling Chen
 * @Description:
 */
@Component
public class MyHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        response.sendRedirect("/msg/hello");
        return false;
    }
}
