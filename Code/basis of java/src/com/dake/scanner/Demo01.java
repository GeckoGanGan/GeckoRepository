package com.dake.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Double d = 0.0;
        Double x = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方法接收：");
        //判断用户有没有输入字符串
        while (scanner.hasNextDouble()){
            //使用next方式接收
         x = scanner.nextDouble();
         d+=x;
        }
        System.out.println("输入的内容为："+d);
        //凡是属于IO流的类如果不关闭会一直占用资源，养成好习惯就关掉
        scanner.close();
    }
}
