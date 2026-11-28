package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.ArrayList;

public class u7goal7Controller {

    @javafx.fxml.FXML
    private TextField equipmentField;
    @javafx.fxml.FXML
    private TextField priorityField;
    @javafx.fxml.FXML
    private TextField detailsField;

    @javafx.fxml.FXML
    private Button submitBtn;
    @javafx.fxml.FXML
    private Button countBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    private final ArrayList<u7goal7> reportList = new ArrayList<>();

    @javafx.fxml.FXML
    public void handleSubmitReport(ActionEvent actionEvent) {
        String shiftStation = equipmentField.getText().trim();
        String sysRevText = priorityField.getText().trim();
        String vaultCashText = detailsField.getText().trim();

        if (shiftStation.isEmpty() || sysRevText.isEmpty() || vaultCashText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please enter Shift/Station, System Revenue, and Vault Cash.");
            return;
        }

        double systemRevenue = Double.parseDouble(sysRevText);
        double vaultCash = Double.parseDouble(vaultCashText);

        if (systemRevenue < 0 || vaultCash < 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Invalid Amount", "Cash amounts cannot be negative.");
            return;
        }

        double variance = vaultCash - systemRevenue;
        String status = (variance == 0) ? "Balanced" : "Discrepancy (" + variance + " BDT)";

        u7goal7 report = new u7goal7(shiftStation, status, "Sys: " + systemRevenue + " | Vault: " + vaultCash);
        reportList.add(report);

        if (variance != 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Cash Discrepancy Detected",
                    "Shift: " + shiftStation + "\nVariance: BDT " + variance + "\nReport logged & sent to Finance!");
        } else {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Daily Cash Report Submitted",
                    "Cash Balanced (0.0 BDT variance) for " + shiftStation + ".\nReport sent to Central Finance! Total Reports: " + reportList.size());
        }

        equipmentField.clear();
        priorityField.clear();
        detailsField.clear();
    }

    @javafx.fxml.FXML
    public void handleTotalReports(ActionEvent actionEvent) {
        if (reportList.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Cash Reports", "No daily cash reports submitted yet (Total: 0).");
        } else {
            u7goal7 lastReport = reportList.get(reportList.size() - 1);
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Submitted Cash Reports",
                    "Total Cash Reports Sent to Finance: " + reportList.size() +
                            "\nLast Shift: " + lastReport.getEquipment() + " (" + lastReport.getPriority() + ")");
        }
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}
