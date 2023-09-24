package com.zhudake.Test;

import java.sql.*;

public class TestPreparestatement {
    public static void main(String[] args) throws Exception {
        //配置信息
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL = true";
        String username = "root";
        String password = "123456";

        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);
        //编写SQL
        String sql = "INSERT INTO users(ID, NAME, PASSWORD, EMAIL, BIRTHDAY) VALUES (?,?,?,?,?);";
        //预编译SQL
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,5);//给第一个占位符赋值为5，对应id
        preparedStatement.setString(2,"李二狗");//给第二个占位符赋值，对应name
        preparedStatement.setString(3,"123456");//给第三个占位符赋值，对应password
        preparedStatement.setString(4,"2908947101@qq.com");//给第四个占位符赋值，对应email
        preparedStatement.setDate(5,new Date(new java.util.Date().getTime()));//给第五个占位符赋值，对应birthday

        int i = preparedStatement.executeUpdate();//执行SQL,注意：这里不用再次传入sql！
        if (i>0){
            System.out.println("受影响行数："+i);
        }
        //关闭连接，释放资源
        preparedStatement.close();
        connection.close();

    }
}
