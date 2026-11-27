package com.example.dhakametrorailoperations.Rodoshi;

public class IssueTicket {
    private String ticketId;
    private String origin;
    private String destination;
    private int passengerCount;
    private int fare;
    private int totalCost;
    private String paymentMethod;

    public IssueTicket(String ticketId, String origin, String destination, int passengerCount, int fare, int totalCost, String paymentMethod) {
        this.ticketId = ticketId;
        this.origin = origin;
        this.destination = destination;
        this.passengerCount = passengerCount;
        this.fare = fare;
        this.totalCost = totalCost;
        this.paymentMethod = paymentMethod;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "IssueTicket{" +
                "ticketId='" + ticketId + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", passengerCount=" + passengerCount +
                ", fare=" + fare +
                ", totalCost=" + totalCost +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
