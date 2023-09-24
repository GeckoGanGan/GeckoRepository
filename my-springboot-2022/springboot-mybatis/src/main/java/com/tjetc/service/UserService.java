package com.tjetc.service;

import com.github.pagehelper.PageInfo;
import com.tjetc.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    /*@param pageNum 获取当前页数
    @parame PageSize 每一页的记录数
     */
    PageInfo<User> findPage(int pageNum,int pageSize);
}

