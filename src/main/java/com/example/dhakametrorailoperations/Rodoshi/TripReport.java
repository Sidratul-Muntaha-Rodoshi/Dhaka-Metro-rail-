package com.example.dhakametrorailoperations.Rodoshi;

public class TripReport {
    private String tripId;
    private int totalDelay;
    private int lateStations;
    private int onTimeRate;
    private int technicalFaults;
    private int emergencyCount;
    private String tripStatus;

    public TripReport(String tripId, int totalDelay, int lateStations, int onTimeRate, int technicalFaults, int emergencyCount, String tripStatus) {
        this.tripId = tripId;
        this.totalDelay = totalDelay;
        this.lateStations = lateStations;
        this.onTimeRate = onTimeRate;
        this.technicalFaults = technicalFaults;
        this.emergencyCount = emergencyCount;
        this.tripStatus = tripStatus;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public int getTotalDelay() {
        return totalDelay;
    }

    public void setTotalDelay(int totalDelay) {
        this.totalDelay = totalDelay;
    }

    public int getLateStations() {
        return lateStations;
    }

    public void setLateStations(int lateStations) {
        this.lateStations = lateStations;
    }

    public int getOnTimeRate() {
        return onTimeRate;
    }

    public void setOnTimeRate(int onTimeRate) {
        this.onTimeRate = onTimeRate;
    }

    public int getTechnicalFaults() {
        return technicalFaults;
    }

    public void setTechnicalFaults(int technicalFaults) {
        this.technicalFaults = technicalFaults;
    }

    public int getEmergencyCount() {
        return emergencyCount;
    }

    public void setEmergencyCount(int emergencyCount) {
        this.emergencyCount = emergencyCount;
    }

    public String getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(String tripStatus) {
        this.tripStatus = tripStatus;
    }

    @Override
    public String toString() {
        return "TripReport{" +
                "tripId='" + tripId + '\'' +
                ", totalDelay=" + totalDelay +
                ", lateStations=" + lateStations +
                ", onTimeRate=" + onTimeRate +
                ", technicalFaults=" + technicalFaults +
                ", emergencyCount=" + emergencyCount +
                ", tripStatus='" + tripStatus + '\'' +
                '}';
    }
}
