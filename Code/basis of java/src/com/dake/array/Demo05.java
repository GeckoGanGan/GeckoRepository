package com.dake.array;

public class Demo05 {
    public static void main(String[] args) {
        int[][] arrays = {{1,2},{2,3},{3,4}};
        int [][] result = reverse(arrays);
        printArrays(result);
    }
    public static int[][] reverse(int[][] arrays){
        int a[][] = new int[arrays.length][arrays[0].length];
        int c[][] = new int[arrays.length][arrays[0].length];
        //将二维数组数组看成一维数组进行反转
        for (int i = 0,j=arrays.length-1; i <arrays.length ; i++,j--) {
            for (int k = 0; k <arrays[i].length ; k++) {
                a[j][k] = arrays[i][k];
            }
        }
        //将反转后的二维数组里的
        for (int i = 0; i < a.length; i++) {
            for (int j = 0,m=a[i].length-1; j < a[i].length; j++,m--) {
                c[i][m] = a[i][j];
            }
        }
        return c;
    }
    public static void printArrays(int[][] arrays){
        for (int i = 0; i <arrays.length ; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println(arrays[i][j]);
            }
        }
    }
}
