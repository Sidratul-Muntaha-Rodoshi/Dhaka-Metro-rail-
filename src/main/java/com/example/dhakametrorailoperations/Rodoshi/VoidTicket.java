package com.example.dhakametrorailoperations.Rodoshi;

public class VoidTicket {
    private String ticketId;
    private String reason;
    private String status;

    public VoidTicket(String status, String reason, String ticketId) {
        this.status = status;
        this.reason = reason;
        this.ticketId = ticketId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VoidTicket{" +
                "ticketId='" + ticketId + '\'' +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
