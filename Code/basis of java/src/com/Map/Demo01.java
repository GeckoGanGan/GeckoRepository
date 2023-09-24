package com.Map;
/*
* Map接口的使用
* 特点：（1）存储键值对 （2）键不能重复，值可以重复 （3）无序
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        //创建map集合
        Map<String,String> map = new HashMap<>();
        //1、添加元素
        map.put("名字","张三");
        map.put("年龄","18");
        map.put("性别","男");
        map.put("专业","软件工程");
       // map.put("专业","计算机");//添加重复的，value会替换掉之前的value
        System.out.println("元素个数:"+map.size());
        System.out.println(map.toString());
        //2、删除
        map.remove("专业");
        System.out.println("删除之后:"+map.size());
        System.out.println(map.toString());
        //3、遍历
        System.out.println("-------3、1keySet-------");
       //Set<String> keySet= map.keySet();
        for (String key: map.keySet()) {
            System.out.println(key+":"+map.get(key));
        }
        System.out.println("-------3、2 entrySet-------");
        //Set<Map.Entry<String,String>> entries =  map.entrySet();
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
        //4、判断
        System.out.println(map.containsKey("姓名"));
        System.out.println(map.containsValue("张三"));
        System.out.println(map.isEmpty());

    }
}
