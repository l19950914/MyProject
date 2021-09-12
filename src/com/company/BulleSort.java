package com.company;

import java.util.Arrays;
import java.util.Random;

public class BulleSort {

    public static void main(String[] args) {
        int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            // 随机数
            array[i] = random.nextInt(10000);
        }
//        System.out.println("原数组：" + Arrays.toString(array));
//        System.out.println();
//        bulleSort(array);
//        System.out.println("排序之后的数组：" + Arrays.toString(array));
        System.out.println("result:" + dataChecker(array, 10000));

    }

    public static void bulleSort(int[] array) {
        // bulleSort 比较两个相邻的数 将较小的数移到后面 之后较小的数 和下一个数再重复进行比较 如此这样一次循环之后就讲最大的一个数移到了最后
        // 每次循环完之后 就将一个最大的数移 到最后
        // 外层循环控制循环次数 内层循环数据交换
        for (int i = 0; i < array.length - 1; i++) {
            for (int i1 = 0; i1 < array.length - 1 - i; i1++) {
                if (array[i1] > array[i1 + 1]) {
                    int temp = array[i1];
                    array[i1] = array[i1 + 1];
                    array[i1 + 1] = temp;
                }
            }
        }
    }

    // 对数器 验证写的排序是否正确
    public static String dataChecker(int[] array, int timeCount) {
        int[] bulleArray = new int[array.length];
        // 拷贝原数组
        System.arraycopy(array, 0, bulleArray, 0, array.length);
        Arrays.sort(array);
        bulleSort(bulleArray);
        boolean flag = false;
        for (int i = 0; i < timeCount; i++) {
            if (array[i] != bulleArray[i]) {
                flag = true;
            }
        }
        return flag == true ? "incorrent" : "corrent";
    }
}
