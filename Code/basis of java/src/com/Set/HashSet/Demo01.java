package com.Set.HashSet;
//HashSet的使用
//存储结构：数组+链表+红黑树
import java.util.HashSet;
import java.util.Iterator;
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        HashSet<String> hashSet = new HashSet<>();
        //添加元素
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("王麻子");
        hashSet.add("王麻子");//重复的元素不会被添加
        System.out.println("元素个数："+hashSet.size());
        System.out.println(hashSet.toString());
        //删除元素
        hashSet.remove("张三");
        System.out.println("删除后:"+hashSet.size());
        //遍历
        System.out.println("-------增强for遍历-------");
        for (String str:hashSet) {
            System.out.println(str);
        }
        System.out.println("-------迭代器遍历-------");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //判断
        System.out.println(hashSet.contains("李四"));
        System.out.println(hashSet.isEmpty());
    }

}
