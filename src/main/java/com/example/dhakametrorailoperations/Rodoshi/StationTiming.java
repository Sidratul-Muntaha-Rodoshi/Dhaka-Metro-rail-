package com.example.dhakametrorailoperations.Rodoshi;

public class StationTiming {
    private String station;
    private String actualArrival;
    private String delayReason;
    private String actualDeparture;
    private String arrivalDelay;
    private String departureDelay;
    private String totalDelay;

    public StationTiming(String station, String actualArrival, String delayReason, String actualDeparture, String arrivalDelay, String departureDelay, String totalDelay) {
        this.station = station;
        this.actualArrival = actualArrival;
        this.delayReason = delayReason;
        this.actualDeparture = actualDeparture;
        this.arrivalDelay = arrivalDelay;
        this.departureDelay = departureDelay;
        this.totalDelay = totalDelay;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getActualArrival() {
        return actualArrival;
    }

    public void setActualArrival(String actualArrival) {
        this.actualArrival = actualArrival;
    }

    public String getDelayReason() {
        return delayReason;
    }

    public void setDelayReason(String delayReason) {
        this.delayReason = delayReason;
    }

    public String getActualDeparture() {
        return actualDeparture;
    }

    public void setActualDeparture(String actualDeparture) {
        this.actualDeparture = actualDeparture;
    }

    public String getArrivalDelay() {
        return arrivalDelay;
    }

    public void setArrivalDelay(String arrivalDelay) {
        this.arrivalDelay = arrivalDelay;
    }

    public String getDepartureDelay() {
        return departureDelay;
    }

    public void setDepartureDelay(String departureDelay) {
        this.departureDelay = departureDelay;
    }

    public String getTotalDelay() {
        return totalDelay;
    }

    public void setTotalDelay(String totalDelay) {
        this.totalDelay = totalDelay;
    }

    @Override
    public String toString() {
        return "StationTiming{" +
                "station='" + station + '\'' +
                ", actualArrival='" + actualArrival + '\'' +
                ", delayReason='" + delayReason + '\'' +
                ", actualDeparture='" + actualDeparture + '\'' +
                ", arrivalDelay='" + arrivalDelay + '\'' +
                ", departureDelay='" + departureDelay + '\'' +
                ", totalDelay='" + totalDelay + '\'' +
                '}';
    }
}
