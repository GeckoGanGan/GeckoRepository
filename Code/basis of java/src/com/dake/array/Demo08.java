package com.dake.array;

public class Demo08 {
    public static void main(String[] args) {
        //1、创建一个二维数组11*11 0：没有棋子 1：白棋 2：黑棋
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 1;
        System.out.println("输出原始数组:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j <array1[i].length ; j++) {
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("===============");
        //2.遍历二维数组 记录有效个数
        int sum = 0;
       /* for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array1[i].length ; j++) {
                if(array1[i][j]!=0){
                    sum++;
                }
            }
        }*/
        for (int[] ints : array1) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    sum++;
                }
            }
        }
        //3.创建稀疏数组
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;
        //4.遍历二维数组，将非零的值存入稀疏数组
        int count = 0;//稀疏数组第0行已经存值了
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[i][j]!=0){
                    count++;//当找到不为零的值后 稀疏数组的行数加一行，这里的count就是用来记录
                    //稀疏数组行数的
                    array2[count][0] = i;//存行数
                    array2[count][1] = j;//存列数
                    array2[count][2] = array1[i][j];//存不为零的那个值
                }
            }
        }
        System.out.println("输出稀疏数组：");
        //5.输出稀疏数组
        for (int i = 0; i <array2.length ; i++) {
            for (int j = 0; j <array2.length ; j++) {
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("还原稀疏数组：");
        //6.还原稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];//行和列
       /*
        只需要从稀疏数组的第一行开始遍历，每一行的第0列和第一列和第二列还有第三列中存放的是
        原数组中不为0的数组元素的行Array2[i][0]和列Array2[i][1]和值Array2[i][2]
        把遍历到的行值和列值存到另一个和原数组同样大小的数组Array3中
        对应的行和列array3[array2[i][0]][array2[i][1]]进行赋值
        array3[array2[i][0]][array2[i][1]] = array2[i][2];
       */
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        //7.输出还原的数组
        System.out.println("还原后的数组：");
        for (int i = 0; i <array3.length ; i++) {
            for (int j = 0; j <array3[i].length ; j++) {
                System.out.print(array3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
