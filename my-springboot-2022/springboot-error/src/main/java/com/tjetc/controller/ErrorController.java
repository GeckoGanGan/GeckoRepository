package com.tjetc.controller;

import com.tjetc.entity.ExceptionMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController {
    @RequestMapping("/test")
    public String testError(){
        System.out.println(5/0);
        return "index";//没有错误就转发到index.html页面
    }
   /* @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public ExceptionMessage ArithmeticException(Exception e){
        ExceptionMessage exceptionMessage =new ExceptionMessage();
        exceptionMessage.setCode("500");
        exceptionMessage.setMessage(e.getMessage());
        return exceptionMessage;
    }*/
    @RequestMapping("/testNull")
    public String testNull(){
        String s=null;
        System.out.println(s.length());
        return "index";
    }
    @RequestMapping("/testOther")
    public String testOther(){
        int [] arr= new int[3];
        System.out.println(arr[5]);
        return "index";
    }
    
}
