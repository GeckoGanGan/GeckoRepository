package com.commenclass.Demo05;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);

        //1、getClass方法
        //判断s1和s2这两个对象是不是同一个类型
        System.out.println("=========getClass==========");
        Class class1 = s1.getClass();
        Class class2 = s2.getClass();
        System.out.println(class1==class2);

        //2、hashCode方法
        System.out.println("=========hashCode==========");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //3、toString方法
        System.out.println("=========toString==========");
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        //4、equals方法:判断两个对象地址是否相等
        System.out.println("=========equals==========");
        System.out.println(s1.equals(s2));//false 地址不相同
        Student s3 = new Student("小明",12);
        Student s4 = new Student("小明",12);
        System.out.println(s3.equals(s4));//true 重写equals方法，判断两个对象的内容是否相等


    }
}
