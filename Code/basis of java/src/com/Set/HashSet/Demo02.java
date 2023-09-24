package com.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

//HashSet的使用
//存储结构：数组+链表+红黑树
/*
* (1)根据hashcode计算的保存位置，如果此位置为空，则直接把保存，如果不为空执行第二步
* (2)再执行equals方法，如果equals方法为true，则认为是重复的，否则，形成链表
* */
public class Demo02 {
    public static void main(String[] args) {
        //创建集合
        HashSet<Person> persons = new HashSet<>();
        //添加数据
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",19);
        Person p3 = new Person("王五",20);
        Person p4 = new Person("王麻子",21);
        //1、添加元素
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(new Person("王麻子",21));//这里的是新的一个对象，地址不相同，所以能添加进去
        //perosns.add(p4);//重复元素不能添加
        System.out.println("元素个数："+persons.size());
        System.out.println(persons.toString());

        //2、删除
       // persons.remove(p1);
        //persons.remove(new Person("王麻子",21));
        // 现在能删除，没有重写hashCode和equals方法的时候是不可以的
        System.out.println("删除之后："+persons.size());
        System.out.println(persons.toString());
        //3、遍历
        System.out.println("------增强for遍历-------");
        for (Person perosn:persons) {
            System.out.println(perosn.toString());
        }
        System.out.println("------迭代器遍历-------");
        Iterator<Person> it = persons.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //4、判断
        System.out.println(persons.contains(p1));
        System.out.println(persons.isEmpty());
        System.out.println(persons.contains(new Person("张三",18)));//true
    }
}

