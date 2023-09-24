package com.exception.Demo01;

public class Test {

    public static void main(String[] args) {
        int a =2;
        int b =0;
        try {// try监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){//   捕获异常/捕获的异常类型
            System.out.println("程序出现异常，b不能为0！");
        }
        finally {// 处理善后工作
            System.out.println("finally");
        }


        //finally 可以不要finally，假设IO,资源，关闭！
       try {//假设要捕获多个异常：从小到大！
           new Test().a();
       }catch (Error e){//  想要捕获的异常类型
           System.out.println("栈溢出异常");
       }
       catch (Exception e){
           System.out.println("Exception");

       }
       catch (Throwable e){
           System.out.println("Throwable");
       }
       finally {
           System.out.println("finally");
       }


    }
    public void a(){
        b();
    };
    public void b(){
        a();
    };
}
