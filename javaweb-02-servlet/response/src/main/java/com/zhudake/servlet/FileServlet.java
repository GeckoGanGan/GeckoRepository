package com.zhudake.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


         // 获取下载文件的路径
        String realPath = "E:\\Idea project\\javaweb-02-servlet\\response\\target\\classes\\朱大可.jpg";
        System.out.println("获取下载文件的路径:"+realPath);

        //下载的文件名是啥
        String filename = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //设置想办法让浏览器支持下载我们需要的东西,中文文件名用 URLEncoder.encode()编码，否者会乱码
        resp.setHeader("Content-disposition","attachment;filename="+ URLEncoder.encode(filename,"UTF-8"));
        //获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
        //创建缓冲区
        int len = 0;
        byte[] buffler = new byte[1024];
        //获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
        //将FileOutputStream流写入到buffer缓冲区,使用OutputStream将缓冲区的数据输出到客户端
        while((len = in.read(buffler))>0){
            out.write(buffler,0,len);
        }
        in.close();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
