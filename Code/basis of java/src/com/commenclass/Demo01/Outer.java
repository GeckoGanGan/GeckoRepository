package com.commenclass.Demo01;
//外部类
public class Outer {
    private String name = "张三";
    private int age = 20;
    private String sex = "男";

    //内部类
     class Inner{
        private String address = "北京";
        private String phone = "110";
        //内部类属性和外部类属性重名
        private String sex = "女";

        //成员内部类不能定于静态成员，但是可以定义静态常量
        private static final String a = "a";
        //方法
        public void show(){
            //打印外部类的属性
            System.out.println(name);
            System.out.println(age);
            //打印内部类的属性
            System.out.println(address);
            System.out.println(phone);
            System.out.println(sex);
            //当内部类和外部类存在重名的属性是，访问外部类的属性使用 ：外部类对象.this.属性名
            System.out.println(Outer.this.sex);
        }
    }
}
