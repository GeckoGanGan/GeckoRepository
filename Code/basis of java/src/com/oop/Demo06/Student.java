package com.oop.Demo06;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("Student===>run");
    }
    public void eat(){
        System.out.println("eat");
    }
    public void go(){
        System.out.println("go");
    }
}
