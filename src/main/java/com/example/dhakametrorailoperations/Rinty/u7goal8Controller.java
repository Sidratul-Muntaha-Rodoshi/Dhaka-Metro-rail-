package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.io.IOException;

public class u7goal8Controller {

    @javafx.fxml.FXML
    private ComboBox<String> shiftCombo;
    @javafx.fxml.FXML
    private ComboBox<String> conditionCombo;
    @javafx.fxml.FXML
    private TextField noteField;

    @javafx.fxml.FXML
    private Button checkBtn;
    @javafx.fxml.FXML
    private Button saveBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        shiftCombo.getItems().addAll("Morning Shift", "Evening Shift", "Night Shift");
        conditionCombo.getItems().addAll("All Normal", "Minor Delay Occurred", "Equipment Issue Pending");
    }

    @javafx.fxml.FXML
    public void handleCheckShift(ActionEvent actionEvent) {
        String shift = shiftCombo.getValue();

        if (shift == null) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Selection Missing", "Please select a shift first.");
            return;
        }

        if (shift.equals("Night Shift")) {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Night Shift Reminder", "Night Shift selected: Make sure all gates are locked before handover.");
        } else {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Shift Ready", shift + " selected. Ready to write handover note.");
        }
    }

    @javafx.fxml.FXML
    public void handleSaveLog(ActionEvent actionEvent) {
        String shift = shiftCombo.getValue();
        String condition = conditionCombo.getValue();
        String note = noteField.getText().trim();

        if (shift == null || condition == null) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Selection Missing", "Please select both shift and station condition.");
            return;
        }
        if (note.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Note Required", "Please write a short handover note.");
            return;
        }

        u7goal8 log = new u7goal8(shift, condition, note);
        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Shift Log Saved", "Shift log saved successfully!\n(" + shift + " - " + condition + ")");
        noteField.clear();
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}