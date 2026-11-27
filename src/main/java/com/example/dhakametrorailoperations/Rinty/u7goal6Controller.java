package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class u7goal6Controller {

    @javafx.fxml.FXML
    private ComboBox<String> emergencyCombo;
    @javafx.fxml.FXML
    private TextField gateStatusField;
    @javafx.fxml.FXML
    private PasswordField pinField;

    @javafx.fxml.FXML
    private Button unlockBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        emergencyCombo.getItems().addAll(
                "Fire Alarm Triggered",
                "Earthquake Alert",
                "Power Failure",
                "Medical / Crowd Evacuation"
        );
    }

    @javafx.fxml.FXML
    public void handleUnlockAll(ActionEvent actionEvent) {
        String emergency = emergencyCombo.getValue();
        String pin = pinField.getText().trim();

        if (emergency == null) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Selection Missing", "Please select an emergency type first.");
            return;
        }

        if (pin.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "PIN Required", "Please enter the Emergency PIN.");
            return;
        }

        if (pin.equals("9999")) {
            gateStatusField.setText("UNLOCKED (" + emergency + ")");
            u7goal6 record = new u7goal6(emergency, gateStatusField.getText(), pin);
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Gates Unlocked", "All ticket gates unlocked for " + emergency + "!");
            pinField.clear();
        } else {
            gateStatusField.setText("LOCKED (Invalid PIN)");
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Invalid PIN", "Incorrect Emergency PIN! Gates remain locked.");
        }
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}
