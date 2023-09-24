package com.zhudake.cglib;

public class Test {
    public static void main(String[] args) {
        MyMethodInterceptor myMethodInterceptor = new MyMethodInterceptor();
        Student studentProxy = (Student) myMethodInterceptor.creteCglibProxyObject(Student.class);
        studentProxy.put();
    }
}
