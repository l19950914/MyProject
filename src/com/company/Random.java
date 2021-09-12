package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Random {
    static List<Integer> globalList = new ArrayList<>();

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //String unm = scanner.nextLine();


        String unm = "3\n" +
                "        2\n" +
                "        2\n" +
                "        1\n" +
                "        11\n" +
                "        10\n" +
                "        20\n" +
                "        40\n" +
                "        32\n" +
                "        67\n" +
                "        40\n" +
                "        20\n" +
                "        89\n" +
                "        300\n" +
                "        400\n" +
                "        15";
        String[] numberString = unm.split("\n");
        System.out.println("目标数组" + Arrays.toString(numberString) + numberString.length);
        int number = Integer.parseInt(numberString[0]);
        if (number > 1000 || number < 1) {
            return;
        }
        List<Integer> list = randomN(number, numberString);
        System.out.println(list);

    }


    public static List<Integer> randomN(int num, String[] strings) {
        int count = num + 1;
        List<Integer> randomNumberList = new ArrayList<>();
        int time = 0;
        for (int i = 0 ; i < num; i++) {
            time ++;
            randomNumberList.add(Integer.parseInt(strings[time +1].trim()));
        }
        List<Integer> list = randomNumberList.stream().distinct().sorted().collect(Collectors.toList());
        globalList.addAll(list);
        num = Integer.parseInt(strings[num + 1].trim());

        count += num + 1;
        if (count <= strings.length ) {
            List<Integer> list1 = randomN(num, strings);
            globalList.addAll(list1);
        }

        //List<Integer> resultList = globalList.stream().distinct().sorted().collect(Collectors.toList());
        return globalList;
    }

    public static List<Integer> randomNumber(int num) {
        List<Integer> randomNumberList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int randomNum = (int) (Math.random() * 1000 + 1);
            randomNumberList.add(randomNum);
        }
        List<Integer> list = randomNumberList.stream().distinct().sorted().collect(Collectors.toList());
        return list;

    }


    static class test{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                String line = scanner.nextLine();


            }
        }
    }
}

