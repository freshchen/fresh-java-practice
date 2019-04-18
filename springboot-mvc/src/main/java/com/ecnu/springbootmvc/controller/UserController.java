package com.ecnu.springbootmvc.controller;

import com.ecnu.springbootmvc.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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
    UserService userService;

    @RequestMapping(name = "/user/{age}/{name}/{city}")
    public String initUser(@){
        return userService.initUser();
    }
}
