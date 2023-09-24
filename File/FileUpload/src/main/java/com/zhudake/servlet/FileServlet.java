package com.zhudake.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;
import java.util.UUID;

public class FileServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //判断上传的文件是普通表单还是带文件的表单
            if (!ServletFileUpload.isMultipartContent(request)) {
                return;//普通表单直接终止运行
            }//如果通过了这个if判断则表单中是带文件上传的
            //创建上传文件的保存路径，建议在WEB-INF路径下，更安全，用户无法直接访问
            String uploadPath = this.getServletContext().getRealPath("/WEB-INF/upload");
            File uploadFile = new File(uploadPath);
            if (!uploadFile.exists()) {
                uploadFile.mkdir();//如果这个目录不存在，就创建一个目录
            }

            //临时路径，如果文件的大小超出了预期，就把该文件放在一个临时目录里，过几天自动删除或者提醒用户转为永久文件
            String tempPath = this.getServletContext().getRealPath("/WEB-INF/tmp");
            File tmpFilePath = new File(tempPath);
            if (!tmpFilePath.exists()) {
                tmpFilePath.mkdir();//如果这个目录不存在，就创建一个目录
            }
        /*
        处理上传的文件，一般需要通过流来获取，我们可以使用 request.getInputStream(),原生态
        为文件上传流获取十分麻烦。
        但是建议使用Apache的文件上传组件来实现，common-fileupload,它需要依赖commons-io组件
        */

            //1、创建DiskFileItemFactory对象，处理文件上传路径或者大小的限制
            DiskFileItemFactory factory =  getDiskFileItemFactory(tmpFilePath);
            //2.获取ServletFileUpload
            ServletFileUpload upload = new ServletFileUpload(factory);
            //3.处理上传文件
            String msg = uploadParseRequest(request, upload, uploadPath);

            //文件上传成功，请求转发
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("msg.jsp").forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    //工厂模式
    public static DiskFileItemFactory getDiskFileItemFactory(File file){
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //通过这个工场设置一个缓冲区，当上传的文件大于这个缓冲区的时候，将他放到临时文件中；
        factory.setSizeThreshold(1024*1024);//缓冲区的大小为1M
        factory.setRepository(file);//临时文件保存目录，需要一个File
        return factory;
    }
    public static ServletFileUpload getServletFileUpload(DiskFileItemFactory factory){
        ServletFileUpload upload = new ServletFileUpload(factory);
        //监听文件上传进度
        upload.setProgressListener(new ProgressListener() {
            @Override
            //pBytesRead:已经读取到的文件的大小
            //pContentLength:文件大小
            public void update(long pBytesRead, long pContentLength, int pItems) {
                System.out.println("总大小："+pContentLength+"已上传:"+pBytesRead);
            }
        });
        //处理乱码问题
        upload.setHeaderEncoding("UTF-8");
        //设置单个文件最大值
        upload.setFileSizeMax(1024*1024*10);//10M
        //设置总共能上传文件的大小
        upload.setSizeMax(1024*1024*10);
        return upload;
    }
    public static String uploadParseRequest(HttpServletRequest request,ServletFileUpload upload,String uploadPath) throws FileUploadException, IOException {
        String msg = "";
        //将前端请求解析，封装成一个FileItem对象
        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem fileItem : fileItems) {
            if (fileItem.isFormField()){//判断fileItem是否是普通表单还是带文件的表单
                //getFiledName是获取的前端表单控件的name
                String name = fileItem.getFieldName();
                String value = fileItem.getString("UTF-8");//将表单中保存的数据流以字符串的形式返回
                System.out.println(name+":"+value);
            }else {//表单中带有文件
                /*==========处理文件============*/
                String uploadFileName = fileItem.getName();//获取文件名
                System.out.println("上传的文件名："+uploadFileName);
                if (uploadFileName.trim().equals("")||uploadFileName==null){
                    continue;
                }

                //拿到文件名
                String fileName = uploadFileName.substring(uploadFileName.lastIndexOf("/")+1);
                //获取文件后缀名
                String fileExtendName = uploadFileName.substring(uploadFileName.lastIndexOf(".")+1);
                    /*
                    如果文件后缀名不是我们所需要的就直接
                    return，不处理，告诉用户文件类型不对
                    */

                System.out.println("文件名："+fileName+";文件类型："+fileExtendName);
                //使用UUID（唯一识别的通用码），保证文件名的唯一；
                String uuidPath = UUID.randomUUID().toString();


                /*==========文件处理完毕============*/

                //存放文件
                String realPath = uploadPath + "/" + uuidPath;
                //给每个文件创建一个对应的文件夹
                File realPathFile = new File(realPath);
                if (!realPathFile.exists()){
                    realPathFile.mkdir();
                }

                /*=============存放地址处理完毕============*/
                //获得文件上传的流
                InputStream inputStream = fileItem.getInputStream();
                //创建一个文件输出流
                FileOutputStream fos = new FileOutputStream(realPath + "/" + fileName);
                //创建一个缓冲区
                byte[] buffer = new byte[1024*1024];
                //判断是否读取完毕
                int len = 0;
                //如果大于0，说明还有数据
                while ((len=inputStream.read(buffer))>0){
                    fos.write(buffer,0,len);
                }
                //关闭流
                fos.close();
                inputStream.close();

                msg="文件上传成功！";
                fileItem.delete();//上传成功，清楚临时文件
                /*==========文件传输完毕============*/

            }
        }
        return msg;
    }
}
