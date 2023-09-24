package com.Set.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* Collections工具类的使用
* */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(30);
        list.add(36);
        list.add(34);
        list.add(44);
        //sort排序
        System.out.println("排序之前："+list.toString());
        Collections.sort(list);
        System.out.println("排序之后:"+list.toString());

        //binarySearch 二分查找
        int i = Collections.binarySearch(list,36);
        System.out.println("找到的位置："+i);
        //copy 复制
        List<Integer> dest = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            dest.add(0);
        }
        Collections.copy(dest,list);
        System.out.println("复制之后："+dest.toString());
        //reverse 反转
        Collections.reverse(list);
        System.out.println("反转之后："+list.toString());
        //shuffle 打乱排序
        Collections.shuffle(list);
        System.out.println("打乱排序之后："+list.toString());
        //补充List 转为数组
        System.out.println("-----List 转为数组----");
        Integer[] arr =  list.toArray(new Integer[0]);
        System.out.println("数组长度:"+arr.length);
        System.out.println("转换的数组："+Arrays.toString(arr));
        //数组转为集合
        System.out.println("-----List 转为数组----");
        String[] strings ={"张三","李四","王五","王麻子"};
        System.out.println("----原数组为：------");
        for (String string : strings) {
            System.out.print(string + "\t");
        }
        System.out.println();
        List<String> list1 =  Arrays.asList(strings);
        //数组转换为集合后，不能添加和删除，因为数组的长度是固定的，转换为集合后也是固定的
        System.out.println("数组转换为集合："+list1.size());
        System.out.println("数组转换为集合："+list1.toString());
        //把基本类型的数组转化为集合需要先转换为包装类
        Integer[] nums = {1,4,5,23,6};
        List<Integer> list2 = Arrays.asList(nums);
        System.out.println(list2);


    }
}
