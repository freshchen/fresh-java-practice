package com.ecnu.springbootdatajpa.dao;

import com.ecnu.springbootdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 22:37
 * @Author: Ling Chen
 * @Description:
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
