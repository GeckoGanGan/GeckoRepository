package com.zhudake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//加上该注解后，该类下的所有返回值为String类型如果有对应的页面都会被视图解析器解析
// return "test"------->解析后：WEB-INF/jsp/test.jsp
@RequestMapping("/H")
public class HelloController {

    //当类上有@RequestMapping("/H")则访问路径为/H/hello
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello SpringMVCAnnotation!");
        return "hello";
    }
}
