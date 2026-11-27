package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class u6_g2_StartTripController {

    @FXML
    private ComboBox<String> trainIdComboBox;

    @FXML
    private ComboBox<String> tripIdComboBox;

    @FXML
    private TextField clearanceIdTextField;

    @FXML
    private TextField reasonTextField;

    @FXML
    private Label routeLabel;

    @FXML
    private Label departureTimeLabel;

    @FXML
    private Label tripStatusLabel;

    private ArrayList<StartTrip> startTripList = new ArrayList<>();


    @FXML
    public void initialize() {

        trainIdComboBox.getItems().addAll("T101", "T102", "T103");

        tripIdComboBox.getItems().addAll("TR001", "TR002", "TR003");

        routeLabel.setText("Route: Not Assigned");
        departureTimeLabel.setText("Departure Time: Not Set");
    }


    @FXML
    public void handleStartTrip() {

        if (trainIdComboBox.getValue() == null ||
                tripIdComboBox.getValue() == null ||
                clearanceIdTextField.getText().isEmpty()) {

            return;
        }

        String trainId = trainIdComboBox.getValue();
        String tripId = tripIdComboBox.getValue();
        String clearanceId = clearanceIdTextField.getText();
        String reason = reasonTextField.getText();

        String route = "Not Assigned";
        String departureTime = "Not Set";
        String status = "Trip Started";

        StartTrip trip = new StartTrip(
                trainId, tripId, clearanceId,
                reason, route, departureTime, status
        );

        startTripList.add(trip);

        tripStatusLabel.setText("Trip Status: " + status);
    }


    @FXML
    public void handleBack(ActionEvent event) throws java.io.IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_TrainOperatorDashBoard.fxml");
    }
}