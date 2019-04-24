package com.ecnu.springbootdatajpa.service.Impl;

import com.ecnu.springbootdatajpa.dao.DepartmentRepository;
import com.ecnu.springbootdatajpa.entity.Department;
import com.ecnu.springbootdatajpa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/24 0:49
 * @Author: Ling Chen
 * @Description:
 */
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);

    }
}
