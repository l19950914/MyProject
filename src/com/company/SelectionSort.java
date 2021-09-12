package com.company;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 98, 45, 23, 57, 12};
        System.out.println("oldArray:" + Arrays.toString(array));
        System.out.println();
        selectionSort(array);
        System.out.println("newArray:" + Arrays.toString(array));
    }

    // selection sort 循环每次找出最小的一个值的小标 将这个最小的下表和第一个元素的值交换，
    // 第一个将最小的小标和第一个值进行交换 第二次和第二个最小的小标和第二个值交换
    // 当之声连个值的时候 可以少一次循环判断
    public static void selectionSort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int i1 = i + 1; i1 < array.length; i1++) {
                if (array[i] > array[i1]) {
                    minIndex = i1;
                }
            }
            // 进行元素交换 首先将第一个元素的值赋值给 tmep 此时array[i] 元素已经空闲 这是在将本次最小的小标值赋值个第一个元素 之后将临时变量temp这个值赋值给本次最小的元素，至此值交换完毕
            int temp;
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
