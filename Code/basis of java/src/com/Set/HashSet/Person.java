package com.Set.HashSet;

import java.util.Objects;

public  class Person implements Comparable<Person> {
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return Objects.equals(this.name, person.getName()) && this.age == person.getAge();

    }

    @Override
    public int hashCode() {
        //return Objects.hash(name, age);
        int n1 = this.name.hashCode();
        //(1) 31是一个质数，减少散列冲突（尽量是计算出的hashcode不冲突）
        //(2) 31 提高执行效率 31*i = (i<<5)-i
        int n2 = this.age+31;
        return n1*n2;
    }

    @Override
    public int compareTo(Person person) {
        int n1 = this.getName().compareTo(person.getName());
        int n2 = this.age-person.getAge();
        return n1==0?n2:n1;
        //先按姓名比，再按年龄比
    }


}
