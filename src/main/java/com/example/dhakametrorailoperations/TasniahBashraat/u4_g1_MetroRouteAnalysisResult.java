package com.example.dhakametrorailoperations.TasniahBashraat;

public class u4_g1_MetroRouteAnalysisResult {
    private String route;
    private Integer selectionCount;
    private Integer rank;

    public u4_g1_MetroRouteAnalysisResult(String route, Integer selectionCount, Integer rank) {
        this.route = route;
        this.selectionCount = selectionCount;
        this.rank = rank;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Integer getSelectionCount() {
        return selectionCount;
    }

    public void setSelectionCount(Integer selectionCount) {
        this.selectionCount = selectionCount;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "MetroRouteAnalysisResult{" +
                "route='" + route + '\'' +
                ", selectionCount=" + selectionCount +
                ", rank=" + rank +
                '}';
    }
}
