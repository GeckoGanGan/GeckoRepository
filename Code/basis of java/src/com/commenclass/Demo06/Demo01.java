package com.commenclass.Demo06;

public class Demo01 {
    public static void main(String[] args) {
        //类型转换：装箱，基本类型转换为引用类型
        //jdk1.5之前
        //基本类型
        int num1 = 18;
        //使用Integer类创建对象
        Integer integer1 = new Integer(num1);
        Integer integer2 = Integer.valueOf(num1);
        System.out.println("装箱");
        System.out.println(integer1);
        System.out.println(integer2);

        //类型转换：拆箱，把引用类型转换为基本类型
        Integer integer3 = new Integer(100);
        int num2 = integer3.intValue();
        System.out.println("拆箱");
        System.out.println(num2);

        //jdk1.5之后，提供了自动装箱和拆箱
        int age = 30;
        //自动装箱
        Integer integer4 = age;
        System.out.println("自动装箱");
        System.out.println(integer4);
        //自动拆箱
        int age2 = integer4;
        System.out.println("自动拆箱");
        System.out.println(age2);

        System.out.println("-------------基本数据类型和字符串之间的转换---------------");
        //1 基本数据类型和字符串之间的转换
        //1.1 基本类型转子字符串
        int n1 = 15;
        String s1 = n1+"";
        //1.2 Integer中的toString()方法
        String s2 = Integer.toString(n1,16);//f
        System.out.println(s1);
        System.out.println(s2);

        //2 字符串转换为基本类型
        String str = "150";//注意子字符串内只能是数字
        //使用Integer.parseInt(str)
        int n2 = Integer.parseInt(str);
        System.out.println(n2);

        //boolean类型转换为字符串，"true"---->true 非"true"---->false
        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

    }
}
