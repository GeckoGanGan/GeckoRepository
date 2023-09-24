package com.zhudake.dao;

import com.zhudake.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //插叙所有的学生的信息以及对应的老师的信息
    List<Student> getStudent();
    List<Student> getStudent2();
}
