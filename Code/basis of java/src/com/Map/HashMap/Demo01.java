package com.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*HashMap的使用
* 存储结构：哈希表：数组+链表+红黑树
* 使用key的hashcode和equals作为重复一依据
* */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合 刚创建还没添加元素 table=null size=0 目的：节省空间
        HashMap<Student,String> students = new HashMap<>();
        //1、添加元素
        Student s1 = new Student("张三",111);
        Student s2 = new Student("李四",112);
        Student s3 = new Student("王五",113);
        students.put(s1,"北京");
        students.put(s2,"天津");
        students.put(s3,"上海");
        students.put(new Student("张三",111),"南京");
        System.out.println("元素个数"+students.size());
        System.out.println(students.toString());
        //2、删除
        //students.remove(s1);
        System.out.println("删除之后:"+students.size());
        System.out.println(students.toString());
        //3、遍历
        Set<Student> studentSet = students.keySet();
        System.out.println("-------3、1 keySet--------");
        for (Student key: studentSet) {
            System.out.println(key+":"+students.get(key));
        }
        System.out.println("-------3、1 keySet--------");
        Set<Map.Entry<Student,String>> entries = students.entrySet();
        for (Map.Entry<Student,String> entry:entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //4、判断
        System.out.println(students.containsKey(s1));
        System.out.println(students.containsKey(new Student("张三",111)));
        System.out.println(students.containsValue("北京"));
        System.out.println(students.isEmpty());
    }

}
