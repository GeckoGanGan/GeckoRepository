package com.commenclass.Demo02;

public class Application {
    public static void main(String[] args) {
        //无需先创建外部类对象，直接创建内部类对象
        Outer.Inner inner = new Outer.Inner();
        //调用方法
        inner.show();
    }
}
