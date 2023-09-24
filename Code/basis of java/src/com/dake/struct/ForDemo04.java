package com.dake.struct;
//打印九九乘法表
public class ForDemo04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {//行数
            for (int j = 1; j <= i; j++) {////第一行循环一次，第二行循环两次，第i行循环i次
                sum = i*j;
                System.out.print(i+"*"+j+"="+sum+"\t");
            }
            System.out.println();
        }
    }
}
