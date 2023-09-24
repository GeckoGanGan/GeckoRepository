package com.zhudake.lesson02;

import com.zhudake.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();// 获取数据库连接
            statement = connection.createStatement();// 获得SQL的执行对象
            String sql = "INSERT INTO users(id,`NAME`,`PASSWORD`,`email`,`birthday`)\n" +
                    "VALUE(4,'zhudake','123456','2908947101@qq.com','2023-05-20')";
            int num = statement.executeUpdate(sql);
            if(num>0){
                System.out.println("插入执行成功！");
            }
        }catch (SQLException e){
           e.printStackTrace();
        }
        finally {
            JdbcUtils.release(connection,statement,resultSet);
        }
    }
}
