package com.example.dhakametrorailoperations.Rodoshi;

public class SafetyCheck {
    private String trainId;
    private String brakeResult;
    private String doorResult;
    private String headlightResult;
    private String communicationResult;
    private String emergencyEquipmentResult;
    private String stationControllerId;
    private String trainStatus;

    public SafetyCheck(String trainId, String brakeResult, String doorResult, String headlightResult, String communicationResult, String emergencyEquipmentResult, String stationControllerId, String trainStatus) {
        this.trainId = trainId;
        this.brakeResult = brakeResult;
        this.doorResult = doorResult;
        this.headlightResult = headlightResult;
        this.communicationResult = communicationResult;
        this.emergencyEquipmentResult = emergencyEquipmentResult;
        this.stationControllerId = stationControllerId;
        this.trainStatus = trainStatus;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getBrakeResult() {
        return brakeResult;
    }

    public void setBrakeResult(String brakeResult) {
        this.brakeResult = brakeResult;
    }

    public String getDoorResult() {
        return doorResult;
    }

    public void setDoorResult(String doorResult) {
        this.doorResult = doorResult;
    }

    public String getHeadlightResult() {
        return headlightResult;
    }

    public void setHeadlightResult(String headlightResult) {
        this.headlightResult = headlightResult;
    }

    public String getCommunicationResult() {
        return communicationResult;
    }

    public void setCommunicationResult(String communicationResult) {
        this.communicationResult = communicationResult;
    }

    public String getEmergencyEquipmentResult() {
        return emergencyEquipmentResult;
    }

    public void setEmergencyEquipmentResult(String emergencyEquipmentResult) {
        this.emergencyEquipmentResult = emergencyEquipmentResult;
    }

    public String getStationControllerId() {
        return stationControllerId;
    }

    public void setStationControllerId(String stationControllerId) {
        this.stationControllerId = stationControllerId;
    }

    public String getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(String trainStatus) {
        this.trainStatus = trainStatus;
    }

    @Override
    public String toString() {
        return "SafetyCheck{" +
                "trainId='" + trainId + '\'' +
                ", brakeResult='" + brakeResult + '\'' +
                ", doorResult='" + doorResult + '\'' +
                ", headlightResult='" + headlightResult + '\'' +
                ", communicationResult='" + communicationResult + '\'' +
                ", emergencyEquipmentResult='" + emergencyEquipmentResult + '\'' +
                ", stationControllerId='" + stationControllerId + '\'' +
                ", trainStatus='" + trainStatus + '\'' +
                '}';
    }
}
