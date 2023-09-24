package com.List.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Collection的使用二 Student类
public class Demo02 {
    public static void main(String[] args) {
        //1、创建Collection对象
        Collection collection = new ArrayList();
        //2、创建Student对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        //3、添加数据
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        System.out.println("元素个数"+collection.size());
        System.out.println(collection.toString());
        //4、删除
        collection.remove(s1);
        //collection.remove(new Student("王五",20));//并不能删除集合中的s3，用为new  地址不同
        //collection.clear();//清空
        //集合中存的是对象的地址 清空后这几个对象并没有消失，删除的是地址，对象还在堆中
        System.out.println("删除之后："+collection.size());
        //5、遍历
        System.out.println("------一、增强for来遍历--------");
        for (Object obj:collection) {
            Student stu1 = (Student) obj;
            System.out.println(stu1.toString());
        }
        System.out.println("------二、迭代器遍历--------");
        Iterator it = collection.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();//强制转换
            System.out.println(s.toString());
        }
        //5、判断
        System.out.println("------判断--------");
        System.out.println(collection.contains(s2));
        System.out.println(collection.isEmpty());





    }
}
