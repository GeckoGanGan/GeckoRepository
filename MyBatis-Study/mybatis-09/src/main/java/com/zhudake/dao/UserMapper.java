package com.zhudake.dao;

import com.zhudake.pojo.User;

public interface UserMapper {
    //根据id查询用户
    User getUserById(int id);

    //修改
    int updateUser(User user);
}
