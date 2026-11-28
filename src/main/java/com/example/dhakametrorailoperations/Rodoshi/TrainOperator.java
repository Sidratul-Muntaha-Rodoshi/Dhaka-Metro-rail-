
package com.example.dhakametrorailoperations.Rodoshi;

import commonClass.User;

public class TrainOperator extends User {

    private int operatorId;
    private int assignedTrainId;

    public TrainOperator(String userId, String password, String role,
                         int operatorId, int assignedTrainId) {

        super(userId, password, role);

        this.operatorId = operatorId;
        this.assignedTrainId = assignedTrainId;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public int getAssignedTrainId() {
        return assignedTrainId;
    }

    public void setAssignedTrainId(int assignedTrainId) {
        this.assignedTrainId = assignedTrainId;
    }

    @Override
    public String toString() {
        return "TrainOperator{" +
                "operatorId=" + operatorId +
                ", assignedTrainId=" + assignedTrainId +
                '}';
    }
}
