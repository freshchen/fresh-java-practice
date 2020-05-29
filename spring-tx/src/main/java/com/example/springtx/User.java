package com.example.springtx;

import lombok.Data;

import javax.persistence.*;

/**
 * @author darcy
 * @since 2020/05/29
 **/
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String age;
}
