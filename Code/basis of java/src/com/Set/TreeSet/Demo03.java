package com.Set.TreeSet;

import com.Set.HashSet.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo03 {
    public static void main(String[] args) {
        //创建集合,并指定了比较规则
        TreeSet<Person> persons = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               int n1 = o1.getAge()-o2.getAge();
               int n2 = o1.getName().compareTo(o2.getName());
               return n1==0? n2:n1;//如果年龄相等比较名字，如果年龄不相等则比较年龄
            }
        });
        Person p1 = new Person("zhangsan",18);
        Person p2 = new Person("lisi",19);
        Person p3 = new Person("wangwu",20);
        Person p4 = new Person("lisi",20);
        //1、添加元素
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        System.out.println("元素个数:"+persons.size());
        System.out.println(persons.toString());

    }
}
