package com.zhudake.dao;

import com.zhudake.pojo.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //根据id查询用户
    User getUserById(int id);

    //分页
    List<User> getUserListByLimit(Map<String,Integer> map);

    //分页2
    List<User> getUserListByRowBounds();

}
