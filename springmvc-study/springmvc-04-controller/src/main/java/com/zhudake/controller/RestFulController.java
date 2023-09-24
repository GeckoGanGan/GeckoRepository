package com.zhudake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    //映射访问路径
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {

        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果：" + (a+b));
        //返回视图位置
        return "test";
    }
    @RequestMapping(value = "/add2/{a}/{b}",method = RequestMethod.GET)
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {

        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果：" + (a+b));
        //返回视图位置
        return "test";
    }

}
