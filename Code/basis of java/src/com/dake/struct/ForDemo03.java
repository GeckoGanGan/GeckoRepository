package com.dake.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //练习2：用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个
        for (int i = 0; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");//不换行 打印tab键
            }
            if(i%(3*5)==0){//每十五个数只有三个数能和15整除，然后再换行
                System.out.println();
                //System.out.print("/n");//换行
            }
        }
    }
}
