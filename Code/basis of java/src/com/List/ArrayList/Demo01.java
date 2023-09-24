package com.List.ArrayList;

import com.List.Collection.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//ArrayList的使用
//存储结构：数组,查找便利比较快,增删慢
public class Demo01 {
    public static void main(String[] args) {
        //创建集合 此时size、容量都为0，每次扩容1.5倍
        ArrayList arraylist = new ArrayList<>();
        //1、添加元素
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        Student s4 = new Student("王麻子",21);
        arraylist.add(s1);
        arraylist.add(s2);
        arraylist.add(s3);
        arraylist.add(s4);
        System.out.println("-------1、添加元素--------");
        System.out.println("元素个数："+arraylist.size());
        System.out.println(arraylist.toString());
        //2、删除元素
        System.out.println("-------2、删除元素--------");
        arraylist.remove(s1);
        arraylist.remove(new Student("李四",19));//equals(this == obj)方 法比较的是地址
        System.out.println("删除之后："+arraylist.size());
        System.out.println(arraylist.toString());

        //3、遍历元素【重点】
        System.out.println("-------3、遍历元素--------");
        //3、1迭代器遍历
        System.out.println("-------3、1使用迭代器iterator--------");
        Iterator it = arraylist.iterator();
        while (it.hasNext()){
            Student student1 = (Student) it.next();
            System.out.println(student1.toString());
        }
        //ListIterator列表迭代器
        System.out.println("-------3、2使用列表迭代器LisIterator--------");
        System.out.println("-------从前往后-------");
        ListIterator lit = arraylist.listIterator();
        while (lit.hasNext()){
            Student student2 = (Student) lit.next();
            System.out.println(student2.toString());
        }
        System.out.println("-------从后往前-------");
        while(lit.hasPrevious()){
            Student student3 = (Student) lit.previous();
            System.out.println(student3.toString());
        }

        //4、判断
        System.out.println("-------4、判断元素--------");
        System.out.println(arraylist.contains(new Student("张三",18)));
        System.out.println(arraylist.isEmpty());
        //3、查找
        System.out.println("-------5、查找元素--------");
        System.out.println(arraylist.indexOf(s1));
        System.out.println(arraylist.indexOf(new Student("王麻子",21)));


    }
}
