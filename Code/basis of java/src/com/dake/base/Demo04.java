package com.dake.base;

public class Demo04 {
    public static void main(String[] args) {
        int i=128;
        byte b=(byte)i;//高到低 内存溢出
        double c=i;//高到低
        //强制转换 （类型）变量名
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        /*
        注意：
        1.不能对布尔值进行转换
        2.不能把对象类型转换为不相干的类型
        3.在把高容量转换到低容量的时候，强制转换
        4.转换的时候可能会存在内存益处，或者精度问题！
        */
        System.out.println("-------------------");
        System.out.println((int)23.7);//23
        System.out.println((int)-45.76f);//-45

        System.out.println("-------------------");
        char d='a';
        int e=d+1;
        System.out.println(e);
        System.out.println((char)e);
    }
}
