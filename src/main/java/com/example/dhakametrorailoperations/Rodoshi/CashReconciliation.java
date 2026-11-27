package com.example.dhakametrorailoperations.Rodoshi;

public class CashReconciliation {
    private int openingCash;
    private int ticketSales;
    private int extraFare;
    private int countedCash;
    private int expectedCash;
    private int difference;
    private String reason;

    public CashReconciliation(int openingCash, int ticketSales, int extraFare, int countedCash, int expectedCash, int difference, String reason) {
        this.openingCash = openingCash;
        this.ticketSales = ticketSales;
        this.extraFare = extraFare;
        this.countedCash = countedCash;
        this.expectedCash = expectedCash;
        this.difference = difference;
        this.reason = reason;
    }

    public int getOpeningCash() {
        return openingCash;
    }

    public void setOpeningCash(int openingCash) {
        this.openingCash = openingCash;
    }

    public int getTicketSales() {
        return ticketSales;
    }

    public void setTicketSales(int ticketSales) {
        this.ticketSales = ticketSales;
    }

    public int getExtraFare() {
        return extraFare;
    }

    public void setExtraFare(int extraFare) {
        this.extraFare = extraFare;
    }

    public int getCountedCash() {
        return countedCash;
    }

    public void setCountedCash(int countedCash) {
        this.countedCash = countedCash;
    }

    public int getExpectedCash() {
        return expectedCash;
    }

    public void setExpectedCash(int expectedCash) {
        this.expectedCash = expectedCash;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "CashReconciliation{" +
                "openingCash=" + openingCash +
                ", ticketSales=" + ticketSales +
                ", extraFare=" + extraFare +
                ", countedCash=" + countedCash +
                ", expectedCash=" + expectedCash +
                ", difference=" + difference +
                ", reason='" + reason + '\'' +
                '}';
    }
}
