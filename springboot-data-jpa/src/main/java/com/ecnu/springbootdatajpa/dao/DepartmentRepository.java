package com.ecnu.springbootdatajpa.dao;

import com.ecnu.springbootdatajpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/24 1:01
 * @Author: Ling Chen
 * @Description:
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
