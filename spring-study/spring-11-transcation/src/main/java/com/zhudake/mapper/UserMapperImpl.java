package com.zhudake.mapper;

import com.zhudake.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> selectUser() {

        User user = new User(3, "hhehhe", "121212");
        addUser(user);
        delUser(5);

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int delUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).delUser(id);
    }
}
