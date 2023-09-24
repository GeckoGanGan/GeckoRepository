package com.dake.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //计算0-100之间的奇数和偶数的和
        int oddSum = 0;//奇数和
        int evenSum = 0;//偶数和
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){//奇数
                oddSum+=i;
            } else {//偶数
                evenSum+=i;
            }

        }
        System.out.println("奇数的和："+oddSum);
        System.out.println("偶数的和："+evenSum);
    }
}
