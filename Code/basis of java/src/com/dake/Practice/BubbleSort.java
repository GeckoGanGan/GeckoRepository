package com.dake.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
        }
        scanner.close();
        int[] result =  bubbleSort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
    public static int[] bubbleSort(int[] arrays){
        int temp;
        for (int i = 0; i < arrays.length-1; i++) {
            for (int j = i+1; j <arrays.length ; j++) {
                System.out.println();
                if(arrays[i]>arrays[j]){
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        return arrays;

    }
}
