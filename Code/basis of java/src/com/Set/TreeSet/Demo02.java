package com.Set.TreeSet;
//TreeSet的使用
//存储结构 红黑树
//要求：元素必须要实现Comparable接口 compareTo()方法的返回值为0 认为是重复元素
import com.Set.HashSet.Person;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo02 {
    public static void main(String[] args) {
        //创建集合
       TreeSet<Person> persons = new TreeSet<>();
        Person p1 = new Person("zhangsan",18);
        Person p2 = new Person("lisi",19);
        Person p3 = new Person("wangwu",20);
        Person p4 = new Person("wangmazi",21);
        Person p5 = new Person("wangmazi",22);
        Person p6 = new Person("wangmazi",23);
        //1、添加元素
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        System.out.println("元素个数:"+persons.size());
        System.out.println(persons.toString());
        //2、删除
        persons.remove(p1);
        //persons.remove(new Person("lisi",19));
        System.out.println("删除之后："+persons.size());
        System.out.println(persons.toString());
        //3、遍历
        System.out.println("------增强for------");
        for (Person person:persons) {
            System.out.println(person);
        }
        System.out.println("------迭代器------");
        Iterator<Person> it = persons.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //4、判断
        System.out.println(persons.contains(p2));
        System.out.println(persons.isEmpty());

    }
}
