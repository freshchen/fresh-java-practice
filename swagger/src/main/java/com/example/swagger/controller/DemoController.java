package com.example.swagger.controller;

import com.example.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : freshchen
 * <P>Created on 2020-01-18 18:45 </p>
 **/
@RestController
@Api("案例")
public class DemoController {

    @GetMapping("/hello")
    @ApiOperation("打招呼")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test/user")
    @ApiOperation("参数新增用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "age", value = "年龄", dataType = "Integer", paramType = "query")
    })
    public void user(String name, Integer age) {
    }

    @PostMapping("/user")
    @ApiOperation("Body新增用户")
    public Integer addUser(@RequestBody User user){
        System.out.println(user);
        return 0;
    }

    @GetMapping("/user")
    @ApiOperation("Body查询用户")
    public User queryUser(){
        return new User("hello", 22);
    }
}
