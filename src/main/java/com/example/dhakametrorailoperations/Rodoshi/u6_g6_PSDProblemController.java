package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class u6_g6_PSDProblemController {

    @FXML
    private ComboBox<String> stationComboBox;

    @FXML
    private ComboBox<String> platformComboBox;

    @FXML
    private ComboBox<String> problemTypeComboBox;

    @FXML
    private TextField problemDetailsTextField;

    @FXML
    private Label reportNumberLabel;

    private ArrayList<PSDProblem> psdProblemList = new ArrayList<>();


    @FXML
    public void initialize() {

        stationComboBox.getItems().addAll(
                "Uttara North", "Uttara Center",
                "Mirpur 10", "Farmgate", "Motijheel"
        );

        platformComboBox.getItems().addAll(
                "Platform 1", "Platform 2"
        );

        problemTypeComboBox.getItems().addAll(
                "Door Not Working",
                "Door Sensor Problem",
                "Door Damage",
                "Other"
        );
    }


    @FXML
    public void handleSendReport() {

        if (stationComboBox.getValue() == null ||
                platformComboBox.getValue() == null ||
                problemTypeComboBox.getValue() == null ||
                problemDetailsTextField.getText().isEmpty()) {

            return;
        }

        String station = stationComboBox.getValue();
        String platform = platformComboBox.getValue();
        String problemType = problemTypeComboBox.getValue();
        String details = problemDetailsTextField.getText();

        int reportNumber = psdProblemList.size() + 1;

        PSDProblem problem = new PSDProblem(
                station, platform, problemType,
                details, reportNumber
        );

        psdProblemList.add(problem);

        reportNumberLabel.setText("Report Number: " + reportNumber);
    }


    @FXML
    public void handleBack(ActionEvent event) throws java.io.IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_TrainOperatorDashBoard.fxml");
    }
}