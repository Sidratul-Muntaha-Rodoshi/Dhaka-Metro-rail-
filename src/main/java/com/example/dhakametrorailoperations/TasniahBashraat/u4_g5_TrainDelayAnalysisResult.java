package com.example.dhakametrorailoperations.TasniahBashraat;

public class u4_g5_TrainDelayAnalysisResult {
    private String route;
    private Float averageDelay;
    private Integer rank;

    public u4_g5_TrainDelayAnalysisResult(String route, Float averageDelay, Integer rank) {
        this.route = route;
        this.averageDelay = averageDelay;
        this.rank = rank;
    }

    public String getRoute() {
        return route;
    }

    public Float getAverageDelay() {
        return averageDelay;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "TrainDelayAnalysisResult{" +
                "route='" + route + '\'' +
                ", averageDelay=" + averageDelay +
                ", rank=" + rank +
                '}';
    }
}
