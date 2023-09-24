package com.commenclass.Demo06;
/*
* StringBuffer 和StringBuilder的使用
* 和String的去区别：
* 1、效率更高
* 2、更节省内存
* */
public class Demo05{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        //1、append()方法：追加
        sb.append("学个屁的java");
        System.out.println(sb.toString());
        sb.append("别学Java了");
        System.out.println(sb.toString());
        //2、insert()方法：添加
        sb.insert(0,"我再最前面");
        System.out.println(sb.toString());
        //3、replace()：替换，可以指定位置
        sb.replace(0,4,"hello");//  4的位置是不会换的
        System.out.println(sb.toString());
        //4、delete()：删除
        sb.delete(0,5);
        System.out.println(sb.toString());
        sb.reverse();//反转
        System.out.println(sb.toString());
        //清空
        sb.delete(0,sb.length());
        System.out.println(sb.length());

    }
}
