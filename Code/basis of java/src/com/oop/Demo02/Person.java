package com.oop.Demo02;

//编译 java---->class
public class Person {
    //一个类即使什么都不写，都会存在一个方法
    //显示定义构造器
    String name;
    //实例化初始值
    //1、使用new关键字，本质就是调用构造器
    //2、用来初始化值
    public Person(){

    }
    //有参构造器:一旦定义了有参构造，无参就必须显示定义
    public Person(String name){
        this.name=name;//当前的类的name=传进来的参数
    }
    //alt+insert：快捷键生成构造器

}
