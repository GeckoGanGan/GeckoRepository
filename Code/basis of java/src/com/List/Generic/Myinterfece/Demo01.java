package com.List.Generic.Myinterfece;
//泛型接口
//语法 接口名：<T>
//注意：不能创建泛型常量
public interface Demo01 <T>{
    String name = "张三";
    T server(T t);



}
