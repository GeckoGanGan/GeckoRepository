package com.commenclass.Demo03;

public class Outer {
    private String name = "张山";
    private int age = 18;

    public void show(){     //如果方法是静态方法，局部内部类访问外部类的成员需要实例化对象访问
        //定义局部变量,局部变量前面不能加任何的权限访问修饰符
        //jdk1.8，局部变量之前自动加final，相当于final String address
        final String address = "北京";
        //由于是局部变量，当show方法执行后或被回收，而inner对象和Inner类还在，
        // show2方法不能访问一个已经消失的变量，所以外部类的局部变量必须是常量

        //局部内部类，注意前面不能加任何权限访问修饰符
        class Inner{
            private String phone = "110";
            private String email = "zhangsan@qq.com";

            //局部内部类不能存在静态成员，但是加上final变成静态常量就可以了
            private final static String sex = "男";

            public void show2(){
                //访问外部类的属性
                //局部内部类和局部变量的级别i相同的，所以可以直接访问
                System.out.println(Outer.this.name);//name =>相当于省略了Outer.this.name
                System.out.println(age);//Outer.this.age
                //访问内部类的成员
                System.out.println(this.phone);//phone =>相当于省略了this.phone
                System.out.println(email);//this.email
                //访问外部类局部变量,jdk1.7要求变量必须是常量，jdk1.8会自动添加final
                System.out.println(address);
            }

        }
        //创建局部内部类对象,调用show2()
        Inner inner = new Inner();
        inner.show2();

    }
}
