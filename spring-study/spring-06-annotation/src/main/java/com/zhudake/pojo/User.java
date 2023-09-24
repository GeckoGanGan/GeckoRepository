package com.zhudake.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User {
    @Value("朱大可")
    public String name;

    //@Value("朱大可")
    public void setName(String name) {
        this.name = name;
    }
}
