package com.example.dhakametrorailoperations.Rodoshi;

public class overStayPenalty {
    private String ticketId;
    private int overStay;
    private int penaltyAmount;
    private String paymentMethod;

    public overStayPenalty(String ticketId, int overStay, int penaltyAmount, String paymentMethod) {
        this.ticketId = ticketId;
        this.overStay = overStay;
        this.penaltyAmount = penaltyAmount;
        this.paymentMethod = paymentMethod;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getOverStay() {
        return overStay;
    }

    public void setOverStay(int overStay) {
        this.overStay = overStay;
    }

    public double getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(int penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "overStayPenalty{" +
                "ticketId='" + ticketId + '\'' +
                ", overStay=" + overStay +
                ", penaltyAmount=" + penaltyAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
