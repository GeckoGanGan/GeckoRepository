package com.List.Generic.Methods;

//泛型方法
//语法：放在方法返回值的前面 T 方法返回值类型 方法名(T t)
public class ArrayPrint {
    //打印不同类型的数组
    public <T> void arrayPrint(T[] inputArray){
        for (T t:inputArray) {
            System.out.print(t+",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayPrint demo01 = new ArrayPrint();
        Integer[] integers ={1,2,4,5,6};
        Double[] doubles = {1.2,3.4,5.6};
        Character[] characters = {'h','e','l','l','o'};
        System.out.println("--------整形数组-------");
        demo01.arrayPrint(integers);
        System.out.println("--------双精度数组-------");
        demo01.arrayPrint(doubles);
        System.out.println("--------字符数组-------");
        demo01.arrayPrint(characters);
    }
}
