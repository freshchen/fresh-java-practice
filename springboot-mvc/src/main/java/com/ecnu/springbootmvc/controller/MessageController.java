package com.ecnu.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/22 21:47
 * @Author: Ling Chen
 * @Description:
 */
@Controller
@RequestMapping("/msg")
public class MessageController {

    /**
     * 返回结果通过自带的jackson序列化成json串
     *
     * @return
     */
    @RequestMapping("/hello")
    public @ResponseBody
    Map hello() {
        Map map = new HashMap();
        map.put("msg", "hello");
        map.put("time millis", System.currentTimeMillis());
        return map;
    }

    /**
     * 显式的重定向，也可以通过拦截器实现，浏览器URL会变
     *
     * @return
     */
    @RequestMapping("/nihao")
    public String redirect() {
        return "redirect:/msg/hello";
    }

    /**
     * 显式的转发，浏览器URL不会变
     *
     * @return
     */
    @RequestMapping("/leihou")
    public String forward() {
        return "forward:/msg/hello";
    }

}
