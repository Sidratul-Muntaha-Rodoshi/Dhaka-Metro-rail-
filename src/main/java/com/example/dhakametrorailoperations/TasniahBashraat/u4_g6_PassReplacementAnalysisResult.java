package com.example.dhakametrorailoperations.TasniahBashraat;

public class u4_g6_PassReplacementAnalysisResult {
    private String replacementReason;
    private Integer replacementCount;
    private Integer rank;

    public u4_g6_PassReplacementAnalysisResult(String replacementReason, Integer replacementCount, Integer rank) {
        this.replacementReason = replacementReason;
        this.replacementCount = replacementCount;
        this.rank = rank;
    }

    public String getReplacementReason() {
        return replacementReason;
    }

    public Integer getReplacementCount() {
        return replacementCount;
    }

    public Integer getRank() {
        return rank;
    }

    public void setReplacementReason(String replacementReason) {
        this.replacementReason = replacementReason;
    }

    public void setReplacementCount(Integer replacementCount) {
        this.replacementCount = replacementCount;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "PassReplacementAnalysisResult{" +
                "replacementReason='" + replacementReason + '\'' +
                ", replacementCount=" + replacementCount +
                ", rank=" + rank +
                '}';
    }
}
