package com.zhudake.lesson03;

import com.zhudake.lesson02.utils.JdbcUtils;

import java.sql.*;
import java.util.Date;

public class TestInsert {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection =  JdbcUtils.getConnection();

            // 跟Statement的区别
            // 使用？占位符代替参数
            String sql = "insert into users(id,`NAME`,`PASSWORD`,`email`,`birthday`) values(?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);//预编译SQL,先写SQL然后不执行

            //手动给参数赋值
            preparedStatement.setInt(1,4);
            preparedStatement.setString(2,"zhudake");
            preparedStatement.setString(3,"123456");
            preparedStatement.setString(4,"2908947101@qq.com");
            // 注意点：java.sql.Date --数据库 java.sql.Date()
            // java.util.Date --Java new Date().getTime() 获得时间戳
            preparedStatement.setDate(5,new java.sql.Date(new Date().getTime()));

            //执行
            int num = preparedStatement.executeUpdate();//与statement有区别
            if(num>0){
                System.out.println("插入成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JdbcUtils.release(connection,preparedStatement,resultSet);
        }
    }
}
