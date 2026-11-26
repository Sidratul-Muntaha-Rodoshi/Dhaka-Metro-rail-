package com.example.dhakametrorailoperations.Rinty;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class u7goal8Controller {

    @javafx.fxml.FXML
    private ComboBox<String> shiftCombo;
    @javafx.fxml.FXML
    private ComboBox<String> conditionCombo;
    @javafx.fxml.FXML
    private TextField noteField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button checkBtn;
    @javafx.fxml.FXML
    private Button saveBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    public void initialize() {
        shiftCombo.getItems().addAll("Morning Shift", "Evening Shift", "Night Shift");
        conditionCombo.getItems().addAll("All Normal", "Minor Delay Occurred", "Equipment Issue Pending");
    }

    @javafx.fxml.FXML
    public void handleCheckShift(ActionEvent actionEvent) {
        String shift = shiftCombo.getValue();

        if (shift == null) {
            statusLabel.setText("Please select a shift first.");
            return;
        }

        if (shift.equals("Night Shift")) {
            statusLabel.setText("Night Shift selected: Make sure all gates are locked before handover.");
        } else {
            statusLabel.setText(shift + " selected. Ready to write handover note.");
        }
    }

    @javafx.fxml.FXML
    public void handleSaveLog(ActionEvent actionEvent) {
        String shift = shiftCombo.getValue();
        String condition = conditionCombo.getValue();
        String note = noteField.getText();

        if (shift == null || condition == null) {
            statusLabel.setText("Please select both shift and station condition.");
            return;
        }
        if (note.isEmpty()) {
            statusLabel.setText("Please write a short handover note.");
            return;
        }

        statusLabel.setText("Shift log saved! (" + shift + " - " + condition + ")");
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) {
    }
}