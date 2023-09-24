package com.commenclass.Demo07;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class Demo01 {

    public static void main(String[] args) {
        //1、arraycopy：数组的赋值
        //src：源数组
        // srcPos:从哪个位置开始复制
        //dest:目标数组
        //destPos:目标数组的位置
        //length:复制的长度
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] dest = new int[8];
        System.arraycopy(arr,4,dest,4,4);
        System.out.println(Arrays.toString(dest));

        //2、currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            for (int j = -9999999; j < 9999999; j++) {
               int result = i+j;
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+(end-start));//计算程序执行时间

        //3、System.gc() 告诉垃圾回收器回收垃圾
        new Student("aaa",18);
        new Student("bbb",19);
        new Student("ccc",20);
        System.gc();//告诉垃圾回收器回收

        //4、exit() 退出JVM
        System.exit(0);
        System.out.println("程序结束了。。。。");//不会被打印，已经退出JVM了

    }
}
