package com.dake.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //我们可以输入多个数字，求其总和和平均数，没输入一个数字用回车确定，
        // 通过输入非数字来结束输入并且输出结果
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m++;
            sum+=x;
            System.out.println("你输入了"+m+"个数据,当前和为："+sum);
        }
        System.out.println(m+"个输入的数字的和："+sum);
        System.out.println(m+"个输入的数字的平均数："+(sum/m));
        scanner.close();
    }
}
