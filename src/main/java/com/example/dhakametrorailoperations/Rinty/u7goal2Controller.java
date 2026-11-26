package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class u7goal2Controller {

    @javafx.fxml.FXML
    private ComboBox<String> platformZoneCombo;
    @javafx.fxml.FXML
    private ComboBox<String> doorCommandCombo;
    @javafx.fxml.FXML
    private TextField sensorStatusField;
    @javafx.fxml.FXML
    private TextField doorStateField;
    @javafx.fxml.FXML
    private PasswordField securityKeyField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button checkSafetyBtn;
    @javafx.fxml.FXML
    private Button applyCommandBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        platformZoneCombo.getItems().addAll(
                "Platform 1 - Front Doors",
                "Platform 1 - Back Doors",
                "Platform 2 - Front Doors",
                "Platform 2 - Back Doors"
        );

        doorCommandCombo.getItems().addAll(
                "Force Open Doors",
                "Force Close Doors",
                "Reset Door Lock"
        );
    }

    @javafx.fxml.FXML
    public void handleCheckSafety(ActionEvent actionEvent) {
        String zone = platformZoneCombo.getValue();
        String command = doorCommandCombo.getValue();

        if (zone == null || command == null) {
            statusLabel.setText("Please select platform zone and door action.");
            return;
        }

        if (zone.equals("Platform 2 - Back Doors") && command.equals("Force Close Doors")) {
            sensorStatusField.setText("Object Detected at Door!");
            doorStateField.setText("Open (Blocked)");
            statusLabel.setText("Warning: Passenger or object blocking door! Cannot close.");
        } else {
            sensorStatusField.setText("Clear - No Obstacle");
            doorStateField.setText("Ready for Action");
            statusLabel.setText("Safety check passed. Enter Security Key to apply.");
        }
    }

    @javafx.fxml.FXML
    public void handleApplyDoorCommand(ActionEvent actionEvent) {
        String sensor = sensorStatusField.getText();
        String command = doorCommandCombo.getValue();
        String key = securityKeyField.getText();

        if (sensor.isEmpty()) {
            statusLabel.setText("Please run Check Door Safety first.");
            return;
        }
        if (sensor.contains("Object Detected")) {
            statusLabel.setText("Cannot apply! Clear the door obstacle first.");
            return;
        }
        if (!key.equals("1234")) {
            statusLabel.setText("Invalid Security Key! Try 1234.");
            return;
        }

        if (command.equals("Force Open Doors")) {
            doorStateField.setText("OPEN (Manual Override)");
        } else if (command.equals("Force Close Doors")) {
            doorStateField.setText("CLOSED & LOCKED");
        } else {
            doorStateField.setText("NORMAL AUTO MODE");
        }

        statusLabel.setText("Door command applied successfully!");
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}