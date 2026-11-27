package com.example.dhakametrorailoperations.Rodoshi;

public class TicketReplacement {
    private String ticketId;
    private String replacementReason;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getReplacementReason() {
        return replacementReason;
    }

    public void setReplacementReason(String replacementReason) {
        this.replacementReason = replacementReason;
    }

    public TicketReplacement(String ticketId, String replacementReason) {
        this.ticketId = ticketId;
        this.replacementReason = replacementReason;

    }

    @Override
    public String toString() {
        return "TicketReplacement{" +
                "ticketId='" + ticketId + '\'' +
                ", replacementReason='" + replacementReason + '\'' +
                '}';
    }
}
