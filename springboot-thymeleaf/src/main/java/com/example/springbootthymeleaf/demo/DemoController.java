package com.example.springbootthymeleaf.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

/**
 * @author chenling
 */
@Controller
public class DemoController {

    @GetMapping("/hello")
    public String hello(Model model){
        User user = new User("夏明", 22);
        model.addAttribute("hello", "<p>你好</p>");
        model.addAttribute("user", user);
        model.addAttribute("url", "xingren");
        model.addAttribute("boolean", 0);
        model.addAttribute("names", Arrays.asList("1","2","3","4"));
        return "hi";
    }
}
