package com.commenclass.Date;


import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        //1、创建Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.toLocaleString());
        //坐昨天的此时此刻
        Date date2 = new Date(date1.getTime()-(60*60*24*1000));
        System.out.println(date2.toLocaleString());
        //2、方法after和before
        boolean b1 = date1.after(date2);// true 今天在昨天之后
        boolean b2 = date1.before(date2);// false 今天不在在昨天之前
        System.out.println(b1);
        System.out.println(b2);

        //比较compareTo()
        int b3 = date1.compareTo(date2);// date1 - date2 = 1
        int b4 = date2.compareTo(date1);// -1
        System.out.println(b3);
        System.out.println(b4);

        //equals() 比较时间是否相等
        boolean b5 = date1.equals(date2);
        System.out.println(b5);// false

    }
}
