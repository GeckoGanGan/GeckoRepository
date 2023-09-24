package com.dake.array;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9078,2423,213};
        System.out.println(a);
        //打印数组对象
        System.out.println(Arrays.toString(a));
        //数组排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //数组填充
        Arrays.fill(a,1,2,0);
    }
    public static void printArr(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                System.out.print("[");
            }
            if (i==a.length-1){
                System.out.println(a[i]+"]");
            }
            System.out.print(a[i]+",");
        }
    }
}
