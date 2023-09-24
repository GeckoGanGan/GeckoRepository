package com.dake.method;

public class Demo03 {
    public static void main(String[] args) {
        double a = maxFind(3,1,3,5,2,7);
        double b = maxFind(new double[]{9,2,3,2,1});
        System.out.println(a);
        System.out.println(b);
    }
    public static double maxFind(double... numbers){
        if(numbers.length==0){
            System.out.println("No argument passed");
        }
        double result = 0;
        for(int i =0;i<numbers.length;i++){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }
        return result;
    }
}
