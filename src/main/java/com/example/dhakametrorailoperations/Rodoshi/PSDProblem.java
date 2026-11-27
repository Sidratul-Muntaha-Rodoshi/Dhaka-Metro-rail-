package com.example.dhakametrorailoperations.Rodoshi;

public class PSDProblem {
    private String station;
    private String platform;
    private String problemType;
    private String problemDetails;
    private int reportNumber;

    public PSDProblem(String station, String platform, String problemType, String problemDetails, int reportNumber) {
        this.station = station;
        this.platform = platform;
        this.problemType = problemType;
        this.problemDetails = problemDetails;
        this.reportNumber = reportNumber;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getProblemDetails() {
        return problemDetails;
    }

    public void setProblemDetails(String problemDetails) {
        this.problemDetails = problemDetails;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    @Override
    public String toString() {
        return "PSDProblem{" +
                "station='" + station + '\'' +
                ", platform='" + platform + '\'' +
                ", problemType='" + problemType + '\'' +
                ", problemDetails='" + problemDetails + '\'' +
                ", reportNumber=" + reportNumber +
                '}';
    }
}
