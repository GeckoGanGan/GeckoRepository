package com.dake.base;

public class Demo03 {
    public static void main(String[] args) {
        //拓展 进制 二进制0b 十进制 八进制0 十六进制0x
        int i=10;
        int i2=010;//八进制
        int i3=0x10;//十六进制  0~9 A~F 16
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("================");

        //浮点数拓展? 银行业务如何表示？钱
        //float  有限 离散 舍入误差 大约 接近但不大于
        //double
        //BigDecimal 数学工具类
        //最好完全使用浮点数比较！！！
        //最好完全使用浮点数比较！！！
        float f=0.1f;//0.1
        double d=1.0/10;//0.1
        System.out.println(f==d);//false
        float d1=121223232f;
        float d2=d1+1;
        System.out.println(d1==d2);//true
        System.out.println("================");

        //字符拓展
        char c1='a';
        char c2='中';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int) c2);
        //所有的字符本质还是数字
        //编码 Unicode 2字节 65536 Excel 2 16=65536
        //U0000 UFFFF
        char c3='\u0061';
        System.out.println(c3);//a

        //转移字符
        // \t 制表符
        //。。。。
        System.out.println("com.dake.base.Hello\nWorld");

        System.out.println("================");
        String sa=new String("com.dake.base.Hello world");
        String sb=new String("com.dake.base.Hello World");
        System.out.println(sa==sb);
        String sc="com.dake.base.Hello World";
        String sd="com.dake.base.Hello World";
        System.out.println(sc==sd);
        //对象 从内存分析

        //布尔值拓展
        boolean flag=true;
        if(flag==true){//等同于if(flag)

        }
        if(flag){//老手 代码越精简易读

        }
    }
}
