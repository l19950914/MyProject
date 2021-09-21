package com.company;

public class RiskRuleItem {

    private String ruleName;
    private RiskStatisc riskStatisc;

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public RiskStatisc getRiskStatisc() {
        return riskStatisc;
    }

    public void setRiskStatisc(RiskStatisc riskStatisc) {
        this.riskStatisc = riskStatisc;
    }

    @Override
    public String toString() {
        return "RiskRuleItem{" +
                "ruleName='" + ruleName + '\'' +
                ", riskStatisc=" + riskStatisc +
                '}';
    }
}
