package com.List.Generic.Methods;

//泛型方法 有界的类型参数
public class MaximumTest {
    public <T extends Comparable<T>> T maximum(T t1,T t2,T t3){
        T max = t1;
        if(t2.compareTo(max)>0){
            max = t2;
        }
        if(t3.compareTo(max)>0){
            max = t3;
        }
        System.out.println("最大值为："+max);
        return max;
    }

    public static void main(String[] args) {
        MaximumTest maximumTest = new MaximumTest();
        maximumTest.maximum(4,3,8);
        maximumTest.maximum(1.1,2.2,3.3);
        maximumTest.maximum("java","c","php");
    }

}
