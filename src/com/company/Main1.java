package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {


    public static void main(String[] args) throws IOException {

        // bufferedReader buffered
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        System.out.println(getStrLength(str));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符串");
        String str = br.readLine();
        System.out.println("请输入单个单词");
        char c = br.readLine().toLowerCase().toCharArray()[0];
        System.out.println(charCount(str,c));
    }

    public static int getStrLength(String str) {
        if (str.length() > 50000)
            return 0;
        String[] strList = str.split(" ");
        return strList[strList.length - 1].length();

    }

    public static int charCount(String str,Character c) throws IOException{

        int count = 0;
        char[] charArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            count =  String.valueOf(charArray[i]).equals(String.valueOf(c)) ? ++count : count;
        }
        return count;
    }

}
