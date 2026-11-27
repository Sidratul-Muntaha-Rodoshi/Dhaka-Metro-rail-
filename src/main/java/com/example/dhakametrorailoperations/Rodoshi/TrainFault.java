package com.example.dhakametrorailoperations.Rodoshi;

public class TrainFault {
    private String trainPart;
    private String severity;
    private String description;
    private int reportNumber;
    private String trainStatus;

    public TrainFault(String trainPart, String severity, String description, int reportNumber, String trainStatus) {
        this.trainPart = trainPart;
        this.severity = severity;
        this.description = description;
        this.reportNumber = reportNumber;
        this.trainStatus = trainStatus;
    }

    public String getTrainPart() {
        return trainPart;
    }

    public void setTrainPart(String trainPart) {
        this.trainPart = trainPart;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(String trainStatus) {
        this.trainStatus = trainStatus;
    }

    @Override
    public String toString() {
        return "TrainFault{" +
                "trainPart='" + trainPart + '\'' +
                ", severity='" + severity + '\'' +
                ", description='" + description + '\'' +
                ", reportNumber=" + reportNumber +
                ", trainStatus='" + trainStatus + '\'' +
                '}';
    }
}
