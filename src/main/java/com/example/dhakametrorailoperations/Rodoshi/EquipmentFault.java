package com.example.dhakametrorailoperations.Rodoshi;

public class EquipmentFault {
    private String equipmentType;
    private String equipmentId;
    private String faultType;
    private String severity;

    public EquipmentFault(String equipmentType, String equipmentId, String faultType, String severity) {
        this.equipmentType = equipmentType;
        this.equipmentId = equipmentId;
        this.faultType = faultType;
        this.severity = severity;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "EquipmentFault{" +
                "equipmentType='" + equipmentType + '\'' +
                ", equipmentId='" + equipmentId + '\'' +
                ", faultType='" + faultType + '\'' +
                ", severity='" + severity + '\'' +
                '}';
    }
}
