package com.zhudake.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //如果是跳转到到登录页面,放行
        if (request.getRequestURI().contains("toLogin")){
            return true;
        }
        //用户第一次登录没有session信息，放行
        if (request.getRequestURI().contains("login")){
            return true;
        }
        if (session.getAttribute("userInfo")!=null){
            return true;
        }

        //其他情况不能进入主页
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        System.out.println("path=======>"+request.getContextPath());
        return false;
    }
}
