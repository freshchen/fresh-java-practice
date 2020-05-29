package com.example.springtx;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author darcy
 * @since 2020/05/29
 **/
public interface UserRepository extends JpaRepository<User, Integer> {
}
