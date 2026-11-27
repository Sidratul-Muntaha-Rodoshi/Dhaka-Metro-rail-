package com.example.dhakametrorailoperations.Rodoshi;

public class TrainControlIssue {
    private String problemType;
    private String zone;
    private int speed;
    private String remarks;
    private String reportStatus;

    public TrainControlIssue(String problemType, String zone, int speed, String remarks, String reportStatus) {
        this.problemType = problemType;
        this.zone = zone;
        this.speed = speed;
        this.remarks = remarks;
        this.reportStatus = reportStatus;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    @Override
    public String toString() {
        return "TrainControlIssue{" +
                "problemType='" + problemType + '\'' +
                ", zone='" + zone + '\'' +
                ", speed=" + speed +
                ", remarks='" + remarks + '\'' +
                ", reportStatus='" + reportStatus + '\'' +
                '}';
    }
}
