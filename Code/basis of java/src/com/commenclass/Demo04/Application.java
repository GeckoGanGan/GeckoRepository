package com.commenclass.Demo04;

public class Application {
    public static void main(String[] args) {
        //创建接口类型的变量
        /*Usb usb = new Mouse();
        usb.service();*/

        //局部内部类
       /* class Fan implements Usb{
            @Override
            public void service() {
                System.out.println("连接电脑成分，风扇开始工作了");
            }
        }
        //使用局部内部类来创建对象
        Usb usb = new Fan();
        usb.service();*/

        //使用匿名内部类来优化（相当于创建了一个局部内部类）
        Usb usb = new Usb() {
            @Override
            public void service() {
                System.out.println("连接电脑成功，风扇开始工作。。。。");
            }
        };
        usb.service();
    }
}
