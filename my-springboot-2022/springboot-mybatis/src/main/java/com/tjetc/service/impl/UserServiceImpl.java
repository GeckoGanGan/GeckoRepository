package com.tjetc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tjetc.dao.UserMapper;
import com.tjetc.entity.User;
import com.tjetc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
    /**
     * 查询分页数据
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<User> findPage(int pageNum,int pageSize){
        //第一页，每页显示5条数据
        PageHelper.startPage(pageNum,pageSize);
        //查询所有用户
        List<User> all = userMapper.findAll();
        //获取Page
        PageInfo<User> page = new PageInfo<>(all);
        return page;
    }
}
