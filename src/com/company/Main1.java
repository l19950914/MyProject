package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1 {


    public static void main(String[] args) throws IOException {

        // bufferedReader buffered
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        System.out.println(getStrLength(str));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("请输入字符串");
//        String str = br.readLine();
//        System.out.println("请输入单个单词");
//        char c = br.readLine().toLowerCase().toCharArray()[0];
//        System.out.println(charCount(str,c));

        sorted();
    }

    public static int getStrLength(String str) {
        if (str.length() > 50000)
            return 0;
        String[] strList = str.split(" ");
        return strList[strList.length - 1].length();

    }

    public static int charCount(String str, Character c) throws IOException {

        int count = 0;
        char[] charArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            count = String.valueOf(charArray[i]).equals(String.valueOf(c)) ? ++count : count;
        }
        return count;
    }

    public static void sorted() {
        Map<String, List<RiskStatisc>> riskStatiscMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            List<RiskStatisc> riskStatiscs = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                RiskStatisc riskStatisc = new RiskStatisc("ruleName" + j, 2 + j, 3, 4, 5);
                riskStatiscs.add(riskStatisc);
            }
            riskStatiscMap.put("changeType" + i, riskStatiscs);
        }
        System.out.println(riskStatiscMap.toString());
        List<Map.Entry<String, List<RiskStatisc>>> entries = new ArrayList<>(riskStatiscMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, List<RiskStatisc>>>() {
            @Override
            public int compare(Map.Entry<String, List<RiskStatisc>> o1, Map.Entry<String, List<RiskStatisc>> o2) {
                List<RiskStatisc> value2 = o2.getValue();
                List<RiskStatisc> value1 = o1.getValue();
                for (int i = 0; i < value1.size(); i++) {
                    Integer failCount1 = value1.get(i).getFailCount();
                    Integer nodateCount1 = value1.get(i).getNodateCount();
                    Integer confirmCount1 = value1.get(i).getConfirmCount();
                    for (int i1 = 0; i1 < value2.size(); i1++) {
                        Integer failCount2 = value2.get(i).getFailCount();
                        Integer nodateCount2 = value2.get(i).getNodateCount();
                        Integer confirmCount2 = value2.get(i).getConfirmCount();
                        if (failCount2 != failCount1) {
                            return failCount1 - failCount2;
                        } else if (confirmCount1 != confirmCount2) {
                            return confirmCount1 - confirmCount2;
                        } else if (nodateCount2 != nodateCount1) {
                            return confirmCount1 - confirmCount2;
                        }
                    }
                };
                return 0;
            }
        });

    }
}
