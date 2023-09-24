package com.zhudake.aspect;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public void put() {
        System.out.println("学生交作业了");
    }
}
