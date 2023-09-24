package com.List.Collection;


import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //1、比较是不是同一个引用
        if(this == obj){
            return true;
        }
        //2、判断是否为空
        if(obj == null){
            return false;
        }
        //3、判断是不是Student类型
        if(obj instanceof Student){
            Student student = (Student) obj;
            //4、比较属性
            if (Objects.equals(this.name, student.getName()) &&this.age==student.getAge()){
                return true;
            }
        }
        return false;
    }
    /*@Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/
}
