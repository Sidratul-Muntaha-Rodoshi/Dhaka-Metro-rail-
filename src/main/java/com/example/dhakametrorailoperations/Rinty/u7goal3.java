package com.example.dhakametrorailoperations.Rinty;

public class u7goal3 {
    private String gate;
    private String mode;
    private String gateStatus;

    public u7goal3() {
    }

    public u7goal3(String gate, String mode, String gateStatus) {
        this.gate = gate;
        this.mode = mode;
        this.gateStatus = gateStatus;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(String gateStatus) {
        this.gateStatus = gateStatus;
    }

    @Override
    public String toString() {
        return "u7goal3{" +
                "gate='" + gate + '\'' +
                ", mode='" + mode + '\'' +
                ", gateStatus='" + gateStatus + '\'' +
                '}';
    }
}
