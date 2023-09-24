package com.tjetc.config;

import com.tjetc.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Import(MyDataSource.class)//导入datasource类，MyDataSource会实例化到容器中
@Configuration
public class AppConfig {
    /*
    向容器中的hellService，是通过方法来实现的
    会将方法的返回值注册到容器中，@Bean注解，相当于spring中的bean标签
    如果不设置bean，默认是方法名
     */
    @Bean("helloservice")
    public HelloService helloService(){
        return new HelloService();
    }
}
