package com.zhudake.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("UserDaoImpl查询所有用户");
    }
}
