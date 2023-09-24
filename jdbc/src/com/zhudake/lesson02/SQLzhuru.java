package com.zhudake.lesson02;

import com.zhudake.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLzhuru {
    public static void main(String[] args) {
        //loging("zhudake","123456");
        login(" 'or'1=1"," 'or'1=1");
    }
    public static void login(String username,String password){

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();
            // SELECT * FROM users WHERE `NAME`='zhudake' AND `PASSWORD` = '123456'
            // SELECT * FROM users WHERE `NAME`='' or '1=1' AND `PASSWORD` = '' or '1=1';
            String sql = "SELECT * FROM users WHERE `NAME`='"+username+"' AND `PASSWORD`='"+password+"'";
            resultSet = statement.executeQuery(sql);
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
            JdbcUtils.release(connection,statement,resultSet);
        }
    }
}
