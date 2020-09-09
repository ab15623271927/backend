package com.tourstories.www.controller;
import com.tourstories.www.Model.User;
import com.tourstories.www.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    private UserMapper userMapper;

    public UserController(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        System.out.println("User routes  with docker from database");
        return userMapper.getUsers();
    }

    @GetMapping("/update")
    public List<User> updateUser(){
       User user = new User();
       user.setName("ssajib");
       user.setPwd("3pass");

       userMapper.insert(user);


        return userMapper.getUsers();
    }
}

