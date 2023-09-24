package com.dake.struct;

public class WhileDemo03 {
    public static void main(String[] args) {
        //计算1-100的和

        int i = 0;
        int sum = 0;
        while (i<=100){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
