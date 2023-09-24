package com.dake.operator;

public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a+=b;  //a = a+b
        // a-=b; a = a-b
        System.out.println(a);

        //字符串连接符 + String类型
        System.out.println(""+a+b);//执行结果为3020
        System.out.println(a+b+"");//先执行a+b结果为50
    }
}
