package com.Map.HashMap;

import java.util.Objects;

public class Student {
    private String name;
    private int stuNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public Student(String name, int stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNo=" + stuNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuNo == student.stuNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stuNo);
    }

}
