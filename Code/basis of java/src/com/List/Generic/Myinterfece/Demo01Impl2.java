package com.List.Generic.Myinterfece;

public class Demo01Impl2<T> implements Demo01<T> {
    @Override
    public T server(T t) {
        System.out.println(t);
        return t;
    }
}
