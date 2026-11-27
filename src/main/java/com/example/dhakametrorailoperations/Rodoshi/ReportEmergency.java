package com.example.dhakametrorailoperations.Rodoshi;

public class ReportEmergency {
    private String emergencyType;
    private String location;
    private String status;

    public ReportEmergency(String emergencyType, String location, String status) {
        this.emergencyType = emergencyType;
        this.location = location;
        this.status = status;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReportEmergency{" +
                "emergencyType='" + emergencyType + '\'' +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
