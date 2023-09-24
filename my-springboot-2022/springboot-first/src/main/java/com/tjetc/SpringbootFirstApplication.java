package com.tjetc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ImportResource;


//上下文的配置，spring容器，通过哪一个配置文件，创建spring容器对象
//@ImportResource("classpath:applicationContext.xml")
@SpringBootApplication
public class SpringbootFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstApplication.class, args);
    }

}
