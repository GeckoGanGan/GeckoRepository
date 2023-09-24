package com.List.Vector;

import java.util.Enumeration;
import java.util.Vector;

//Vector集合的使用 数组结构实现，查询快、增删慢;
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        Vector vector = new Vector<>();
        //1、添加元素
        System.out.println("------1、添加元素------");
        vector.add("草莓");
        vector.add("芒果");
        vector.add("苹果");
        System.out.println("元素个数："+vector.size());
        System.out.println(vector.toString());
        //2、遍历
        System.out.println("------2、遍历元素------");
        System.out.println("------2、1、枚举器------");
        Enumeration en = vector.elements();
        while (en.hasMoreElements()){
            String o = (String) en.nextElement();
            System.out.println(o);
        }
        //3、判断
        System.out.println("------3、判断------");
        System.out.println(vector.contains("西瓜"));
        System.out.println(vector.isEmpty());
        //4、Vector其他方法
        System.out.println("------4、Vector其他的方法------");
        System.out.println(vector.firstElement());
        System.out.println(vector.get(2));
        System.out.println(vector.elementAt(2));

    }
}
