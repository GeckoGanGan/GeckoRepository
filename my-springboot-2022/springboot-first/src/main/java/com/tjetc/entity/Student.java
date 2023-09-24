package com.tjetc.entity;

import lombok.Data;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component//将student作为组件.注册到spring容器
@ConfigurationProperties(prefix = "student")//读取配置文件
@Data
@Validated//给类加上校验
//如果不通过@PropertySource()指定属性文件就会
@PropertySource("classpath:student.properties")//指定属性文件
public class Student {
    //@Email//给studentName加上电子邮件的校验/studentName必须为邮箱格式才可以注入
    private String studentName;
    private String age;
    private Boolean sex;
    private Date birth;
    private Map<String,Object> teachers;
    private List<String> friends;
    private Book book;
    public Student(){
        System.out.println("student的 no args constructor");
    }

}
