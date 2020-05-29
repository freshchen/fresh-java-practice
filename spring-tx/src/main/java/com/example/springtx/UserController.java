package com.example.springtx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author darcy
 * @since 2020/05/29
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add/{name}/{age}")
    @Transactional
    public void addUser(@PathVariable String name, @PathVariable String age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userRepository.save(user);
        int a = 0 / 0;
    }

}
