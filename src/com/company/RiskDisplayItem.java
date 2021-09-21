package com.company;

import java.util.List;

public class RiskDisplayItem {
    private Integer riskTtemCount;
    private List<RiskItem> riskItem;

    public List<RiskItem> getRiskItem() {
        return riskItem;
    }

    public void setRiskItem(List<RiskItem> riskItem) {
        this.riskItem = riskItem;
    }

    public Integer getRiskTtemCount() {
        return riskTtemCount;
    }

    public void setRiskTtemCount(Integer riskTtemCount) {
        this.riskTtemCount = riskTtemCount;
    }

    @Override
    public String toString() {
        return "RiskDisplayItem{" +
                "riskTtemCount=" + riskTtemCount +
                ", riskItem=" + riskItem +
                '}';
    }
}
