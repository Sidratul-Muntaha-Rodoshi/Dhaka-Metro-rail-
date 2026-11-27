package com.example.dhakametrorailoperations.Rinty;

public class u7goal4 {
    private String area;
    private String controlLevel;
    private String crowdStatus;

    public u7goal4() {
    }

    public u7goal4(String area, String controlLevel, String crowdStatus) {
        this.area = area;
        this.controlLevel = controlLevel;
        this.crowdStatus = crowdStatus;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getControlLevel() {
        return controlLevel;
    }

    public void setControlLevel(String controlLevel) {
        this.controlLevel = controlLevel;
    }

    public String getCrowdStatus() {
        return crowdStatus;
    }

    public void setCrowdStatus(String crowdStatus) {
        this.crowdStatus = crowdStatus;
    }

    @Override
    public String toString() {
        return "u7goal4{" +
                "area='" + area + '\'' +
                ", controlLevel='" + controlLevel + '\'' +
                ", crowdStatus='" + crowdStatus + '\'' +
                '}';
    }
}
