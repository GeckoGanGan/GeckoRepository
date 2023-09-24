package com.oop.Demo07;

public class Person {
    {// 2： 赋初始值
        System.out.println("匿名代码块");
    }
    static {//  1： 只执行一次
        System.out.println("静态代码块");
    }
    public Person(){//  3
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("============");
        Person person2 = new Person();
    }
}
