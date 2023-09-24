package com.commenclass.Demo06;

import java.sql.SQLOutput;

/*
* 验证StringBuilder的效率高于String
* */
public class Demo06 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        /*String string = "";
        for (int i = 0; i <99999 ; i++) {
            string += i;
        }
        System.out.println(string);*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <99999 ; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时"+(end-start));
    }
}
