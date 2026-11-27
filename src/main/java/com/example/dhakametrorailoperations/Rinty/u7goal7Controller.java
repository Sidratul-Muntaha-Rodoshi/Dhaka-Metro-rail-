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
        String equipment = equipmentField.getText().trim();
        String priority = priorityField.getText().trim();
        String details = detailsField.getText().trim();

        if (equipment.isEmpty() || priority.isEmpty() || details.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please fill in equipment, problem level, and details.");
            return;
        }

        u7goal7 report = new u7goal7(equipment, priority, details);
        reportList.add(report);

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Report Submitted",
                "Report added for " + equipment + ".\nTotal Reports Submitted: " + reportList.size());

        equipmentField.clear();
        priorityField.clear();
        detailsField.clear();
    }

    @javafx.fxml.FXML
    public void handleTotalReports(ActionEvent actionEvent) {
        if (reportList.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Total Reports", "No problem reports submitted yet (Total: 0).");
        } else {
            u7goal7 lastReport = reportList.get(reportList.size() - 1);
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Total Reports",
                    "Total Reports Submitted: " + reportList.size() + "\nLast Reported: " + lastReport.getEquipment() + " (" + lastReport.getPriority() + ")");
        }
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}
