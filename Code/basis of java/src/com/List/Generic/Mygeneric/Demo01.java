package com.List.Generic.Mygeneric;
//泛型类
//语法 类名<T> T是类型占位符，表示是一种引用类型，可以写多个，用逗号隔开
public class Demo01<T> {
    //使用泛型创建变量
    //1、创建变量
    T t;
    //2、作为方法的参数
    public void show(T t){
       // T t1 = new T(); 不能这样直接实例化 因为不能保证传过来的类型构造方法一定能用
        System.out.println(t);
    }
    //3、使用泛型作为方法的返回值
    public T getT(){
        return t;
    }

}
