package com.zhudake.dao;


import com.zhudake.pojo.Teacher;
import org.apache.ibatis.annotations.Param;


public interface TeacherMapper {
    Teacher getTeacherById(@Param("tid") int id);
    Teacher getTeacherById2(@Param("tid") int id);

}
