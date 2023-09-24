package com.dake.base;

public class Demo07 {
    //类变量 static
    static double salary=2500;
    //属性：变量

    //实例变量：从属于对象;如果不初始化值，这个类型就是默认值
    String name;
    int age;
    //main方法
    public static void main(String[] args) {
        //局部变量：必须声名和初始化值
        int i=10;
        System.out.println(i);

        Demo07 demo07 = new Demo07();
        System.out.println(demo07.age);
        System.out.println(demo07.name);

        //类变量 static
        System.out.println(salary);

    }
    //其他方法
    public void add(){


    }
}
