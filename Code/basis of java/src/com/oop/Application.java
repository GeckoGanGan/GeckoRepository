package com.oop;

import com.oop.Demo06.Person;
import com.oop.Demo06.Student;

public class Application {

    public static void main(String[] args) {
        //类型之间的转换： 父    子
        //高     低
        Person obj = new Student();
        //将这个对象转换为Student类型就可以使用Student类型的方法了
        /*
        Student student = (Student) obj;
        student.go();
        */
        ((Student)obj).go();
        //子类转父类可能会丢失一些自己本来的方法！
        Student student = new Student();
        student.go();
        Person person = student;//低转高 自动转换
    }
}











/* Demo 04
        Student s1 = new Student();
        s1.setName("朱大可");
        System.out.println(s1.getName());

        s1.setAge(-9);
        System.out.println(s1.getAge());
*/
/*=========================================*/

/*Student student = new Student();
       student.test("朱大可");
       student.test1();
*/
/*=========================================*/

/* Demo 05

//方法的调用之只和左边的类型有关
//静态的方法和非静态的方法区别很大！
        //静态方法：只和左边的有关
        //非静态方法：重写 只和右边的有关
        A a = new A();
        a.test(); //A

        //父类的引用指向了子类
        B b = new A();  //子类重写了父类的方法
        b.test(); //B*/

/*=========================================*/
 /*  Demo 06
       //一个对象的实际类型是确定的
        // new Student();
        // new Person();

        //可以指向的引用类型就不确定了：父类的引用指向子类

        // Student 能调用的方法都是自己的或者继承的父类的方法
        Student s1 = new Student();
        //Person 父类型 可以指向子类，但是不能调用子类独有的方法
        Person p1 = new Person();
        Person p2 = new Student();

        p1.run();
        s1.run();
        p2.run();
        ((Student) p2).eat();//强制类型转换
*/