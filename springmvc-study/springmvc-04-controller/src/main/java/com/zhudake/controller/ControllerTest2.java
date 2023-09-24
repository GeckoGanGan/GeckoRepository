package com.zhudake.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {
    @RequestMapping("/t1")
    public String test1(Model model){
        model.addAttribute("msg","test1");
        return "test";
    }
    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg","test2");
        return "test";
    }
}
