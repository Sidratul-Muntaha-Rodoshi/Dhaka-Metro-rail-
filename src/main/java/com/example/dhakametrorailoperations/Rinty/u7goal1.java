package com.example.dhakametrorailoperations.Rinty;

public class u7goal1 {
    private String trainId;
    private String route;
    private String time;
    private String status;

    public u7goal1() {
    }

    public u7goal1(String trainId, String route, String time, String status) {
        this.trainId = trainId;
        this.route = route;
        this.time = time;
        this.status = status;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "u7goal1{" +
                "trainId='" + trainId + '\'' +
                ", route='" + route + '\'' +
                ", time='" + time + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
