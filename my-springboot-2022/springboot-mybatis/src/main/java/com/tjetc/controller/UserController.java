package com.tjetc.controller;

import com.tjetc.entity.User;
import com.tjetc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("user/all")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAll();
    }
}
