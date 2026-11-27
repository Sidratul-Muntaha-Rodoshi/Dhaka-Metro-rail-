package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class u6_g7_TrainControlIssueController {

    @FXML
    private ComboBox<String> problemTypeComboBox;

    @FXML
    private ComboBox<String> zoneComboBox;

    @FXML
    private TextField speedTextField;

    @FXML
    private TextField remarksTextField;

    @FXML
    private Label reportStatusLabel;

    private ArrayList<TrainControlIssue> trainControlIssueList = new ArrayList<>();


    @FXML
    public void initialize() {

        problemTypeComboBox.getItems().addAll(
                "Overspeed",
                "Speed Restriction",
                "Signal Problem",
                "Control Problem"
        );

        zoneComboBox.getItems().addAll(
                "Zone 1", "Zone 2", "Zone 3"
        );
    }


    @FXML
    public void handleSubmitReport() {

        if (problemTypeComboBox.getValue() == null ||
                zoneComboBox.getValue() == null ||
                speedTextField.getText().isEmpty() ||
                remarksTextField.getText().isEmpty()) {

            return;
        }

        String problemType = problemTypeComboBox.getValue();
        String zone = zoneComboBox.getValue();
        int speed = Integer.parseInt(speedTextField.getText());
        String remarks = remarksTextField.getText();

        if (speed < 0) {
            return;
        }

        String status = "Submitted";

        TrainControlIssue issue = new TrainControlIssue(
                problemType, zone, speed, remarks, status
        );

        trainControlIssueList.add(issue);

        reportStatusLabel.setText("Report Status: " + status);
    }


    @FXML
    public void handleBack(ActionEvent event) throws java.io.IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_TrainOperatorDashBoard.fxml");
    }
}