package com.example.dhakametrorailoperations.Rinty;

public class u7goal7 {
    private String equipment;
    private String priority;
    private String details;

    public u7goal7() {
    }

    public u7goal7(String equipment, String priority, String details) {
        this.equipment = equipment;
        this.priority = priority;
        this.details = details;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "u7goal7{" +
                "equipment='" + equipment + '\'' +
                ", priority='" + priority + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
