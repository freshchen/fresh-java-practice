package com.ecnu.springbootwebsocket.controller;

import com.ecnu.springbootwebsocket.entity.Greeting;
import com.ecnu.springbootwebsocket.entity.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 21:00
 * @Author: Ling Chen
 * @Description:
 */
@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
