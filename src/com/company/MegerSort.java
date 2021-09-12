package com.company;

import java.util.Arrays;

public class MegerSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8};

        mergerSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergerSort(int[] array) {
        // 将整个数组分为两半 前一半数组 和后一半数组 都是整体有序的
        // 定义三个坐标 i（前一半数组开始的坐标） j（后一半数组开始的坐标） k （根据原始的数组新定义个数组的开始位置）
        // 比较 i 和j 的位置 将相对小的移到新的数组中

        // 计算array数组中间的位置 由整个位置将数组分为两个有序的子数组
        int modIndex = array.length / 2;
        // 由array数组定义个新数组temp
        int[] temp = new int[array.length];
        int i = 0;
        int j = modIndex + 1;
        int k = 0;
        while (i <= modIndex && j < array.length) {
            // temp[k] = array[i] < array[j] ? array[i++]: array[j++];
            if (array[i] < array[j]) {
                temp[k] = array[i];
                k++;
                i++;
            } else {
                temp[k] = array[j];
                k++;
                j++;
            }
        }
        // 两个while循环的作用  i 《= modindex 说明有半部分没有拍完左边拍完 那么前面都是有顺序的 只需将 modindex - i个元素的值依次赋值给temp数组的剩余元素
        while (i <= modIndex) temp[k++] = array[i++];
        while (j < array.length) temp[k++] = array[j++];
        // 将temp临时数组赋值给array
        for (int l = 0; l < temp.length; l++) {
            array[l] = temp[l];
        }
        // merger sort 将数组分为两半 这两个数组都是排好序的
    }
}
