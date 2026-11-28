package com.example.dhakametrorailoperations.Rinty;

import commonClass.User;

public class StationController extends User {
    private String name;
    private String assignedStation;
    private String shiftTime;
    private String controllerPin;

    public StationController(String userId, String password, String name, String assignedStation, String shiftTime, String controllerPin) {
        super(userId, password, "Station Controller");
        this.name = name;
        this.assignedStation = assignedStation;
        this.shiftTime = shiftTime;
        this.controllerPin = controllerPin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignedStation() {
        return assignedStation;
    }

    public void setAssignedStation(String assignedStation) {
        this.assignedStation = assignedStation;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public String getControllerPin() {
        return controllerPin;
    }

    public void setControllerPin(String controllerPin) {
        this.controllerPin = controllerPin;
    }
//
    @Override
    public String toString() {
        return "StationController{" +
                "userId='" + getUserId() + '\'' +
                ", name='" + name + '\'' +
                ", assignedStation='" + assignedStation + '\'' +
                ", shiftTime='" + shiftTime + '\'' +
                '}';
    }
}
