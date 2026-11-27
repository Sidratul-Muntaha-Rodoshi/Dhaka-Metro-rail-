package com.example.dhakametrorailoperations.Rinty;

public class u8goal2 {
    private String penaltyId;
    private String passengerId;
    private String category;
    private String accountCode;
    private double amount;
    private String receiptNumber;

    public u8goal2() {
    }

    public u8goal2(String penaltyId, String passengerId, String category, String accountCode, double amount, String receiptNumber) {
        this.penaltyId = penaltyId;
        this.passengerId = passengerId;
        this.category = category;
        this.accountCode = accountCode;
        this.amount = amount;
        this.receiptNumber = receiptNumber;
    }

    public String getPenaltyId() {
        return penaltyId;
    }

    public void setPenaltyId(String penaltyId) {
        this.penaltyId = penaltyId;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    @Override
    public String toString() {
        return "u8goal2{" +
                "penaltyId='" + penaltyId + '\'' +
                ", passengerId='" + passengerId + '\'' +
                ", category='" + category + '\'' +
                ", accountCode='" + accountCode + '\'' +
                ", amount=" + amount +
                ", receiptNumber='" + receiptNumber + '\'' +
                '}';
    }
}
