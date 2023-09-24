package com.zhudake.filter;
import javax.servlet.*;
import java.io.IOException;
public class CharacterEncodingFilter implements Filter {
    //初始化：web服务器启动就已经初始化了，随时等待过滤对象的出现！
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter已经初始化");

    }
/*
Chain：链
1.过滤中的所有代码，在过滤器特定请求的时候都会执行
2.必须要让过滤器继续通行
* */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");
        System.out.println("CharacterEncodingFilter执行前");

        filterChain.doFilter(servletRequest,servletResponse);// 让我们的程序继续执行，否则会被拦截停止
        System.out.println("CharacterEncodingFilter执行后");
    }
    //web服务器关闭的时候会销毁
    @Override
    public void destroy() {
        System.out.println("CharacterEncodingFilter已经销毁");
    }
}
