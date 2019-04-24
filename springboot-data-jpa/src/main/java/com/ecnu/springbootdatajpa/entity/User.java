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

    @Column(name = "department_id")
    private Integer departmentId;

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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
