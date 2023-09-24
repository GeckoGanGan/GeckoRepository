package com.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet 红黑树
//存储结构 红黑树
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<String> treeSet = new TreeSet<>();
        //1、添加元素
        treeSet.add("acb");
        treeSet.add("hello");
        treeSet.add("xys");
        treeSet.add("zysf");
        //treeSet.add("zysf");//重复元素
        System.out.println("元素个数:"+treeSet.size());
        System.out.println(treeSet.toString());
        //2、删除
        treeSet.remove("hello");
        System.out.println("删除之后:"+treeSet.size());
        System.out.println(treeSet.toString());
        //3、遍历
        System.out.println("------增强for------");
        for (String str:treeSet) {
            System.out.println(str);
        }
        System.out.println("------迭代器------");
        Iterator<String> it = treeSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //4、判断
        System.out.println(treeSet.contains("acb"));
        System.out.println(treeSet.isEmpty());
    }
}
