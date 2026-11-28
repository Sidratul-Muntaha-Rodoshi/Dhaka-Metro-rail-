package com.example.dhakametrorailoperations.TasniahBashraat;

import java.time.LocalDate;

public class u4_g2_BusiestTravelDateAnalysisResult {
    private LocalDate busiestTravelDate;
    private Integer passengerEntries;
    private Integer rank;

    public u4_g2_BusiestTravelDateAnalysisResult(LocalDate busiestTravelDate, Integer passengerEntries, Integer rank) {
        this.busiestTravelDate = busiestTravelDate;
        this.passengerEntries = passengerEntries;
        this.rank = rank;
    }

    public LocalDate getBusiestTravelDate() {
        return busiestTravelDate;
    }

    public Integer getPassengerEntries() {
        return passengerEntries;
    }

    public Integer getRank() {
        return rank;
    }

    public void setBusiestTravelDate(LocalDate busiestTravelDate) {
        this.busiestTravelDate = busiestTravelDate;
    }

    public void setPassengerEntries(Integer passengerEntries) {
        this.passengerEntries = passengerEntries;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "BusiestTravelDateAnalysisResult{" +
                "busiestTravelDate=" + busiestTravelDate +
                ", passengerEntries=" + passengerEntries +
                ", rank=" + rank +
                '}';
    }
}
