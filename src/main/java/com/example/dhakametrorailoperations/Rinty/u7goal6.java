package com.example.dhakametrorailoperations.Rinty;

public class u7goal6 {
    private String emergencyType;
    private String gateStatus;
    private String pin;

    public u7goal6() {
    }

    public u7goal6(String emergencyType, String gateStatus, String pin) {
        this.emergencyType = emergencyType;
        this.gateStatus = gateStatus;
        this.pin = pin;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(String gateStatus) {
        this.gateStatus = gateStatus;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "u7goal6{" +
                "emergencyType='" + emergencyType + '\'' +
                ", gateStatus='" + gateStatus + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
