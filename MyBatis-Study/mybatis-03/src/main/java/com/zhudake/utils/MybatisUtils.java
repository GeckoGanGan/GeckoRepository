package com.zhudake.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//SqlSessionFactory ----->sqlSessionFactory  工厂模式
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            //1、使用MyBatis第一步
            //获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);//加载资源
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//通过资源中的配置信息创建连接
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
    // SqlSession 提供了在数据库执行 SQL 命令所需的所有方法。
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();//相当于preparestatement对象
    }
}
