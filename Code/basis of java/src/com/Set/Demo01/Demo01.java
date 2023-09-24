package com.Set.Demo01;
//Set的使用
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//测试Set接口的使用
//特点：无序、无下标、元素不可重复。
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        Set<String> set = new HashSet<>();
        //1、添加数据
        set.add("小米");
        set.add("苹果");
        set.add("vivo");
        set.add("oppo");
        System.out.println("元素个数："+set.size());
        System.out.println(set.toString());//无顺序
        //2、删除元素
        //set.remove("苹果");
        //System.out.println("删除后:"+set.toString());
        //3、遍历
        //3、1 增强for
        System.out.println("------增强for遍历------");
        for (String str:set) {
            System.out.println(set.toString());
        }
        //3、2迭代器便利
        System.out.println("------迭代器遍历------");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //判断
        System.out.println(set.contains("小米"));
        System.out.println(set.isEmpty());
    }
}
