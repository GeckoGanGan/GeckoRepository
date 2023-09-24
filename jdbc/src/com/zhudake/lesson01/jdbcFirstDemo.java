package com.zhudake.lesson01;

import java.sql.*;

// 我的第一个JDBC程序
public class jdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //  1.加载驱动
        // DriverManager.registerDriver(new com.mysql.jdbc.Driver());原来的写法,Driver里面只包含一个静态代码块，无序创建对象即可执行
        Class.forName("com.mysql.jdbc.Driver");//固定写法

        //  2.用户信息和url
        /*
        useUnicode = true & characterEncoding = utf8 & useSSL = true
        支持中文编码 & 设定字符集编码为utf8 & 使用安全连接
        */
        String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode = true&characterEncoding = utf8&useSSL = true";
        String username = "root";
        String password = "123456";

        //  3.连接成功，返回一个数据库对象 Connection 代表数据库
        Connection connection =  DriverManager.getConnection(url,username,password);

        //  4.执行SQL的对象 Statement 执行SQL的对象
        Statement statement = connection.createStatement();
        //statement.executeQuery();//查询操作,返回一个结果集
        //statement.execute();// 执行任何SQL,相对来说效率更低一点
        // statement.executeUpdate();//更新、插入、删除,都是用这个,返回一个受影响的行数

        //  5.执行SQL的对象去执行SQL，可能存在结果，查看返回结果,结果集中封装了我们全部查询出来的结果
        String sql = "SELECT * FROM users";// 编写SQL
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println("id:"+resultSet.getObject("id"));
            System.out.println("name:"+resultSet.getObject("NAME"));
            System.out.println("pwd:"+resultSet.getObject("PASSWORD"));
            System.out.println("email:"+resultSet.getObject("email"));
            System.out.println("birthday:"+resultSet.getObject("birthday"));
            System.out.println("=======================");
        }

        //  6.释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
