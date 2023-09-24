package com.oop.Demo08;


//abstract 抽象类：类 extends：单继承~ （接口可以多继承）
public abstract class Action {

    //约束~有人帮我们实现
    //抽象方法，只有方法名字，没有方法的实现！
    public abstract void doSomething();
    //1、不能new这个抽象类，只能靠子类去实现它：约束！
    //2、抽象类的方法必须由继承了它的子类实现（重写）
    //3、抽象类的方法必须在抽象类中。抽象类中也可以写普通方法
}
