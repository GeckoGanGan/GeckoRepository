package com.dake.method;

public class Demo01 {
    public static void main(String[] args) {
        int sum = add(1,2);
        double d = add(1.1,2.2);
        System.out.println(sum);
        System.out.println(d);
    }
    //加法
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }

}
