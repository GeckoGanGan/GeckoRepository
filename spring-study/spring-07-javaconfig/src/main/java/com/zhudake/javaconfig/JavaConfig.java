package com.zhudake.javaconfig;


import com.zhudake.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 这个也会Spring容器托管，注册到容器中，因为它本来就是一个@Component
// @Configuration代表这是一个配置类，就和我们之前看的beans.xml
@Configuration
@ComponentScan("com.zhudake.pojo")//通过包扫描
@Import(JavaConfig2.class)//合并配置类
public class JavaConfig {
    //@Bean(name = "user") @Bean里面可以设置name相当于bean里的id
    // 注册一个bean，就相当于我们之前写的一个bean标签
    // 这个方法的名字，就相当于bean标签中id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User  getUser(){
     return new User();
    }
}
