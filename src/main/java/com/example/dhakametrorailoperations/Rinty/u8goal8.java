package com.example.dhakametrorailoperations.Rinty;

public class u8goal8 {
    private String month;
    private String station;
    private double totalRevenue;
    private double totalExpense;
    private double netBalance;

    public u8goal8() {
    }

    public u8goal8(String month, String station, double totalRevenue, double totalExpense, double netBalance) {
        this.month = month;
        this.station = station;
        this.totalRevenue = totalRevenue;
        this.totalExpense = totalExpense;
        this.netBalance = netBalance;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getNetBalance() {
        return netBalance;
    }

    public void setNetBalance(double netBalance) {
        this.netBalance = netBalance;
    }

    @Override
    public String toString() {
        return "u8goal8{" +
                "month='" + month + '\'' +
                ", station='" + station + '\'' +
                ", totalRevenue=" + totalRevenue +
                ", totalExpense=" + totalExpense +
                ", netBalance=" + netBalance +
                '}';
    }
}
