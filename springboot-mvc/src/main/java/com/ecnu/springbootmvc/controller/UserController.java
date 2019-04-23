package com.ecnu.springbootmvc.controller;

import com.ecnu.springbootmvc.entity.User;
import com.ecnu.springbootmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @anthor LingChen
 * @create 4/18/2019 4:15 PM
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * e.g. curl http://127.0.0.1:8099/user/original/add/12/name/sd
     * @param age
     * @param name
     * @param city
     * @return
     */
    @RequestMapping("/original/add/{age}/{name}/{city}")
    public String initUser(@PathVariable int age, @PathVariable String name, @PathVariable String city) {
        return userService.initUser(age, name, city);
    }

    /**
     * @RequestParam 可以省略
     * e.g. curl -d "name=asd&age=12&city=sh" http://127.0.0.1:8099/user/original/add2
     * e.g. /user/original/add2?age=12&name=ling&city=nj
     * @param age
     * @param name
     * @param city
     * @return
     */
    @RequestMapping("/original/add2")
    public String initUser2(@RequestParam("age") String  age, @RequestParam("name") String name, @RequestParam("city") String city) {
        return userService.initUser(Integer.parseInt(age), name, city);
    }

    /**
     * 将接受到的参数映射到对象
     * e.g. curl http://127.0.0.1:8099/user/original/add3 -d 'name=asd&age=12&city=nj'
     * e.g. /user/original/add3?age=12&name=ling&city=223213
     * @param user
     * @return
     */
    @RequestMapping("/original/add3")
    public String initUser3(User user) {
        return user.getName();
    }

    /**
     * 加了@RequestBody 只能接受JSON请求
     * e.g. curl http://127.0.0.1:8099/user/original/add4 -d '{"name":"asd","age":"12","city":"nj"}' -H 'Content-Type:application/json'
     * @param user
     * @return
     */
    @RequestMapping("/original/add4")
    public String initUser4(@RequestBody User user) {
        return user.getName();
    }

    @RequestMapping("/original/update/{age}/{name}/{city}")
    public String updateUser(@PathVariable int age, @PathVariable String name, @PathVariable String city) {
        return userService.updateUser(age, name, city);
    }

    @RequestMapping("/original/find")
    public @ResponseBody User getUser(){
        return userService.getUser();
    }

}
