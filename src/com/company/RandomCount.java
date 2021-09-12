package com.company;


import java.util.*;
import java.util.stream.Collectors;

public class RandomCount {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // int N = random.nextInt(1000); // first number
        int N = 10;
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numberList.add(random.nextInt(10));
        }
        resultListCount(numberList);
    }


    public static void resultListCount(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (n + 2 > list.size()) {
                return;
            }
            List<Integer> firstList = new ArrayList<>();
            for (int i1 = 0; i1 < list.size() && i1 < n; i1++) {
                firstList.add(list.get(i + 1));
            }
            listToSet(list);
            countNumber(list, n);
        }
    }

    public static void countNumber(List<Integer> list, int n) {

        int n2 = list.get(n + 2);// secend number
        List<Integer> firstList = new ArrayList<>();
        for (int j = 0; j < n2 && j < list.size() - n + 1; j++) {
            firstList.add(list.get(n2 + 1));
        }
    }

    public static void listToSet(List<Integer> list) {
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        set.stream().forEach(x -> System.out.println(x));
    }


    static class Tsst {
        public static void main(String[] args) {
            List<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                int number = (int) (Math.random() * 10 + 1);
                numberList.add(number);
            }

            int postion = 0;
            while (getResult(numberList, postion) <= numberList.size()) {
                int result1 = getResult(numberList, postion);
                postion = result1;
                if (numberList.size() - result1 < 0) {
                    break;
                }
            }

        }

        public static int getResult(List<Integer> numberList, int postion) {
            if (postion > numberList.size())
                return -1;
            Integer firstN = numberList.get(postion);
            Set<Integer> numberSet = new TreeSet<>();
            for (int i = 0; i < firstN && i < numberList.size(); i++) {
                numberSet.add(numberList.get(postion + i + 1));
            }
            listToSet(numberList);
            return postion += (firstN + postion + 1);
        }

        public static void listToSet(List<Integer> list) {
            // stram 不存储数据 不改变数据源 有延时性 delay 延时  recent（最近的 现代的） file disk
            list.stream().distinct().sorted().forEach(number -> System.out.println(number));
        }
    }
}
