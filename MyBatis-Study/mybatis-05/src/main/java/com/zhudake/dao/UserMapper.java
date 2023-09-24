package com.zhudake.dao;

import com.zhudake.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user;")
    List<User> getUser();

    //根据id查询用户
    @Select("select * from user where id = #{uid};")
    User getUserByID(@Param("uid") int  id);

    //增加用户
    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password});")
    int addUser(User user);

    //删除用户
    @Delete("delete from user where id = #{uid};")
    int delUser(@Param("uid") int id);

    //修改用户
    @Update("update user set name = #{name},pwd = #{password} where id = #{id}")
    int updateUser(User user);
}
