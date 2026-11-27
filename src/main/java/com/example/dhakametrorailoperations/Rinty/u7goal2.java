package com.example.dhakametrorailoperations.Rinty;

public class u7goal2 {
    private String platformZone;
    private String doorCommand;
    private String sensorStatus;
    private String doorState;

    public u7goal2() {
    }

    public u7goal2(String platformZone, String doorCommand, String sensorStatus, String doorState) {
        this.platformZone = platformZone;
        this.doorCommand = doorCommand;
        this.sensorStatus = sensorStatus;
        this.doorState = doorState;
    }

    public String getPlatformZone() {
        return platformZone;
    }

    public void setPlatformZone(String platformZone) {
        this.platformZone = platformZone;
    }

    public String getDoorCommand() {
        return doorCommand;
    }

    public void setDoorCommand(String doorCommand) {
        this.doorCommand = doorCommand;
    }

    public String getSensorStatus() {
        return sensorStatus;
    }

    public void setSensorStatus(String sensorStatus) {
        this.sensorStatus = sensorStatus;
    }

    public String getDoorState() {
        return doorState;
    }

    public void setDoorState(String doorState) {
        this.doorState = doorState;
    }

    @Override
    public String toString() {
        return "u7goal2{" +
                "platformZone='" + platformZone + '\'' +
                ", doorCommand='" + doorCommand + '\'' +
                ", sensorStatus='" + sensorStatus + '\'' +
                ", doorState='" + doorState + '\'' +
                '}';
    }
}
