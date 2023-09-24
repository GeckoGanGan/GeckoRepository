package com.Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;
/*
* 实现字符串类型按长度排序
* */
public class Demo04 {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               int n1 = o1.length()-o2.length();//按长度比较
               int n2 = o1.compareTo(o2);//长度相等就按照字母表比较规则
               return n1==0 ? n2:-n1;//n2大于0，按字母表正序，否则按逆序。n2大于0 按length从小到大，否则从大到小
            }
        });
        strings.add("helloworld");
        strings.add("lisi");
        strings.add("wangwu");
        strings.add("beijing");
        strings.add("xian");
        strings.add("nanjing");
        System.out.println("原素材个数："+strings.size());
        System.out.println(strings.toString());
    }
}
