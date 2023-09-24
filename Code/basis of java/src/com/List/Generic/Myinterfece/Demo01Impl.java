package com.List.Generic.Myinterfece;

public class Demo01Impl implements Demo01<String> {
    @Override
    public String server(String t) {
        System.out.println(t);
        return t;
    }
}
