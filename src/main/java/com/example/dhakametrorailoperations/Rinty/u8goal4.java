package com.example.dhakametrorailoperations.Rinty;

public class u8goal4 {
    private String depositId;
    private String station;
    private String slipNumber;
    private double recordedRevenue;
    private String bankBranch;
    private double depositedAmount;

    public u8goal4() {
    }

    public u8goal4(String depositId, String station, String slipNumber, double recordedRevenue, String bankBranch, double depositedAmount) {
        this.depositId = depositId;
        this.station = station;
        this.slipNumber = slipNumber;
        this.recordedRevenue = recordedRevenue;
        this.bankBranch = bankBranch;
        this.depositedAmount = depositedAmount;
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getSlipNumber() {
        return slipNumber;
    }

    public void setSlipNumber(String slipNumber) {
        this.slipNumber = slipNumber;
    }

    public double getRecordedRevenue() {
        return recordedRevenue;
    }

    public void setRecordedRevenue(double recordedRevenue) {
        this.recordedRevenue = recordedRevenue;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public double getDepositedAmount() {
        return depositedAmount;
    }

    public void setDepositedAmount(double depositedAmount) {
        this.depositedAmount = depositedAmount;
    }

    @Override
    public String toString() {
        return "u8goal4{" +
                "depositId='" + depositId + '\'' +
                ", station='" + station + '\'' +
                ", slipNumber='" + slipNumber + '\'' +
                ", recordedRevenue=" + recordedRevenue +
                ", bankBranch='" + bankBranch + '\'' +
                ", depositedAmount=" + depositedAmount +
                '}';
    }
}
