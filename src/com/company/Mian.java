package com.company;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Mian {
    // public static void main(String[] args) {
//        RiskDisplayItem riskDisplayItem = new RiskDisplayItem();
//        riskDisplayItem.setRiskTtemCount(36);
//        for (int i = 0; i < 19; i++) {
//            RiskItem riskItem = new RiskItem();
//            riskItem.setChagneTypeZh("changeTypeZh");
//            List<RiskRuleItem> riskRuleItemList = new ArrayList<>();
//            RiskRuleItem riskRuleItem = new RiskRuleItem();
//            riskRuleItem.setRuleName("ruleNameZh");
//            RiskStatisc riskStatisc = new RiskStatisc();
//            riskStatisc.setConfirmCount(10);
//            riskStatisc.setFailCount(10);
//            riskStatisc.setPassCount(10);
//            riskRuleItem.setRiskStatisc(riskStatisc);
//            riskRuleItemList.add(riskRuleItem);
//            riskItem.setRiskRuleItemList(riskRuleItemList);
//
//            List<RiskItem> riskItemList = new ArrayList<>();
//            riskItemList.add(riskItem);
//            riskDisplayItem.setRiskItem(riskItemList);
//        }
//        System.out.println(riskDisplayItem.toString());
//    }


    public static void main(String[] agrs) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);

        // String str = br.readLine();
//                int count = 0;
//                readLine = readLine.toLowerCase();
//                char [] ch =  readLine.toCharArray();
//
//                for(int i = 0; i < ch.length; ++i){
//                    if( ch[i] == str.toLowerCase().toCharArray()[0]){
//                        count++;
//                    }
//                }
        while (scanner.hasNext()){
            String line = scanner.nextLine();
//            isLengthOver8(line);
            //int num =  Integer.parseInt(line,16);
           // String s = Integer.toHexString(10);
           // System.out.println(s);
            double sqrt = Math.sqrt(9);
            System.out.println(sqrt);
            //  System.out.println(num);
        }

    }


    private static void isLengthOver8(String line) {

        if (line.length() > 8) {
            String str = line.substring(0, 8);
            System.out.println(str);
            isLengthOver8(line.substring(8));

        } else {
            int n = 8 - line.length();
            for (int i = 0; i < n; i++) {
                line += "0";
            }
            System.out.println();
            System.out.println(line);
        }

    }
}

