package com.dake.struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if(score>=60){
            System.out.println("你的成绩几个了");
        }
        else{
            System.out.println("你的成绩不合格");
        }
        scanner.close();
    }
}
