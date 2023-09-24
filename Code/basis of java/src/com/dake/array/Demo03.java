package com.dake.array;

public class Demo03 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        //打印全部的数组元素
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("=============");
        //计算全部数组元素的和
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        System.out.println("===============");
        //查找对最大元素
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
