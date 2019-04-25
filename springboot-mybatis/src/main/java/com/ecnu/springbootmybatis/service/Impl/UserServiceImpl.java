package com.ecnu.springbootmybatis.service.Impl;


import com.ecnu.springbootmybatis.dao.UserMapper;
import com.ecnu.springbootmybatis.entity.User;
import com.ecnu.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    private UserMapper userMapper;

    @Override
    public long addUser(User user) {
        return userMapper.save(user);
    }



}
