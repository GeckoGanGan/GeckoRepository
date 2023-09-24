package com.dake.base;

public class Demo05 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意益处问题
        //jdk7的特性
        int money=10_0000_0000;
        int years=20;
        int total =money*years;//-1474836480，计算的时候溢出了
        long total2 =money*years;//默认是int,转换之前已经出现问题了

        long total3=money*((long)years);//先把一个数转换为long类型
        System.out.println(total3);
    }
}
