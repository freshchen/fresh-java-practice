package com.ecnu.springbootdatajpa.controller;

import com.ecnu.springbootdatajpa.entity.Department;
import com.ecnu.springbootdatajpa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/24 0:46
 * @Author: Ling Chen
 * @Description:
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/add/{name}")
    public void add(@PathVariable String name){
        Department department = new Department();
        department.setName(name);
        departmentService.addDepartment(department);
    }



}
