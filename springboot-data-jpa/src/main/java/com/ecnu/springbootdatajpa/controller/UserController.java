package com.ecnu.springbootdatajpa.controller;

import com.ecnu.springbootdatajpa.entity.User;
import com.ecnu.springbootdatajpa.service.UserService;
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
    public void addUser(@PathVariable String name, @PathVariable Integer departmentId){
        User user = new User();
        user.setCreateTime(new Date());
        user.setDepartmentId(departmentId);
        user.setName(name);
        userService.addUser(user);
    }

    @RequestMapping("/find/{id}")
    public User findUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }

    @RequestMapping("/find/{page}/{size}")
    public List<User> findUserById(@PathVariable int page,@PathVariable int size){
        return userService.findAllUserPage(page,size);
    }

    @RequestMapping("/find")
    public List<User> findUser(){
        return userService.findAllUser();
    }

    @RequestMapping("/findsort")
    public List<User> findUserSort(){
        return userService.findSortAllUser();
    }

    @RequestMapping("/count")
    public String countUser(){
        return String.valueOf(userService.countUser());
    }

}
