package com.ecnu.springbootdatajpa.service;

import com.ecnu.springbootdatajpa.entity.User;

import java.util.List;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 22:41
 * @Author: Ling Chen
 * @Description:
 */
public interface UserService {

    User addUser(User user);

    List<User> findAllUser();

    List<User> findSortAllUser();

    User findUserById(Integer id);

    List<User> findAllUserPage(int page, int size);

    int countUser();
}
