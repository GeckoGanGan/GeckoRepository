package com.commenclass.Demo06;

import java.math.BigDecimal;

public class Demo07 {
    public static void main(String[] args) {
        //double 是近似值存储 容易出现精度丢失
        double a = 1.0;
        double b = 0.9;
        System.out.println(a-b);
        double result = (1.4-0.5)/0.9;
        System.out.println(result);//精度丢失

        //BigDecimal,打的浮点数精确计算
        BigDecimal bd1 = new BigDecimal("0.9");
        BigDecimal bd2 = new BigDecimal("1.0");
        //减法
        BigDecimal r1 = bd1.subtract(bd2);
        System.out.println(r1);
        //加法
        BigDecimal r2 = bd1.add(bd2);
        System.out.println(r2);
        //乘法
        BigDecimal r3 = bd1.multiply(bd2);
        System.out.println(r3);
        //除法
        BigDecimal r4 = bd1.divide(bd2,2,BigDecimal.ROUND_HALF_UP);
        //如果除不尽会报异常,scale：保留几位小数，四舍五入
        System.out.println(r4);

    }
}
