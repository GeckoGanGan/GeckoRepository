package com.zhudake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EncodingTest {
    @RequestMapping("/e")
    public String test(@RequestParam("username")  String username , Model model){
        System.out.println(username);
        model.addAttribute("msg",username);
        return "test";
    }
}
