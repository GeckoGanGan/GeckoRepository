package com.dake.array;

public class Demo01 {
    public static void main(String[] args) {
        int[] nums;//声名数组
        int sum = 0;
        nums = new int[10];// 创建数组 这里面可以存放是个类型的数字
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
            sum += nums[i];
            System.out.println("nums["+i+"]:"+nums[i]);
            System.out.println(sum);
        }
    }
}
