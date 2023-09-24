package com.dake.method;

import java.util.Scanner;

public class FigureDemo {
    public static void main(String[] args) {
        System.out.println("欢迎来到计算器,你可以根据提示来运算：");
        System.out.println("==============");
        System.out.println("按1执行加法运算");
        System.out.println("按2执行减法运算");
        System.out.println("按3执行乘法运算");
        System.out.println("按4执行除法运算");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("请输入a和b的值：");
        double y = scanner.nextDouble();
        double z =scanner.nextDouble();
            switch (x) {
                case 1:
                    add(y, z);
                    break;
                case 2:
                    sub(y, z);
                    break;
                case 3:
                    mul(y, z);
                    break;
                case 4:
                    div(y, z);
                    break;
            }
    }
    public static void  add(double a,double b){
        System.out.println(a+b);

    };
    public static void sub(double a,double b){
        System.out.println(a-b);
    }
    public static void mul(double a,double b){
        System.out.println(a*b);
    }
    public static void div(double a,double b){
        if(b==0){
            System.out.println("除数能为0！");
        }else {
            System.out.println(a/b);
        }
    }
}
