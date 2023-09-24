package com.List.Generic.GenericSet;

import com.List.Collection.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("王麻子");
        for (String str:arrayList) {
            System.out.println(str);
        }
        ArrayList <Student> arrayList2 = new ArrayList<Student>();
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        Student s4 = new Student("王麻子",21);
        arrayList2.add(s1);
        arrayList2.add(s2);
        arrayList2.add(s3);
        arrayList2.add(s4);
        Iterator<Student> it = arrayList2.iterator();
        while (it.hasNext()){
            Student st = it.next();//不用强制转换
            System.out.println(st);
        }
    }
}
