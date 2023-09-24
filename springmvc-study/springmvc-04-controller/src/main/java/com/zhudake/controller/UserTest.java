package com.zhudake.controller;

import com.zhudake.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/User")
public class UserTest {
    @RequestMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        System.out.println("username:"+name);
        model.addAttribute("msg",name);
        return "test";
    }
    @RequestMapping("/t2")
    public String test2(User user, Model model){

        System.out.println(user);
        model.addAttribute("msg",user.getName());
        return "test";
    }
}
