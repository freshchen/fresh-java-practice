package com.ecnu.springbootmvc.service;

import com.ecnu.springbootmvc.entity.User;

/**
 * @anthor LingChen
 * @create 4/18/2019 4:27 PM
 * @Description
 */
public interface UserService {

    public String initUser(int age, String name, String city);

    public User getUser();

    public String updateUser(int age, String name, String city);
}
