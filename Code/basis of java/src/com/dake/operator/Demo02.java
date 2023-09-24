package com.dake.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 1234535345L;
        int b = 123;
        short c = 10;
        byte d = 8;

        double e = 234;
        System.out.println(e+a+b+c+d);//Double
        System.out.println(a+b+c+d);//Long
        System.out.println(b+c+d);//Int
        System.out.println(c+d);//Int
    }
}
