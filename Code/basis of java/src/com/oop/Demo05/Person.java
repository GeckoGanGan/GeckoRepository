package com.oop.Demo05;

//在Java中所有的类都默认直接或间接继承Object类
public class Person /*extends Object*/ {
  public Person() {
        System.out.println("Person无参执行了");
    }
    public Person(String name) {
        System.out.println("Person无参执行了");
    }

    protected String name = "zhudake";
    //私有的东西无法背继承 属性和方法
    public void print(){
        System.out.println("Person");
    }


}
