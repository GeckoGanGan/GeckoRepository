package com.commenclass.Demo06;

public class Demo04 {
    public static void main(String[] args) {
        String str = "this is a text";

        //1、将str按单吃输出
        String[] arr = str.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------");

        //2、将str中的text替换为practice
        String str1 = str.replace("text","practice");
        System.out.println(str1);
        System.out.println("------------");

        //3、在text前面插入一个easy
        String str2 =  str.replace("text","easy test");
        System.out.println(str2);

        //4、将每个单词的首字母大写
        System.out.println("------------");
        for (int i = 0; i <arr.length ; i++) {
            char first = arr[i].charAt(0);
            //把第一个字符转为大写
            char upperfirst =  Character.toUpperCase(first);
            String news =  upperfirst+arr[i].substring(1);
            System.out.println(news);
        }

    }
}
