package com.zhudake.controller;

import com.zhudake.pojo.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t")
    public String test1(){
        return "hello";
    }
    @RequestMapping("/a1")
    public void test2(String name, HttpServletResponse response) throws IOException {
        if (name.equals("zhudake")){
            response.getWriter().print("true:"+name);
        }
        else {
            response.getWriter().print("false:"+name);
        }
    }
    @RequestMapping("/a2")
    public List<User> test3(String name, HttpServletResponse response){
        List<User> userList = new ArrayList<>();

        userList.add(new User("朱大可1",18,"男"));
        userList.add(new User("朱大可2",18,"男"));
        userList.add(new User("朱大可3",18,"男"));

        return userList;
    }
    @RequestMapping("/a3")
    public String test3(String name,String pwd){
        System.out.println("name:"+name+"\t"+"pwd:"+pwd);
        System.out.println("------");
        String msg = "";
        if (name!=null){
            if (name.equals("admin")){
                msg = "ok";
            }else {
                msg="用户名有误";
            }
        }
        if (pwd!=null){
            if (pwd.equals("123456")){
                msg = "密码正确";
            }else {
                msg = "false";
            }
        }
        return msg;
    }
}
