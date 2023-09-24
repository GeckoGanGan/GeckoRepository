package com.zhudake.lesson03;

import com.zhudake.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelect {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();//1.连接数据库
            String sql = "select * from users where id = ?";//2.编写SQL
            preparedStatement = connection.prepareStatement(sql);//3.预编译SQL
            preparedStatement.setInt(1,3);//4.赋值
            resultSet =  preparedStatement.executeQuery();//4.执行
            while (resultSet.next()){
                System.out.println("id:"+resultSet.getInt("id"));
                System.out.println("name:"+resultSet.getString("NAME"));
                System.out.println("password:"+resultSet.getString("PASSWORD"));
                System.out.println("email:"+resultSet.getString("email"));
                System.out.println("birthday:"+resultSet.getDate("birthday"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JdbcUtils.release(connection,preparedStatement,resultSet);
        }
    }
}
