package com.exception.Demo01;

public class Test2 {
    public static void main(String[] args) {
        try {
            new Test2().test(1,0);
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
    //假设在这个方法中，处理不了这个异常，方法上抛出异常
    public void test(int a,int b) throws ArithmeticException {
        if(a==0){
            throw new ArithmeticException();//主动抛出异常，一般在方法中使用
        }
        System.out.println(a/b);
    }
}
