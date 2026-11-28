package com.example.dhakametrorailoperations.Rodoshi;

public class StartTrip {
    private String trainId;
    private String tripId;
    private String clearanceId;
    private String reason;
    private String route;
    private String departureTime;
    private String tripStatus;

    public StartTrip(String trainId, String tripId, String clearanceId, String reason, String route, String departureTime, String tripStatus) {
        this.trainId = trainId;
        this.tripId = tripId;
        this.clearanceId = clearanceId;
        this.reason = reason;
        this.route = route;
        this.departureTime = departureTime;
        this.tripStatus = tripStatus;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getClearanceId() {
        return clearanceId;
    }

    public void setClearanceId(String clearanceId) {
        this.clearanceId = clearanceId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(String tripStatus) {
        this.tripStatus = tripStatus;
    }

    @Override
    public String toString() {
        return "StartTrip{" +
                "trainId='" + trainId + '\'' +
                ", tripId='" + tripId + '\'' +
                ", clearanceId='" + clearanceId + '\'' +
                ", reason='" + reason + '\'' +
                ", route='" + route + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", tripStatus='" + tripStatus + '\'' +
                '}';
    }
}
