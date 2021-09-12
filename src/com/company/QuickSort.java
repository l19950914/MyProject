package com.company;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int [] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        // quick sort  有一个左边界  一个有边界 一个轴（最后一个元素）从左边开始找到比轴打的元素 记录整个指针 同理右边一直往前找 找到比轴小的指针
        // 让后左右边界交换位置
        //
        int index = array[array.length-1];// 最后一个元素是轴（或者随机选择一个数字作为轴）
        int maxIndex;
//        while(array[])
    }
}
