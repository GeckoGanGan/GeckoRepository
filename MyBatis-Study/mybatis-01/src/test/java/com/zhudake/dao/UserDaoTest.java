package com.zhudake.dao;

import com.zhudake.pojo.User;
import com.zhudake.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class UserDaoTest {
    @Test
    public void test(){
        //1、获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //2、执行SQL
            //方式一、getMapper 推荐使用方式一
            // UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            // List<User> userList = mapper.getUserList();

            //方式二
            List<User> userList = sqlSession.selectList("com.zhudake.dao.UserMapper.getUserList");

            for (User user : userList) {
                System.out.println(user.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭SqlSession
            sqlSession.close();
        }
    }

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("李");
        for (User user : userList) {
            System.out.println(user.toString());
        }
        sqlSession.commit();
        sqlSession.close();
    }

    //根据id查询用户
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById.toString());
        sqlSession.close();
    }

    //修改用户
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(3,"hh","123111"));

        sqlSession.commit();
        sqlSession.close();
    }
    //删除用户
    @Test
    public void delUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delUser(3);
        sqlSession.commit();
        sqlSession.close();
    }

    //添加用户
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(5,"哈哈哈","123456"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("userId",6);
        map.put("userName","朱大可");
        map.put("userPassword","123456");
        mapper.addUser2(map);

        sqlSession.commit();
        sqlSession.close();
    }
}
