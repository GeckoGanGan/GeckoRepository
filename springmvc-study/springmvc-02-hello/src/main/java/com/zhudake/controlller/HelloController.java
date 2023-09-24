package com.zhudake.controlller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //第一步
        ModelAndView mv = new ModelAndView();
        //处理业务
        String result = "hello springmvc";
        mv.addObject("msg",result);
        return mv;
    }
}
