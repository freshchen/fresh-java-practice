package com.ecnu.springbootdatajpa.controller;

import com.ecnu.springbootdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 22:49
 * @Author: Ling Chen
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

}
