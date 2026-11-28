package com.example.dhakametrorailoperations.Rinty;

import commonClass.User;

public class CentralFinanceOfficer extends User {
    private String name;
    private String department;
    private String securityPin;
    private double approvalLimit;

    public CentralFinanceOfficer(String userId, String password, String name, String department, String securityPin, double approvalLimit) {
        super(userId, password, "Central Finance Officer");
        this.name = name;
        this.department = department;
        this.securityPin = securityPin;
        this.approvalLimit = approvalLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSecurityPin() {
        return securityPin;
    }

    public void setSecurityPin(String securityPin) {
        this.securityPin = securityPin;
    }

    public double getApprovalLimit() {
        return approvalLimit;
    }

    public void setApprovalLimit(double approvalLimit) {
        this.approvalLimit = approvalLimit;
    }

    @Override
    public String toString() {
        return "CentralFinanceOfficer{" +
                "userId='" + getUserId() + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", approvalLimit=" + approvalLimit +
                '}';
    }
}
