package com.zhudake.Test;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc3 {
    @Test
    public void test(){
        //配置信息
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL = true";
        String username = "root";
        String password = "123456";
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //连接数据库
            connection = DriverManager.getConnection(url,username,password);
            //关闭自动提交(开启事务)
            connection.setAutoCommit(false);
            //编写SQL
            String sql = "UPDATE account SET money = money - 100 WHERE name = 'a';";
            connection.prepareStatement(sql).executeUpdate();

            //制造错误
            int i = 1/0;

            String sql2 = "UPDATE account SET money = money + 100 WHERE name = 'b';";
            connection.prepareStatement(sql2).executeUpdate();

            connection.commit();
            System.out.println("success");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
