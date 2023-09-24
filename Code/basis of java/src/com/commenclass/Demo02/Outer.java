package com.commenclass.Demo02;

public class Outer {
    private String name = "张三";
    private int age = 20;
    private static int a = 0;

    //静态内部类的级别和外部类相同
    static class Inner{
        private String address = "北京";
        private String phone = "123456";
        private static String sex = "男";
        public void show(){
            //如何来调用外部类的属性
            //1、先创建外部类对象
            Outer outer = new Outer();
            //2、通过外部类对象来调用外部类属性
            System.out.println(outer.name);
            System.out.println(outer.age);
            //只能直接访问外部类的静态成员（实例成员需要实例化外部类对象）
            System.out.println(a);
            //调用静态内部类的属性和方法
            System.out.println(address);
            System.out.println(phone);
            //调用静态内部类的静态属性,通过类名来访问
            System.out.println(Inner.sex);
        }

    }
}
