package com.ecnu.springbootdatajpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 21:40
 * @Author: Ling Chen
 * @Description:
 */
@Entity
public class User implements Serializable {

    //JPA要求空构造函数
    public User() {
    }

    // 申明主键，以及主键规则
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // 与表中列名对应
    @Column
    private String name;
    @Column(name = "create_time")
    private Date createTime;
    // 多对以关系，多个User对应一个部门，申明外键
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
