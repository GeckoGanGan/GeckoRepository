package com.List.Generic.Methods;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    //根据List的不同类型打印下标为0的元素
    public void getData(List<?> data){
        System.out.println("data:"+data.get(0));
    }
    public void getUperNumber(List<? extends Number> data){
        System.out.println("data:"+data.get(0));
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        strings.add("hello");
        doubles.add(1.2);
        integers.add(30);
        Demo01 demo01 = new Demo01();
        //demo01.getUperNumber(strings);
        demo01.getUperNumber(doubles);
        demo01.getUperNumber(integers);
        demo01.getData(strings);
    }
}
