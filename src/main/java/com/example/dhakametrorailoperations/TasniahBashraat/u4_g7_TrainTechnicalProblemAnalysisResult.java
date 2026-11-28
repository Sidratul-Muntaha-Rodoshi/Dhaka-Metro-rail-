package com.example.dhakametrorailoperations.TasniahBashraat;

public class u4_g7_TrainTechnicalProblemAnalysisResult {
    private String reportedProblem;
    private Integer reportCount;
    private Integer rank;

    public u4_g7_TrainTechnicalProblemAnalysisResult(String reportedProblem, Integer reportCount, Integer rank) {
        this.reportedProblem = reportedProblem;
        this.reportCount = reportCount;
        this.rank = rank;
    }

    public String getReportedProblem() {
        return reportedProblem;
    }

    public Integer getReportCount() {
        return reportCount;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "TrainTechnicalProblemAnalysisResult{" +
                "reportedProblem='" + reportedProblem + '\'' +
                ", reportCount=" + reportCount +
                ", rank=" + rank +
                '}';
    }
}
