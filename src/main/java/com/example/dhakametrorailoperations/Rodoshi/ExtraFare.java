package com.example.dhakametrorailoperations.Rodoshi;

public class ExtraFare {
    private String ticketId;
    private String originalDestination;
    private int extraFare;
    private int paymentAmount;

    public ExtraFare(String ticketId, String originalDestination, int extraFare, int paymentAmount) {
        this.ticketId = ticketId;
        this.originalDestination = originalDestination;
        this.extraFare = extraFare;
        this.paymentAmount = paymentAmount;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getOriginalDestination() {
        return originalDestination;
    }

    public void setOriginalDestination(String originalDestination) {
        this.originalDestination = originalDestination;
    }

    public double getExtraFare() {
        return extraFare;
    }

    public void setExtraFare(int extraFare) {
        this.extraFare = extraFare;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "ExtraFare{" +
                "ticketId='" + ticketId + '\'' +
                ", originalDestination='" + originalDestination + '\'' +
                ", extraFare=" + extraFare +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
