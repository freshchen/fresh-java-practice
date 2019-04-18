package com.ecnu.springbootmvc.service;

import com.ecnu.springbootmvc.bean.User;
import org.json.JSONObject;

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
