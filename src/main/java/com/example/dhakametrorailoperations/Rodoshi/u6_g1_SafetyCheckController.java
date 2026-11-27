package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class u6_g1_SafetyCheckController {

    @FXML
    private ComboBox<String> trainIDComboBox;

    @FXML
    private ComboBox<String> brakeResultComboBox;

    @FXML
    private ComboBox<String> doorResultComboBox;

    @FXML
    private ComboBox<String> headlightResultComboBox;

    @FXML
    private ComboBox<String> communicationResultComboBox;

    @FXML
    private ComboBox<String> emergencyEquipmentResultComboBox;

    @FXML
    private TextField stationControllerIDTextField;

    @FXML
    private Label trainStatusLabel;

    private ArrayList<SafetyCheck> safetyCheckList = new ArrayList<>();


    @FXML
    public void initialize() {

        trainIDComboBox.getItems().addAll("T101", "T102", "T103");

        brakeResultComboBox.getItems().addAll("Pass", "Fail");
        doorResultComboBox.getItems().addAll("Pass", "Fail");
        headlightResultComboBox.getItems().addAll("Pass", "Fail");
        communicationResultComboBox.getItems().addAll("Pass", "Fail");
        emergencyEquipmentResultComboBox.getItems().addAll("Pass", "Fail");
    }


    @FXML
    public void handleSubmitCheck() {

        if (trainIDComboBox.getValue() == null ||
                brakeResultComboBox.getValue() == null ||
                doorResultComboBox.getValue() == null ||
                headlightResultComboBox.getValue() == null ||
                communicationResultComboBox.getValue() == null ||
                emergencyEquipmentResultComboBox.getValue() == null ||
                stationControllerIDTextField.getText().isEmpty()) {

            return;
        }

        String trainId = trainIDComboBox.getValue();
        String brake = brakeResultComboBox.getValue();
        String door = doorResultComboBox.getValue();
        String headlight = headlightResultComboBox.getValue();
        String communication = communicationResultComboBox.getValue();
        String emergency = emergencyEquipmentResultComboBox.getValue();
        String controllerId = stationControllerIDTextField.getText();

        String status = "Cleared for Service";

        if (brake.equals("Fail") ||
                door.equals("Fail") ||
                headlight.equals("Fail") ||
                communication.equals("Fail") ||
                emergency.equals("Fail")) {

            status = "Not Ready";
        }

        SafetyCheck check = new SafetyCheck(
                trainId, brake, door, headlight,
                communication, emergency, controllerId, status
        );

        safetyCheckList.add(check);

        trainStatusLabel.setText("Train Status: " + status);
    }


    @FXML
    public void handleBack(ActionEvent event) throws java.io.IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_TrainOperatorDashBoard.fxml");
    }
}