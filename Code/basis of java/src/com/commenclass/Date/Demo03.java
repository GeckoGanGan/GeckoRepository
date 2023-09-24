package com.commenclass.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        //1、创建SimpleDateFormat对象 y--年 M--月 d--日 m--分钟 s--秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //2、创建Date
        Date date1 = new Date();
        //3、格式化date(把时间转换为字符串)
        String str = sdf.format(date1);
        System.out.println(str);
        //4、解析(把字符串转换为时间)
        Date date2 =  sdf.parse("1990/5/4");//这里的格式必须和sdf的格式相同
        System.out.println(date2.toLocaleString());


    }
}
