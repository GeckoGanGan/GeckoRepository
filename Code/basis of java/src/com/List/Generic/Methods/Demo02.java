package com.List.Generic.Methods;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
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
        Demo02 demo02 = new Demo02();
        demo02.getUperNumber(doubles);
        demo02.getUperNumber(integers);
        demo02.getData(strings);
        //demo02.getUperNumber(strings);
    }

}
