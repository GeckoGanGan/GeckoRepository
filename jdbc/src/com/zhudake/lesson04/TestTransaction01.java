package com.zhudake.lesson04;

import com.zhudake.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestTransaction01 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtils.getConnection();
            // 关闭自动提交
            connection.setAutoCommit(false);
            // 开启事务 默认是关闭自动提交，开启事务
            String sql1="update account set money=money-100 where NAME ='A'";
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.executeUpdate();

            String sql2="update account set money=money+100 where NAME ='B'";
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

            connection.commit();
            System.out.println("事务提交成功！");

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                // 显示定义事务提交失败则自动回滚，默认是自动回滚
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        finally {
            JdbcUtils.release(connection,preparedStatement,resultSet);
        }
    }
}
