package com.zhudake.lesson02;

import com.zhudake.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestSelect {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT * FROM users WHERE id = 1";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("id:"+resultSet.getObject("id"));
                System.out.println("name:"+resultSet.getObject("NAME"));
                System.out.println("password:"+resultSet.getObject("PASSWORD"));
                System.out.println("email:"+resultSet.getObject("email"));
                System.out.println("birthday:"+resultSet.getObject("birthday"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            JdbcUtils.release(connection,statement,resultSet);
        }
    }
}
