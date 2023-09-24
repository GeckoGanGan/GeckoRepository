package com.oop.Demo01;

public class Demo03 {
    public static void main(String[] args) {
        //参数必须和形参类型一致
        int add = add(1,2);
        System.out.println(add);

    }
    public static int add(int a,int b){
        return a+b;
    }
}
