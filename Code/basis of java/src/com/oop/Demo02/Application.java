package com.oop.Demo02;

//一个项目只有一个main方法
public class Application {
    public static void main(String[] args) {
        // new 实例化对象
        Person person = new Person("zhudake");
        System.out.println(person.name);//null

    }





}
/*
 //实例化对象  类是抽象的 需要实例化
        //类实例化后会返会一个自己的对象
        //student就是一个Student类的具体实例
        Student xiaohong = new Student();
        Student xiaoming = new Student();

        xiaoming.name = "xiaoming";
        xiaoming.age = 18;

        System.out.println(xiaoming.name+"\t"+xiaoming.age);
        System.out.println(xiaohong.name+"\t"+xiaohong.age);

*/