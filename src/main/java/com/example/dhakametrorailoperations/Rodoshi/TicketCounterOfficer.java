package com.example.dhakametrorailoperations.Rodoshi;
import commonClass.User;

public class TicketCounterOfficer extends User {

    private int officerId;
    private int counterId;

    public TicketCounterOfficer(String userId, String password, String role,
                                int officerId, int counterId) {

        super(userId, password, role);

        this.officerId = officerId;
        this.counterId = counterId;
    }

    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    public int getCounterId() {
        return counterId;
    }

    public void setCounterId(int counterId) {
        this.counterId = counterId;
    }

    @Override
    public String toString() {
        return "TicketCounterOfficer{" +
                "officerId=" + officerId +
                ", counterId=" + counterId +
                '}';
    }
    /// /
}
