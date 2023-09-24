package com.zhudake.dao;

public class UserDaoImpl1 implements UserDao{
    @Override
    public void getUser() {
        System.out.println("UserDaoImpl1查询所有用户");
    }
}
