package com.example.dhakametrorailoperations.Rinty;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class u7goal6Controller {

    @javafx.fxml.FXML
    private ComboBox<String> emergencyCombo;
    @javafx.fxml.FXML
    private TextField gateStatusField;
    @javafx.fxml.FXML
    private PasswordField pinField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button checkBtn;
    @javafx.fxml.FXML
    private Button unlockBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    public void initialize() {
        emergencyCombo.getItems().addAll("Fire Alarm", "Earthquake Alert", "Power Failure", "Crowd Evacuation");
    }

    @javafx.fxml.FXML
    public void handleCheckGates(ActionEvent actionEvent) {
        String emergency = emergencyCombo.getValue();

        if (emergency == null) {
            statusLabel.setText("Please select an emergency type first.");
            return;
        }

        gateStatusField.setText("Locked - Power Normal");
        statusLabel.setText("Gates are ready. Enter Emergency PIN to unlock.");
    }

    @javafx.fxml.FXML
    public void handleUnlockAll(ActionEvent actionEvent) {
        String status = gateStatusField.getText();
        String pin = pinField.getText();

        if (status.isEmpty()) {
            statusLabel.setText("Please check gates first.");
            return;
        }
        if (!pin.equals("9999")) {
            statusLabel.setText("Wrong Emergency PIN! Try 9999.");
            return;
        }

        gateStatusField.setText("ALL GATES UNLOCKED");
        statusLabel.setText("Emergency: All ticket gates unlocked for free exit!");
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) {
    }
}
