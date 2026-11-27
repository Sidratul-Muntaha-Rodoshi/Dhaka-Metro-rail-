package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.time.LocalTime;
import java.util.ArrayList;

public class u6_g3_StationTimingController {

    @FXML
    private ComboBox<String> stationComboBox;

    @FXML
    private ComboBox<String> delayReasonComboBox;

    @FXML
    private Label scheduledArrivalLabel;

    @FXML
    private Label actualArrivalLabel;

    @FXML
    private Label arrivalDelayLabel;

    @FXML
    private Label actualDepartureLabel;

    @FXML
    private Label departureDelayLabel;

    @FXML
    private Label totalDelayLabel;

    private ArrayList<StationTiming> stationTimingList = new ArrayList<>();


    @FXML
    public void initialize() {

        stationComboBox.getItems().addAll(
                "Uttara North", "Uttara Center",
                "Mirpur 10", "Farmgate", "Motijheel"
        );

        delayReasonComboBox.getItems().addAll(
                "Passenger Delay",
                "Technical Problem",
                "Signal Problem",
                "Other"
        );

        scheduledArrivalLabel.setText("Scheduled Arrival: Not Set");
        actualArrivalLabel.setText("Actual Arrival: Not Recorded");
        arrivalDelayLabel.setText("Arrival Delay: N/A");

        actualDepartureLabel.setText("Actual Departure: Not Recorded");
        departureDelayLabel.setText("Departure Delay: N/A");
        totalDelayLabel.setText("Total Delay: N/A");
    }


    @FXML
    public void handleRecordArrival() {

        if (stationComboBox.getValue() == null) {
            return;
        }

        String station = stationComboBox.getValue();
        String actualArrival = LocalTime.now().toString();

        String reason = "";

        if (delayReasonComboBox.getValue() != null) {
            reason = delayReasonComboBox.getValue();
        }

        StationTiming timing = new StationTiming(
                station, actualArrival, reason,
                "Not Recorded", "N/A", "N/A", "N/A"
        );

        stationTimingList.add(timing);

        actualArrivalLabel.setText("Actual Arrival: " + actualArrival);
    }


    @FXML
    public void handleRecordDeparture() {

        if (stationComboBox.getValue() == null) {
            return;
        }

        String station = stationComboBox.getValue();
        String actualDeparture = LocalTime.now().toString();

        String reason = "";

        if (delayReasonComboBox.getValue() != null) {
            reason = delayReasonComboBox.getValue();
        }

        StationTiming timing = new StationTiming(
                station, "Recorded", reason,
                actualDeparture, "N/A", "N/A", "N/A"
        );

        stationTimingList.add(timing);

        actualDepartureLabel.setText("Actual Departure: " + actualDeparture);
    }


    @FXML
    public void handleBack(ActionEvent event) throws java.io.IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_TrainOperatorDashBoard.fxml");
    }
}