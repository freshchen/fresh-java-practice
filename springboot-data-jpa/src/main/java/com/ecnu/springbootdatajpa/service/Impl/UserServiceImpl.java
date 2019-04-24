package com.ecnu.springbootdatajpa.service.Impl;

import com.ecnu.springbootdatajpa.dao.UserRepository;
import com.ecnu.springbootdatajpa.entity.User;
import com.ecnu.springbootdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List <User> findSortAllUser() {
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        return userRepository.findAll(sort);
    }

    @Override
    public User findUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List <User> findAllUserPage(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page,size);
        Page<User> page1 = userRepository.findAll(pageRequest);
        return page1.getContent();
    }

    @Override
    public int countUser() {
        return userRepository.countUser();
    }


}
