package com.ecnu.springbootmybatis.controller;

import com.ecnu.springbootmybatis.entity.User;
import com.ecnu.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

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

    @RequestMapping("/add/{name}/{departmentId}")
    public long addUser(@PathVariable String name, @PathVariable Integer departmentId){
        User user = new User();
        user.setCreateTime(new Date());
        user.setDepartmentId(departmentId);
        user.setName(name);
        return userService.addUser(user);
    }


}
