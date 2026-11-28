package com.example.dhakametrorailoperations.Rinty;

public class u8goal5 {
    private String shiftId;
    private String cashierStation;
    private double expectedCash;
    private double submittedCash;
    private double difference;
    private String reason;
    private String note;

    public u8goal5() {
    }

    public u8goal5(String shiftId, String cashierStation, double expectedCash, double submittedCash, double difference, String reason, String note) {
        this.shiftId = shiftId;
        this.cashierStation = cashierStation;
        this.expectedCash = expectedCash;
        this.submittedCash = submittedCash;
        this.difference = difference;
        this.reason = reason;
        this.note = note;
    }

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    public String getCashierStation() {
        return cashierStation;
    }

    public void setCashierStation(String cashierStation) {
        this.cashierStation = cashierStation;
    }

    public double getExpectedCash() {
        return expectedCash;
    }

    public void setExpectedCash(double expectedCash) {
        this.expectedCash = expectedCash;
    }

    public double getSubmittedCash() {
        return submittedCash;
    }

    public void setSubmittedCash(double submittedCash) {
        this.submittedCash = submittedCash;
    }

    public double getDifference() {
        return difference;
    }

    public void setDifference(double difference) {
        this.difference = difference;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "u8goal5{" +
                "shiftId='" + shiftId + '\'' +
                ", cashierStation='" + cashierStation + '\'' +
                ", expectedCash=" + expectedCash +
                ", submittedCash=" + submittedCash +
                ", difference=" + difference +
                ", reason='" + reason + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
