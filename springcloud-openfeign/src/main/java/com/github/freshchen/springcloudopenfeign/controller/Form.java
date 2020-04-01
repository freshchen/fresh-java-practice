package com.github.freshchen.springcloudopenfeign.controller;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

/**
 * @author darcy
 * @since 2020/03/24
 **/
@Data
public class Form {

    private String name;

    @Email
    private String email;

    @Length(min = 11, max = 11)
    private String phone;
}
