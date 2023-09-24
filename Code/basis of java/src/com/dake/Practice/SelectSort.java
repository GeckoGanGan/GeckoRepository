package com.dake.Practice;


import java.util.Scanner;
//选择排序
public class SelectSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
        }
        scanner.close();
        int[] result =  selectSort(arrays);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] selectSort(int[] arrays){
        int index,temp;  //index用来记录最小值下标 temp用来作为变量交换
        for (int i = 0; i < arrays.length-1; i++) {
            index = i ;  //总共需要比较的轮数
            for (int j = i+1; j <arrays.length ; j++) {
                if(arrays[j]<arrays[index]){  //每一次都和相邻的数组元素比较
                    index = j;  //如果相邻的数组元素更小，把此元素的下标赋值给index，用来记录最小值
                }
            }  //每一次循环以后的index下标对应此次遍历得出的最小值
            temp = arrays[i];
            arrays[i] = arrays[index];  //每一轮遍历结束后将arrays[index]赋值给本轮遍历的第一个数组元素
            arrays[index] = temp; //将本轮的第一个数组元素赋值位最小值后，再把第一个遍历的数组元素放到原来本身的位置（index），然后开始下一轮
            // 遍历
        }
        return arrays;
    }
}
