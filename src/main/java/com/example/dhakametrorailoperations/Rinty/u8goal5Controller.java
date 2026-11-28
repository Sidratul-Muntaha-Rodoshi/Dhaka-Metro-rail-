package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.ArrayList;

public class u8goal5Controller {

    @FXML private TextField shiftIdField;
    @FXML private TextField cashierStationField;
    @FXML private TextField expectedCashField;
    @FXML private TextField submittedCashField;
    @FXML private ComboBox<String> reasonCombo;
    @FXML private TextField noteField;

    @FXML private Button reviewBtn;
    @FXML private Button resolveBtn;
    @FXML private Button Backbutton;

    private final ArrayList<u8goal5> resolvedList = new ArrayList<>();
    private double currentDifference = 0.0;
    private boolean reviewed = false;

    @FXML
    public void initialize() {
        reasonCombo.getItems().addAll(
                "Counting Error",
                "Counterfeit Note",
                "System Glitch",
                "Shortage Deducted"
        );
    }

    @FXML
    public void handleReviewDetails(ActionEvent actionEvent) {
        String expectedText = expectedCashField.getText();
        String submittedText = submittedCashField.getText();

        if (expectedText.isEmpty() || submittedText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please enter both Expected Cash and Submitted Cash.");
            return;
        }

        double expected = Double.parseDouble(expectedText);
        double submitted = Double.parseDouble(submittedText);
        currentDifference = submitted - expected;
        reviewed = true;

        if (currentDifference < 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Cash Shortage", "Shortage detected: BDT " + Math.abs(currentDifference));
        } else if (currentDifference > 0) {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Excess Cash", "Excess cash detected: BDT " + currentDifference);
        } else {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "No Discrepancy", "Expected and submitted cash are equal (0.0).");
        }
    }

    @FXML
    public void handleResolveDifference(ActionEvent actionEvent) {
        String shiftId = shiftIdField.getText();
        String cashierStation = cashierStationField.getText();
        String expectedText = expectedCashField.getText();
        String submittedText = submittedCashField.getText();
        String reason = reasonCombo.getValue();
        String note = noteField.getText();

        if (shiftId.isEmpty() || cashierStation.isEmpty() || expectedText.isEmpty() || submittedText.isEmpty() || reason == null || note.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please fill in all fields and select a reason.");
            return;
        }

        if (!reviewed) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Check Required", "Please click Check Discrepancy first.");
            return;
        }

        double expected = Double.parseDouble(expectedText);
        double submitted = Double.parseDouble(submittedText);

        u8goal5 record = new u8goal5(shiftId, cashierStation, expected, submitted, currentDifference, reason, note);
        resolvedList.add(record);

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Discrepancy Resolved",
                "Discrepancy for Shift " + shiftId + " resolved under '" + reason + "'.\nTotal Resolved Cases: " + resolvedList.size());

        shiftIdField.clear();
        cashierStationField.clear();
        expectedCashField.clear();
        submittedCashField.clear();
        noteField.clear();
        reviewed = false;
    }

    @FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/financeofficerdashboard-view.fxml");
    }
}