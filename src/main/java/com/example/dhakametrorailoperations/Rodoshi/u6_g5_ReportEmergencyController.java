package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class u6_g5_ReportEmergencyController {

    @FXML
    private ComboBox<String> emergencyTypeComboBox;

    @FXML
    private TextField locationTextField;

    private ArrayList<ReportEmergency> emergencyList = new ArrayList<>();


    @FXML
    public void initialize() {

        emergencyTypeComboBox.getItems().addAll(
                "Fire or Smoke",
                "Medical",
                "Object on Track",
                "Passenger Alarm"
        );
    }


    @FXML
    public void handleDeclareEmergency() {

        if (emergencyTypeComboBox.getValue() == null ||
                locationTextField.getText().isEmpty()) {

            return;
        }

        String emergencyType = emergencyTypeComboBox.getValue();
        String location = locationTextField.getText();
        String status = "Declared";

        ReportEmergency emergency = new ReportEmergency(
                emergencyType, location, status
        );

        emergencyList.add(emergency);
    }


    @FXML
    public void handleBack(ActionEvent event) throws java.io.IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_TrainOperatorDashBoard.fxml");
    }
}