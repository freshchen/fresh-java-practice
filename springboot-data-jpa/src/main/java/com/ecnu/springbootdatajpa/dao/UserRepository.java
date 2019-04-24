package com.ecnu.springbootdatajpa.dao;

import com.ecnu.springbootdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 22:37
 * @Author: Ling Chen
 * @Description:
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select count(1) from user ", nativeQuery = true)
    int countUser();
}
