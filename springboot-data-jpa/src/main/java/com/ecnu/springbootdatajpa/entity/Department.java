package com.ecnu.springbootdatajpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 22:18
 * @Author: Ling Chen
 * @Description:
 */
@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    // 与User的department属性对应，必须要加
    @OneToMany(mappedBy = "department")
    private Set <User> users = new HashSet <>();

    //JPA要求空构造函数
    public Department() {
    }

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

    public Set <User> getUsers() {
        return users;
    }

    public void setUsers(Set <User> users) {
        this.users = users;
    }
}
