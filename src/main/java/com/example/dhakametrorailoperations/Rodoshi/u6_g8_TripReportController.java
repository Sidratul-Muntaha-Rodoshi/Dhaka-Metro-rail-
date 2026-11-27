package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class u6_g8_TripReportController {

    @FXML
    private ComboBox<String> tripIdComboBox;

    @FXML
    private Label totalDelayLabel;

    @FXML
    private Label lateStationsLabel;

    @FXML
    private Label onTimeRateLabel;

    @FXML
    private Label technicalFaultsLabel;

    @FXML
    private Label emergencyCountLabel;

    @FXML
    private Label tripStatusLabel;

    private ArrayList<TripReport> tripReportList = new ArrayList<>();


    @FXML
    public void initialize() {

        tripIdComboBox.getItems().addAll(
                "TR001", "TR002", "TR003"
        );
    }


    @FXML
    public void handleCalculateSummary() {

        if (tripIdComboBox.getValue() == null) {
            return;
        }

        String tripId = tripIdComboBox.getValue();

        // Demo values: actual records are not connected yet.

        int totalDelay = 0;
        int lateStations = 0;
        int onTimeRate = 0;
        int technicalFaults = 0;
        int emergencyCount = 0;

        String status = "Summary Calculated";

        TripReport report = new TripReport(
                tripId,
                totalDelay,
                lateStations,
                onTimeRate,
                technicalFaults,
                emergencyCount,
                status
        );

        tripReportList.add(report);

        totalDelayLabel.setText("Total Delay: " + totalDelay);
        lateStationsLabel.setText("Late Stations: " + lateStations);
        onTimeRateLabel.setText("On Time Rate: " + onTimeRate + "%");

        technicalFaultsLabel.setText("Technical Faults: " + technicalFaults);
        emergencyCountLabel.setText("Emergency Count: " + emergencyCount);

        tripStatusLabel.setText("Trip Status: " + status);
    }


    @FXML
    public void handleCompleteTrip() {

        if (tripIdComboBox.getValue() == null) {
            return;
        }

        tripStatusLabel.setText("Trip Status: Completed");
    }


    @FXML
    public void handleBack(ActionEvent event) throws java.io.IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_TrainOperatorDashBoard.fxml");
    }
}