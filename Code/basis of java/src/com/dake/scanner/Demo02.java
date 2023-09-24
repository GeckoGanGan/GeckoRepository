package com.dake.scanner;

import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方法接收:");
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("用户输入内容为："+str);
        }
        scanner.close();

    }
}
