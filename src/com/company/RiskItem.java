package com.company;

import java.util.List;

public class RiskItem {
    private String chagneTypeZh;

    private List<RiskRuleItem> riskRuleItemList;

    public String getChagneTypeZh() {
        return chagneTypeZh;
    }

    public void setChagneTypeZh(String chagneTypeZh) {
        this.chagneTypeZh = chagneTypeZh;
    }

    public List<RiskRuleItem> getRiskRuleItemList() {
        return riskRuleItemList;
    }

    public void setRiskRuleItemList(List<RiskRuleItem> riskRuleItemList) {
        this.riskRuleItemList = riskRuleItemList;
    }

    @Override
    public String toString() {
        return "RiskItem{" +
                "chagneTypeZh='" + chagneTypeZh + '\'' +
                ", riskRuleItemList=" + riskRuleItemList +
                '}';
    }
}
