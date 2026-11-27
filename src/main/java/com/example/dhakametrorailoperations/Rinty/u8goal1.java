package com.example.dhakametrorailoperations.Rinty;

public class u8goal1 {
    private String shiftId;
    private String cashierName;
    private String station;
    private double systemTotal;
    private String status;

    public u8goal1() {
    }

    public u8goal1(String shiftId, String cashierName, String station, double systemTotal, String status) {
        this.shiftId = shiftId;
        this.cashierName = cashierName;
        this.station = station;
        this.systemTotal = systemTotal;
        this.status = status;
    }

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public double getSystemTotal() {
        return systemTotal;
    }

    public void setSystemTotal(double systemTotal) {
        this.systemTotal = systemTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "u8goal1{" +
                "shiftId='" + shiftId + '\'' +
                ", cashierName='" + cashierName + '\'' +
                ", station='" + station + '\'' +
                ", systemTotal=" + systemTotal +
                ", status='" + status + '\'' +
                '}';
    }
}
