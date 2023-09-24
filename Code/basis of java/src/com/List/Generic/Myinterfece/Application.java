package com.List.Generic.Myinterfece;

public class Application {
    public static void main(String[] args) {
        //第一种实现方式（实例化之前确定泛型类的引用类型）
        Demo01Impl demo01 = new Demo01Impl();
        demo01.server("hello");
        //第二种实现方式（实例化的时确定泛型类的引用类型）
        Demo01Impl2<Integer> integerDemo01Impl2 = new Demo01Impl2<>();
        integerDemo01Impl2.server(1000);
    }
}
