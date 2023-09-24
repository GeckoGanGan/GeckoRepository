package com.dake.Practice;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortdemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar = new int[5];
        for (int i = 0; i < 4; i++) {
           ar[i] = scanner.nextInt();
        }
        int[] result = bubbleSort(ar);
        System.out.println(Arrays.toString(result));
    }
    public static int[] bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
        return arr;
    }
}
