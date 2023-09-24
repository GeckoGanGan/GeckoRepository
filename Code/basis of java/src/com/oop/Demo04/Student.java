package com.oop.Demo04;

public class Student {

    //属性私有
    private String name;  //名字
    private int id;  //学号
    private char sex;  //性别
    private int age;

    //提供一些方法可以操作这个属性
    //提供一些public的 set get 方法
    //给这个属性设置值
    public void setName(String name){
        this.name = name;
    }
    //获得这个属性
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>120||age<0){
            this.age = 3;
        }else{
            this.age = age;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
