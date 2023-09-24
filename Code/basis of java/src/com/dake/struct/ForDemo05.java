package com.dake.struct;

public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};//定义数组
        for (int i =0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("==============");
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
