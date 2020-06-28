package com.example.springbootsecurity.controller;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author darcy
 * @since 2020/06/15
 **/
@Controller
public class TestController {

    @PostMapping({"/", "/home"})
    public String home() {
        return "index";
    }

    @GetMapping("name")
    @ResponseBody
    public String name() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        System.out.println(user.getPassword());
        return "name";
    }

    @GetMapping("/login")
    public String login() {
        return "mylogin";
    }
}
