package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    public static void main(String[] args) throws Exception {
        sparseArray();
//      int [] arr = new int[2];
//        int[][] array1 = new int[11][11];
//        array1[1][2] = 2;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(array1));
        // System.out.println(Arrays.toString(arr));
    }

    public static void sparseArray() throws Exception {
        // defined array
        int[][] array = new int[11][11];
        // 给二维数组赋值
        array[2][3] = 1;
        array[4][5] = 2;
        // 打印原始的二维数组

        System.out.println("原始的二维数组：");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
                if (j == 10) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        int count = 0; // 计数器
        // 计算二维数组的有效值（非0的值）
        for (int[] arr : array) {
            for (int a : arr) {
                if (a != 0) {
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("原始二维数组中有效个数：" + count);
        System.out.println();
        /**
         * 二维数组对应的稀疏数组就是行数不确定列数固定为3  稀疏数组存放的值对应二维数组的行 列  值 （第一行固定维原始二维数组的行列值）
         */
        // xishu shuzu
        int[][] xishu = new int[count + 1][3];
        // 稀疏数组浮出赋值
        xishu[0][0] = 11;
        xishu[0][1] = 11;
        xishu[0][2] = count;
        // 遍历二维数组是为了获取对应的下标
        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0) {
                    xishu[sum][0] = i;
                    xishu[sum][1] = j;
                    xishu[sum][2] = array[i][j];
                    sum++;
                }
            }
        }
        System.out.println("稀疏数组：");
        for (int i = 0; i < xishu.length; i++) {
            for (int j = 0; j < xishu.length; j++) {
                System.out.print(xishu[i][j] + " ");
                if (j == 2) {
                    System.out.println();
                }

            }
        }
        // 将稀疏数组转为二维数组
        int[][] huanyuan = new int[xishu[0][0]][xishu[0][1]];


        for (int i = 1; i < count + 1; i++) {
            System.out.println("原始的下标" + xishu[i][0] + " " + xishu[i][1]);

            huanyuan[xishu[i][0]][xishu[i][1]] = xishu[i][2];


        }
        System.out.println("稀疏数组转二维数组");
        for (int i = 0; i < huanyuan.length; i++) {
            for (int j = 0; j < huanyuan.length; j++) {

                System.out.print(huanyuan[i][j] + " ");
                if (j == 10) {
                    System.out.println();
                }
        List list = new ArrayList();
            }
        }

        // 将稀疏数组存入file中
        int len = 0;
        File file = new File("hello.txt");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            len = bis.read(); // 只需要将int 【】【】 转为byte【】【】
            if (len != 0) {
                bos.write(len);
            }
        }
    }
    // 如果一个数组中存在大量的相同的元素那么可以将这个二维数组转为稀疏数据可以节约空间  稀疏数组有固定的三列 row cloum val
    //稀疏数组的行数决定于二维数组的又效位数


}
