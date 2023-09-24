package com.zhudake.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
    //一个老师有很多学生
    private List<Student> studentList;
}
