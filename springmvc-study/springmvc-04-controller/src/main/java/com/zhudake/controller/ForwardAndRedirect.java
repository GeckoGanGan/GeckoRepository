package com.zhudake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardAndRedirect {

    //请求转发
    @RequestMapping("/tf")
    public String testForward(Model model){
        model.addAttribute("msg","testForward");
        return "forward:/WEB-INF/jsp/test.jsp";
    }
    @RequestMapping("/tf2")
    public String testForward2(Model model){
        model.addAttribute("msg","testForward");
        return "test";
    }

    //重定向
    @RequestMapping("/td")
    public String testRedirect(Model model){
        model.addAttribute("msg","testRedirect");
        return "redirect:/index.jsp";
    }

}
