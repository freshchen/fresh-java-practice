package com.ecnu.springbootmybatis.service;


import com.ecnu.springbootmybatis.entity.User;

import java.util.List;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 22:41
 * @Author: Ling Chen
 * @Description:
 */
public interface UserService {

    long addUser(User user);
}
