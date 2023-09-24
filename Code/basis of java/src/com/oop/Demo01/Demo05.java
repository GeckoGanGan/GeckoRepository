package com.oop.Demo01;

public class Demo05 {
    //引用传递: 对象，本质是值传递
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name); //null
        Demo05.change(person);
        System.out.println(person.name);
    }
    public static void change(Person pp){
        //person 是一个对象：指向的---->   Person person = new Person();这是具体的一个人，可以改变属性
        pp.name="zhudake";
    }
}
//定义一个Person类，有一个属性：name
class Person{
    String name;

}
