package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class u6_g4_TrainFaultController {

    @FXML
    private ComboBox<String> trainPartComboBox;

    @FXML
    private ComboBox<String> severityComboBox;

    @FXML
    private TextField descriptionTextField;

    @FXML
    private Label reportNumberLabel;

    @FXML
    private Label trainStatusLabel;

    private ArrayList<TrainFault> trainFaultList = new ArrayList<>();


    @FXML
    public void initialize() {

        trainPartComboBox.getItems().addAll(
                "Doors", "Brakes", "Traction",
                "Air Conditioning", "Communication"
        );

        severityComboBox.getItems().addAll(
                "Low", "Medium", "High"
        );
    }


    @FXML
    public void handleSubmitFault() {

        if (trainPartComboBox.getValue() == null ||
                severityComboBox.getValue() == null ||
                descriptionTextField.getText().isEmpty()) {

            return;
        }

        String part = trainPartComboBox.getValue();
        String severity = severityComboBox.getValue();
        String description = descriptionTextField.getText();

        int reportNumber = trainFaultList.size() + 1;

        String status = "Ready";

        if (severity.equals("High")) {
            status = "Not Ready";
        }

        TrainFault fault = new TrainFault(
                part, severity, description,
                reportNumber, status
        );

        trainFaultList.add(fault);

        reportNumberLabel.setText("Report Number: " + reportNumber);
        trainStatusLabel.setText("Train Status: " + status);
    }


    @FXML
    public void handleBack(ActionEvent event) throws java.io.IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_TrainOperatorDashBoard.fxml");
    }
}