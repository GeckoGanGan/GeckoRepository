package com.commenclass.Date;

import java.util.Calendar;

public class Demo02 {
    public static void main(String[] args) {
        //1、创建Calender对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toLocaleString());
        //2、获取时间信息
        int year = calendar.get(Calendar.YEAR);
        int month =calendar.get(Calendar.MONTH);//月从0~11
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);//二十四小时制
        int minu = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year+"年"+(month+1)+"月"+day+"日"+hour+"时"+minu+"分"+second+"秒");
        //3、修改时间
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.DAY_OF_MONTH,5);
        System.out.println(calendar1.getTime().toLocaleString());
        //4、 add 基于当前时间来增加或者减少
        calendar1.add(Calendar.HOUR,1);//增加一个小时 减一小时就设置为-1
        System.out.println(calendar1.getTime().toLocaleString());
        //5、补充方法
        int max = calendar1.getActualMaximum(Calendar.DAY_OF_MONTH);//获取当前月的最大天数
        int min = calendar1.getActualMinimum(Calendar.DAY_OF_MONTH);//获得当前月的最小天数
        System.out.println(max);
        System.out.println(min);


    }
}
