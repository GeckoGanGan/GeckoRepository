package com.oop.Demo05;
//子类、派生类
//子类继承了父类，就会拥有父类的全部方法！
public class Student extends Person {
    public Student() {
        //隐藏代码 默认调用了父类的无参构造
        super();//调用父类的构造器，必须要在子类的构造器的第一行
        //默认的调用父类的无参构造方法
        System.out.println("Student无参构造执行了");
    }

    public Student(String name) {
        this.name = name;
    }

    //ctrl+H
    private String name = "zhuwener";
    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();//Student
        this.print();//Student
        super.print();//Person
    }
    public void test(String name){
        System.out.println(name);//朱大可
        System.out.println(this.name);//zhuwener
        System.out.println(super.name);//zhudake
    }
}
