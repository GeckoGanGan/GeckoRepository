package com.zhudake.dao;

import com.zhudake.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询全部用户
    List<User> getUserList();

    //模糊查询
    List<User> getUserLike(String value);

    //根据id查询用户
    User getUserById(int id);
    //修改用户
    int updateUser(User user);
    //删除用户
    int delUser(int id);
    //插入用户
    int addUser(User user);
    int addUser2(Map<String,Object> map);
}
