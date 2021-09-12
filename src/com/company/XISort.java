package com.company;

import java.util.Arrays;

public class XISort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 5, 4, 8, 6, 9, 7};
        int h = 1;
        while (h < array.length / 3) {
            h = h * 3 + 1;
        }
        // 希尔排序 是一个插入排序的高级版本 首先定义一个间隔 在间隔大的时候次数少 在间隔少的时候距离少所以相对效率较高
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (array[j] < array[j - gap])
                        swap(array, j, j - gap);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] array, int i, int j) {
        int tmep;
        tmep = array[i];
        array[i] = array[j];
        array[j] = tmep;
    }
}
