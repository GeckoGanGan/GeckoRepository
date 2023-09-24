package com.List.LinkedList;

import com.List.Collection.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//LinkedList 双向链表
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        LinkedList<Object> linkedList = new LinkedList<>();
        //1、添加元素
        System.out.println("-------添加元素-------");
        Student s1 = new Student("张飞",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        linkedList.add(s1);
        linkedList.add(s2);
        //linkedList.add(s3);
        //linkedList.add(s3);
        System.out.println("元素个数:"+linkedList.size());
        System.out.println(linkedList);
        //2、删除元素
        System.out.println("-------删除元素-------");
        //linkedList.remove(s1);
        //linkedList.remove(new Student("李四",19));
        //linkedList.clear();
        System.out.println("删除之后:"+linkedList.size());
        System.out.println(linkedList.toString());

        //3、遍历
        System.out.println("-------遍历-------");
        System.out.println("-------3、1 for 遍历-------");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("-------3、1 增强for 遍历-------");
        for (Object obj:linkedList) {
            Student st1 = (Student) obj;
            System.out.println(st1.toString());
        }
        System.out.println("-------3、1 迭代器 遍历-------");
        System.out.println("-------Iterator迭代器 遍历-------");
        Iterator it = linkedList.iterator();
        while (it.hasNext()){
            Student st2 = (Student) it.next();
            System.out.println(st2.toString());
        }
        System.out.println("-------ListIterator迭代器 遍历-------");
        ListIterator lit = linkedList.listIterator();
        while (lit.hasNext()){
            Student st3 = (Student) lit.next();
            System.out.println(st3.toString());
        }
        //4、判断
        System.out.println("-------判断-------");
        System.out.println(linkedList.contains(s1));
        System.out.println(linkedList.isEmpty());
        //5、获取
        System.out.println("-------获取下标-------");
        System.out.println(linkedList.indexOf(s2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


    }
}
