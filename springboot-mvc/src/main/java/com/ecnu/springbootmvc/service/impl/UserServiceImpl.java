package com.ecnu.springbootmvc.service.impl;

import com.ecnu.springbootmvc.entity.User;
import com.ecnu.springbootmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @anthor LingChen
 * @create 4/18/2019 4:57 PM
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private User user;

    @Override
    public String initUser(int age, String name, String city) {
        user.setAge(age);
        user.setName(name);
        user.setCity(city);
        return "sucess";
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public String updateUser(int age, String name, String city) {
        user.setAge(age);
        user.setName(name);
        user.setCity(city);
        return "sucess";
    }
}
