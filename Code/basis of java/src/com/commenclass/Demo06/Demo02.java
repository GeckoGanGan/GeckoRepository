package com.commenclass.Demo06;

public class Demo02 {
    public static void main(String[] args) {
        //面试题
        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer1==integer2);//false 对象地址不同

        Integer integer3 = Integer.valueOf(100);//自动装箱
        Integer integer4 = Integer.valueOf(100);
        System.out.println(integer3==integer4);//true

        Integer integer5 = Integer.valueOf(200);
        Integer integer6 = Integer.valueOf(200);
        System.out.println(integer5==integer6);//false 超出Integer缓冲区了 integer[-128，127]
    }
}
