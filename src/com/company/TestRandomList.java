package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestRandomList {

    static List<Integer> globalList = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String randomNum = scanner.nextLine();

            list.add(Integer.parseInt(randomNum));

        }
        Integer firstNumber = list.get(0);
        randomList(firstNumber, 0, list);
        for (Integer ranNum : globalList) {
            System.out.println(ranNum);
        }


    }

    static int length = 0;

    private static void randomList(Integer num, int aboveN, List<Integer> list) {
        if (aboveN != 0) {
            List<Integer> subList = new ArrayList<>();
            for (int i = length; i < num + aboveN; i++) {
                subList.add(list.get(i + 1));
                if (i == aboveN + num - 1) {
                    globalList.addAll(distinctSortList(subList));
                }

                if (aboveN + num + 1 == list.size() && i == aboveN + num - 1) {
                    return;
                }
            }
        } else {
            List<Integer> subList = new ArrayList<>();
            for (int i = length; i < num + length; i++) {
                subList.add(list.get(i + 1));
                if (i == length + num - 1) {
                    globalList.addAll(distinctSortList(subList));
                }
                if (num + length + 1 == list.size() && i == length + num - 1) {
                    return;
                }
            }
            length += num + 1;
            if (list.get(length) != null) {
                if (length + list.get(length) + 1 > list.size()) {
                    int temp = list.size() - length - 1;
                    randomList(list.get(length), temp, list);
                } else {
                    randomList(list.get(length), 0, list);
                }
            }
        }
    }

    public static List<Integer> distinctSortList(List<Integer> list) {
        return list.stream().distinct().sorted().collect(Collectors.toList());
    }


}
