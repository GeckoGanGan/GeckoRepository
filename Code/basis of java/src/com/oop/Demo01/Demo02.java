package com.oop.Demo01;

public class Demo02 {
    //静态方法 static

    //非静态方法
    public static void main(String[] args) {
        // 对象类型 对象名 = 对象值
        Student student = new Student();
        student.say();
    }

    //static 和类一起加载的
    public static void a(){
        //b();报错
    }
    //对象创建后才存在 类实例化
    public void b(){

    }
}
