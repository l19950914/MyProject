package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 5, 4, 8, 6, 9, 7};
        insrtionSort(array);
    }
    // 插入排序 从第二个元素开始排序 和前面的元素进行排序 将较小的迁移
    public static void insrtionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j -1])
                    swap(array,j,j-1);
            }
        }
        System.out.println(Arrays.toString(array));
    }
    // 交换数组的任意位置的元素
    public static void swap(int[] array, int i, int j) {
        int tmep;
        tmep = array[i];
        array[i] = array[j];
        array[j] = tmep;
    }
}
