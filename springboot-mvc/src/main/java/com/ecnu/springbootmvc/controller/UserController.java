package com.ecnu.springbootmvc.controller;

import com.ecnu.springbootmvc.bean.User;
import com.ecnu.springbootmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @anthor LingChen
 * @create 4/18/2019 4:15 PM
 * @Description
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/original/{age}/{name}/{city}")
    public String initUser(@PathVariable String age, @PathVariable String name, @PathVariable String city) {
        return userService.initUser(Integer.parseInt(age), name, city);
    }

    @RequestMapping("/user/original/update/{age}/{name}/{city}")
    public String updateUser(@PathVariable String age, @PathVariable String name, @PathVariable String city) {
        return userService.updateUser(Integer.parseInt(age), name, city);
    }

    @RequestMapping("/user/original/find")
    public User getUser(){
        return userService.getUser();
    }
}
