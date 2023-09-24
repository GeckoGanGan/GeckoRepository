package com.commenclass.Demo06;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {

        //1、字符串的第一种创建方式
        String name = "hello";//"hello"存储在字符串池中
        name = "张三";
        //并没有修改字符串的值，而是重新开辟一块空间存“张三”，然后name指向"张三";
        // name存的是字符串池中字符串的地址
        String name2 = "张三";

        //2、字符串的第二种创建方式,使用的是new创建的
        String str =new String("java");
        String str2 =new String("java");
        System.out.println(str==str2);//false如果没有使用new赋值的话是true，但是new地址不同
        System.out.println(str.equals(str2));//String类重写了equals方法，比较的是值而不是地址

        System.out.println("----------字符串常用方法1------------");
        //字符串方法的使用
        //1、length（）返回字符串的长度
        //2、charAt(int index) 返回某个位置的字符
        //3、contains(String str) 判断是否包含某个字符串

        String content = "别特么学java了,学个鸡毛学的java";
        System.out.println(content.length());
        System.out.println(content.charAt(content.length()-1));
        System.out.println(content.contains("java"));
        System.out.println(content.contains("php"));

        System.out.println("----------字符串常用方法2------------");
        //字符串方法的使用
        //4、toCharArray() 将字符串转换为数组
        //5、indexOf() 返回字符串首次出现的位置
        //6、lastIndexOf() 返回字符串最后一次出现的位置
        System.out.println(Arrays.toString(content.toCharArray()));
        System.out.println(content.indexOf("java"));
        System.out.println(content.indexOf("java",5));
        System.out.println(content.lastIndexOf("java"));

        System.out.println("----------字符串常用方法3------------");
        //7、trim() 去掉字符串前后的空格
        //8、toUpperCase() 把小写转换为大写  toLowerCase() 将大写转换为小写
        //9、endWith(str) 判断字符串是否以str结尾, startWith(str) 判断字符换是否以str开头

        String content2 = " hello world ! ";
        System.out.println(content2.trim());
        System.out.println(content2.toUpperCase());
        System.out.println(content2.toLowerCase());
        String filename = "hello.java";
        System.out.println(filename.endsWith(".java"));
        System.out.println(filename.startsWith("hello"));

        System.out.println("----------字符串常用方法4------------");
        //10、replace (char oldChar,char newChar) 用新的字符或者字符串替换旧的字符或字符串
        //11、split (str) 根据str做拆分

        System.out.println( content.replace("java","php"));
        String say = "java is the worst  programming language!C is the best!";
        String[] arr = say.split("[ ,]+");
        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //补充两个方法equals()、compareTo()--->比较大小
        System.out.println("----------补充------------");
        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写

        String s3 = "abcsd";// a-->97
        String s4 = "xyzhsf";// x-->120
        System.out.println(s3.compareTo(s4));

        String s5 = "abc";
        String s6 = "abcsfsf";
        System.out.println(s5.compareTo(s6));//特殊，s5长度-s6长度=-4

    }
}
