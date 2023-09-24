package com.zhudake.Test;
import com.mysql.jdbc.Driver;
import java.sql.*;

public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //配置信息
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode = true&characterEncoding = utf-8&useSSL = true";
        String username = "root";
        String password = "123456";

        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //连接数据库，获取数据库连接对象
        Connection connection = DriverManager.getConnection(url,username,password);

        //获取操作数据库对象(执行CRUD的对象)
        Statement statement = connection.createStatement();

        //SQL语句
        String sql = "SELECT * FROM users;";

        //执行查询，返回一个结果集
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.print(resultSet.getObject("id")+"\t");
            System.out.print(resultSet.getObject("name")+"\t");
            System.out.print(resultSet.getObject("password")+"\t");
            System.out.print(resultSet.getObject("email")+"\t");
            System.out.println(resultSet.getObject("birthday"));
        }
        //关闭连接，释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
