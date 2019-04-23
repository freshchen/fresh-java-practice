package com.ecnu.springbootdatajpa.service.Impl;

import com.ecnu.springbootdatajpa.dao.UserRepository;
import com.ecnu.springbootdatajpa.entity.User;
import com.ecnu.springbootdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 22:42
 * @Author: Ling Chen
 * @Description:
 */
@Service
// 开启事务
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
