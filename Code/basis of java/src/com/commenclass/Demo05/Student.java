package com.commenclass.Demo05;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public String toString(){
        return name+":"+age;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

   /* @Override
    public boolean equals(Object obj) {
        //1、判断对象是否是同一个引用
        if (this == obj) return true;
        //2、判断obj是否为null和是否为同一类型
        if (obj == null || this.getClass() != obj.getClass()) return false;
        //3、强制类型转换
        Student student = (Student) obj;
        return age == student.age && Objects.equals(name, student.name);
    }*/
   @Override
   public boolean equals(Object obj) {
       //1、判断对象是否是同一个引用
       if (this == obj) return true;
       //2、判断obj是否为null和是否为同一类型
       if(obj == null||this.getClass()!= obj.getClass()) return false;
       //3、强制类型转换
       Student student = (Student) obj;
       return this.age == student.getAge() && Objects.equals(this.name, student.getName());
   }

    protected void finalize() throws Throwable {
        System.out.println(this.name+"对象被回收了");
    }



}
