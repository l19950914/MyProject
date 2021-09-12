package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HW {
    public static void main(String[] args) throws IOException {

        List<String> resulstList = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        if (line.length() > 100 && line.length() < 0) {
            return;
        }

        if (line.length() < 8) {
            int pos = 8 - line.length();
            StringBuilder stringBuilder = new StringBuilder(line);
            for (int i = 0; i < pos; i++) {
                stringBuilder.append("0");
            }
            resulstList.add(stringBuilder.toString());
        } else {
            for (int i = 0; i < (line.length() / 8) + 1; i++) {
                if ((i + 1) != (line.length() / 8) + 1) {
                    String substring = line.substring(i + (8 * i) - i, 8 * (i + 1));
                    resulstList.add(substring);
                } else {
                    String substring = line.substring(i + (8 * i) - i);
                    int pos = 8 - substring.length();
                    StringBuilder stringBuilder = new StringBuilder(substring);
                    for (int j = 0; j < pos; j++) {
                        stringBuilder.append("0");
                    }
                    resulstList.add(stringBuilder.toString());
                }
            }
        }
        resulstList.forEach(x-> System.out.println(x));
    }

    static class test {
        public static void main(String[] args) {
            System.out.println(25 % 8);
            String line = "1234567891011121314";
            System.out.println(line.length() / 8);
            for (int i = 0; i < (line.length() / 8) + 1; i++) {
                if ((i + 1) != (line.length() / 8) + 1) {
                    String substring = line.substring(i + (8 * i) - i, 8 * (i + 1));
                    System.out.println(substring);
                } else {
                    String substring = line.substring(i + (8 * i) - i);
                    int pos = 8 - substring.length();
                    StringBuilder stringBuilder = new StringBuilder(substring);
                    for (int j = 0; j < pos; j++) {
                        stringBuilder.append("0");
                    }
                    System.out.println(stringBuilder.toString());
                }
            }
        }
    }
}
