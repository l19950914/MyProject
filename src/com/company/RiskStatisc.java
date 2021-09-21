package com.company;

public class RiskStatisc {

    private String ruleName;
    private Integer failCount;
    private Integer confirmCount;
    private Integer nodateCount;
    private Integer passCount;

    public RiskStatisc() {
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public Integer getConfirmCount() {
        return confirmCount;
    }

    public void setConfirmCount(Integer confirmCount) {
        this.confirmCount = confirmCount;
    }

    public Integer getNodateCount() {
        return nodateCount;
    }

    public void setNodateCount(Integer nodateCount) {
        this.nodateCount = nodateCount;
    }

    public Integer getPassCount() {
        return passCount;
    }

    public void setPassCount(Integer passCount) {
        this.passCount = passCount;
    }

    @Override
    public String toString() {
        return "RiskStatisc{" +
                "ruleName='" + ruleName + '\'' +
                ", failCount=" + failCount +
                ", confirmCount=" + confirmCount +
                ", nodateCount=" + nodateCount +
                ", passCount=" + passCount +
                '}';
    }

    public RiskStatisc(String ruleName, Integer failCount, Integer confirmCount, Integer nodateCount, Integer passCount) {
        this.ruleName = ruleName;
        this.failCount = failCount;
        this.confirmCount = confirmCount;
        this.nodateCount = nodateCount;
        this.passCount = passCount;
    }
}
