package com.oop.Demo01;

public class Demo04 {
    //值传递
    public static void main(String[] args) {
        int a = 1;
        change(a);
        System.out.println(a);//a==1
    }
    public static void change(int a){
        a = 10;
    }
}
