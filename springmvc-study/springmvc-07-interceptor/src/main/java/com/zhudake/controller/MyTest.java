package com.zhudake.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTest {
    @RequestMapping("/t1")
    public String test(){
        System.out.println("执行了Mytest下的test（）方法！");
        return "ok";
    }
}
