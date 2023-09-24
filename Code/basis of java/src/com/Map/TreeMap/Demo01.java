package com.Map.TreeMap;

import com.Map.HashMap.Student;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
* TreeMap的使用
* 存储结构：红黑树
* */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        TreeMap<Student,String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int n1 = o1.getStuNo()-o2.getStuNo();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1==0 ? n2:n1;
            }
        });
        //1、添加元素
        Student s1 = new Student("张三",111);
        Student s2 = new Student("李四",112);
        Student s3 = new Student("王五",113);

        treeMap.put(s1,"北京");
        treeMap.put(s2,"天津");
        treeMap.put(s3,"上海");
        treeMap.put(new Student("王五",113),"南京");
        System.out.println("元素个数："+treeMap.size());
        System.out.println(treeMap);
        //2、删除

        //treeMap.remove(new Student("王五",113));
        //treeMap.remove(s1);
        System.out.println("删除之后："+treeMap.size());
        System.out.println(treeMap);
        //3、遍历
        System.out.println("---------3、1 keySet()-------");
        //Set<Student> keyset = treeMap.keySet();
        for (Student st:treeMap.keySet()) {
            System.out.println(st+"-----"+treeMap.get(st));
        }
        System.out.println("---------3、2 entrySet()-------");
        for (Map.Entry<Student,String> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        }
        //4、判断
        System.out.println(treeMap.containsKey(s1));
        System.out.println(treeMap.containsValue("北京"));

    }
}
