package com.example.dhakametrorailoperations.Rinty;

import java.time.LocalDate;

public class u8goal3 {
    private String trxId;
    private String provider;
    private LocalDate date;
    private String type;
    private double amount;
    private String matchStatus;

    public u8goal3() {
    }

    public u8goal3(String trxId, String provider, LocalDate date, String type, double amount, String matchStatus) {
        this.trxId = trxId;
        this.provider = provider;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.matchStatus = matchStatus;
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    @Override
    public String toString() {
        return "u8goal3{" +
                "trxId='" + trxId + '\'' +
                ", provider='" + provider + '\'' +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", matchStatus='" + matchStatus + '\'' +
                '}';
    }
}
