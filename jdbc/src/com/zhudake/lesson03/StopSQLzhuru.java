package com.zhudake.lesson03;

import com.zhudake.lesson02.utils.JdbcUtils;

import java.sql.*;

public class StopSQLzhuru {
    public static void main(String[] args) {
        login("lisi","123456");
        //login(" ''or 1=1","123456");
    }
    //登录业务
    public static void login(String username,String password){

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            // PrepareStatement 防止SQL注入的本质，把传递进来的参数当作字符串
            // 假设其中存在转义字符，比如' 会被直接转义
            String sql = "SELECT * FROM users WHERE `NAME`=? AND `PASSWORD`=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();


            while (resultSet.next()){
                System.out.println("id:"+resultSet.getObject("id"));
                System.out.println("name:"+resultSet.getObject("NAME"));
                System.out.println("password:"+resultSet.getObject("PASSWORD"));
                System.out.println("email:"+resultSet.getObject("email"));
                System.out.println("birthday:"+resultSet.getObject("birthday"));
                System.out.println("=======================");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            JdbcUtils.release(connection,preparedStatement,resultSet);
        }
    }
}
