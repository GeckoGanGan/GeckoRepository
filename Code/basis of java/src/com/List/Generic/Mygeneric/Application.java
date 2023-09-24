package com.List.Generic.Mygeneric;

public class Application {
    public static void main(String[] args) {
        //泛型类创建对象
        //注意：1、泛型只能是引用类型 2、不同泛型对象之间不能相互赋值
        Demo01<String> stringDemo01 = new Demo01<>();
        stringDemo01.t = "hello";
        stringDemo01.show("大家好，学个屁的Java，别学了");
        String result = stringDemo01.getT();
        System.out.println(result);

        Demo01<Integer> integerDemo01 = new Demo01<>();
        integerDemo01.t = 20;
        integerDemo01.show(30);
        System.out.println(integerDemo01.getT());

        //Demo01<String> stringDemo011 = integerDemo01; //不同泛型对象不能相互复制

    }
}
