package com.List.List;
//List的使用

import com.List.Collection.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo02 {
    public static void main(String[] args) {
        //创建集合
        List list = new ArrayList();
        //1、添加数字数据(自动装箱)
        list.add(20);//Integer类型
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.size());
        System.out.println(list.toString());

        //2、删除
        System.out.println("---------删除--------");
        //直接删除会报数组下表越界，可以把基本数值类型强制转换为Object或者对应的包装类(Integer)或者new Integer（value）
        //list.remove((Integer)20);
        //System.out.println("删除后"+ list.size());
        //System.out.println(list.toString());

        //3、补充方法sublist( int fromIndex,int toIndex):返回子集合;含头不含尾
        System.out.println("---------sublist返回子集合--------");
        List subList =  list.subList(1,3);
        System.out.println(subList.toString());

        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        Student s4 = new Student("王麻子",30);

        List list1 = new ArrayList();
        //添加
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);

        System.out.println(list1.size());
        System.out.println(list1.toString());
        //删除
        System.out.println("=======删除========");
        //list1.remove(s1);
        //System.out.println("删除后"+list1.size());
        //System.out.println(list1.toString());
        //sublist
        System.out.println("=======sublist========");
        List list2 = list1.subList(1,3);
        System.out.println("sublist"+list2.size());
        System.out.println(list2.toString());

        //迭代器便利
        System.out.println("------ListIterator迭代器遍历");
        ListIterator lit = list1.listIterator();
        while (lit.hasNext()){
            Student st = (Student)lit.next();
            System.out.println(st.toString());
        }
    }
}
