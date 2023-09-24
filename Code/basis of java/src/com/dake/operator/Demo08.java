package com.dake.operator;

//三元运算符
public class Demo08 {
    public static void main(String[] args) {
        int score = 60;

        //  x ? a:b 如果x==true 则返回a;否则则返回b
        String type = score<60 ? "成绩不及格" : "成绩合格";//很重要，必须掌握
        System.out.println(type);

    }
}
