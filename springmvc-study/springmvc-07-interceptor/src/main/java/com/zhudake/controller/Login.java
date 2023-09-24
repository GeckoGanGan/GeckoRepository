package com.zhudake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class Login {
    @RequestMapping("/toLogin")
    public String goLogin(){
        return "login";
    }
    @RequestMapping("/toHome")
    public String goHome(){
        return "home";
    }
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        session.setAttribute("userInfo",username);
        model.addAttribute("username",username);
        return "home";
    }
    @RequestMapping("/logout")
    public String logOut(HttpSession session){
        //移除session
        session.removeAttribute("userInfo");
        return "login";
    }
}
