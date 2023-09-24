package com.zhudake.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//统计网站在线人数监听：统计session
public class OnlineCountListener implements HttpSessionListener {
    //创建session监听
    //一旦创建Session就会触发这个事件
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        System.out.println(se.getSession().getId());
        Integer onlineCount= (Integer) servletContext.getAttribute("onlineCount");

        if (onlineCount==null){
            onlineCount = 1;
        }
        else {
            int count = onlineCount;
            onlineCount = count + 1;
        }
        servletContext.setAttribute("onlineCount",onlineCount);
    }

    //销毁session监听
    //一旦Session销毁就会触发这个事件
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
