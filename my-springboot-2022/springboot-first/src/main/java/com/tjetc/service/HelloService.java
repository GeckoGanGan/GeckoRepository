package com.tjetc.service;
//通常情况下加一个@service注解才能将HelloService导入容器

//为了演示@ImportResource注解，创建spring

public class HelloService {
    public String sayHello(){
        return "hello spring boot!!!";
    }
}
