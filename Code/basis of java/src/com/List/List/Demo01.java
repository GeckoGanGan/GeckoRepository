package com.List.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//List子接口的使用
/*
* 特点：有序、有下标、可以重复
* */
public class Demo01 {
    public static void main(String[] args) {
        //先创建一个集合
        List list = new ArrayList<>();
        //1、添加元素
        list.add("小米");
        list.add("苹果");
        list.add("华为");
        System.out.println("元素个数："+list.size());
        System.out.println(list.toString());
        //2、删除元素
        //list.remove("苹果");
        //list.remove(0);
        System.out.println(list.size());
        System.out.println(list.toString());

        //3、遍历【重点！！！】
        //使用for遍历
        System.out.println("-------3、1for遍历-------");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------3、2增强for遍历-------");
        for (Object obj:list) {
            System.out.println(obj);
        }
        System.out.println("-------3、3迭代器遍历-------");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------3、4列表迭代器-------");
        ListIterator lit = list.listIterator();
        System.out.println("-----------3、4、1列表迭代器从前往后-----------");
        while (lit.hasNext()){
            System.out.println(lit.nextIndex()+":"+lit.next());

        }
        System.out.println("-----------3、4、1列表迭代器从后往前-----------");
        /*while (lit.hasPrevious()){
            System.out.println(lit.previousIndex()+":"+lit.previous());
        }*/
        //4、判断
        System.out.println("-------3、5判断-------");
        System.out.println(list.contains("苹果"));
        System.out.println(list.isEmpty());

        //5、获取位置
        System.out.println(list.indexOf("华为"));


    }
}
