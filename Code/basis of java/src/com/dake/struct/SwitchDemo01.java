package com.dake.struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //不加break的话 会发生case穿透
        //switch匹配一个具体的值
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("优良");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
                break;
        }
    }
}
