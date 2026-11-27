package com.example.dhakametrorailoperations.Rodoshi;

public class ShiftClosing {
    private String financeOfficerId;
    private int finalCash;
    private String reason;

    public ShiftClosing(String financeOfficerId, int finalCash, String reason) {
        this.financeOfficerId = financeOfficerId;
        this.finalCash = finalCash;
        this.reason = reason;
    }

    public String getFinanceOfficerId() {
        return financeOfficerId;
    }

    public void setFinanceOfficerId(String financeOfficerId) {
        this.financeOfficerId = financeOfficerId;
    }

    public double getFinalCash() {
        return finalCash;
    }

    public void setFinalCash(int finalCash) {
        this.finalCash = finalCash;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ShiftClosing{" +
                "financeOfficerId='" + financeOfficerId + '\'' +
                ", finalCash=" + finalCash +
                ", reason='" + reason + '\'' +
                '}';
    }
}
