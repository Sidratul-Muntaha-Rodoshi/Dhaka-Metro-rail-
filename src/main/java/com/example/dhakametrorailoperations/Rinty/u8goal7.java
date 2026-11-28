package com.example.dhakametrorailoperations.Rinty;

public class u8goal7 {
    private String requestId;
    private String station;
    private String category;
    private double amount;
    private String remarks;
    private String status;

    public u8goal7() {
    }

    public u8goal7(String requestId, String station, String category, double amount, String remarks, String status) {
        this.requestId = requestId;
        this.station = station;
        this.category = category;
        this.amount = amount;
        this.remarks = remarks;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "u8goal7{" +
                "requestId='" + requestId + '\'' +
                ", station='" + station + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", remarks='" + remarks + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}