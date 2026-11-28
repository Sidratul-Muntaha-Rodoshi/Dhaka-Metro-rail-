package com.example.dhakametrorailoperations.Rinty;

import java.time.LocalDate;

public class u8goal6 {
    private LocalDate reportDate;
    private String station;
    private double ticketSales;
    private double cardRecharge;
    private double totalRevenue;

    public u8goal6() {
    }

    public u8goal6(LocalDate reportDate, String station, double ticketSales, double cardRecharge, double totalRevenue) {
        this.reportDate = reportDate;
        this.station = station;
        this.ticketSales = ticketSales;
        this.cardRecharge = cardRecharge;
        this.totalRevenue = totalRevenue;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public double getTicketSales() {
        return ticketSales;
    }

    public void setTicketSales(double ticketSales) {
        this.ticketSales = ticketSales;
    }

    public double getCardRecharge() {
        return cardRecharge;
    }

    public void setCardRecharge(double cardRecharge) {
        this.cardRecharge = cardRecharge;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    @Override
    public String toString() {
        return "u8goal6{" +
                "reportDate=" + reportDate +
                ", station='" + station + '\'' +
                ", ticketSales=" + ticketSales +
                ", cardRecharge=" + cardRecharge +
                ", totalRevenue=" + totalRevenue +
                '}';
    }
}
