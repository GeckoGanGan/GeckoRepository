package com.List.Collection;

/*
* Collection接口的使用
* （1）添加远胜于
* （2）删除元素
* （3）遍历元素
* （4）判断
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        Collection collection = new ArrayList();
        //（1）添加远胜于
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("榴莲");
        System.out.println("元素个数"+collection.size());
        System.out.println(collection.toString());
        //（2）删除元素
        // collection.remove("榴莲");
        // collection.clear(); //清空
        System.out.println(collection.size());
        //（3）遍历元素[重点！！！]
        //第一种方式
        System.out.println("---------第一种方式：增强for---------");
        for (Object object: collection){
            System.out.println(object);
        }
        //第二种饭方式 迭代器 专门用来遍历集合的方法
        System.out.println("---------第一种方式：iterator---------");
        //hasNext() 有没有下一个元素
        //next()  获取下一个元素
        // remove() 删除当前元素
        Iterator it =  collection.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
            //迭代过程中不允许collection删除方法： collection.remove(s)
            // 否则会出现异常ConcurrentModificationException（并发修改异常）
            //collection.remove(s);
            it.remove();
        }
        System.out.println("元素个数："+collection.size());

        //（4）判断
        System.out.println(collection.contains("西瓜"));
        System.out.println(collection.isEmpty());


    }
}
