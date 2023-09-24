package com.zhudake.servlet;

import com.zhudake.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //解决乱码问题
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        
       //得到Session 
        HttpSession session = req.getSession();

        //给Session中存东西
        session.setAttribute("name",new Person("朱大可",18));

        //获取Session的id
        String sessionID =  session.getId();

        //判断Session是不是新创建的
        if (session.isNew()){
            resp.getWriter().write("Session创建成功,ID:"+sessionID);
        }else{
            resp.getWriter().write("Session已经存在,ID:"+sessionID);
        }
        //Session在创建的时候做了什么
        //Cookie cookie = new Cookie("JSESSIONID",sessionID);
        //resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
