package com.example.dhakametrorailoperations.TasniahBashraat;

public class u4_g4_PassRechargeAnalysisResult {
    private Float rechargeAmount;
    private Integer rechargeCount;
    private Integer rank;

    public u4_g4_PassRechargeAnalysisResult(Float rechargeAmount, Integer rechargeCount, Integer rank) {
        this.rechargeAmount = rechargeAmount;
        this.rechargeCount = rechargeCount;
        this.rank = rank;
    }

    public Float getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Float rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Integer getRechargeCount() {
        return rechargeCount;
    }

    public void setRechargeCount(Integer rechargeCount) {
        this.rechargeCount = rechargeCount;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "u4_g4_PassRechargeAnalysisResult{" +
                "rechargeAmount=" + rechargeAmount +
                ", rechargeCount=" + rechargeCount +
                ", rank=" + rank +
                '}';
    }
}
