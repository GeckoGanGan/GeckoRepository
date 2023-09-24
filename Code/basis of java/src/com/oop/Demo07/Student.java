package com.oop.Demo07;

public class Student {
    private static int age;//   静态变量   多线程！
    private double score;//     非静态变量
    public void run(){//    不能直接调用，需要实例化对象后调用
        go();           //非静态方法可以调用静态方法里的所有东西，因为静态方法是跟类一起加载的
    };
    public static void go(){//  静态方法，可以实例化对象调用，可以直接调用


    };
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(Student.age);//类变量；可以直接调用。但是score不行
        System.out.println(student.age);
        System.out.println(student.score);
        Student.go();
        go();

    }
}
