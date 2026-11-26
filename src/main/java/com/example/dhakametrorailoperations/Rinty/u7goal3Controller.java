package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class u7goal3Controller {

    @javafx.fxml.FXML
    private ComboBox<String> gateCombo;
    @javafx.fxml.FXML
    private ComboBox<String> modeCombo;
    @javafx.fxml.FXML
    private TextField gateStatusField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button checkBtn;
    @javafx.fxml.FXML
    private Button applyBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        gateCombo.getItems().addAll(
                "Gate-01",
                "Gate-02",
                "Gate-03",
                "Gate-04",
                "Gate-05"
        );

        modeCombo.getItems().addAll(
                "Entry Only",
                "Exit Only",
                "Entry & Exit",
                "Closed"
        );
    }

    @javafx.fxml.FXML
    public void handleCheckGate(ActionEvent actionEvent) {
        String gate = gateCombo.getValue();

        if (gate == null) {
            statusLabel.setText("Please select a gate first.");
            return;
        }

        if (gate.equals("Gate-05")) {
            gateStatusField.setText("Hardware Error");
            statusLabel.setText("Gate-05 is not working.");
        } else {
            gateStatusField.setText("Working - Active");
            statusLabel.setText(gate + " is ready.");
        }
    }

    @javafx.fxml.FXML
    public void handleApplyMode(ActionEvent actionEvent) {
        String gate = gateCombo.getValue();
        String mode = modeCombo.getValue();

        if (gate == null || mode == null) {
            statusLabel.setText("Please select both gate and mode.");
            return;
        }

        if (gate.equals("Gate-05")) {
            statusLabel.setText("Cannot change Gate-05 due to error.");
        } else {
            gateStatusField.setText(mode + " (" + (mode.equals("Closed") ? "Locked" : "Active") + ")");
            statusLabel.setText(gate + " is now set to " + mode + ".");
        }
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }

}