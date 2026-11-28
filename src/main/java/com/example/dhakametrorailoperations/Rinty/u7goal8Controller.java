package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.ArrayList;

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

    private final ArrayList<u7goal8> expenseRequests = new ArrayList<>();
    private final double stationBudgetLimit = 50000.0;

    @javafx.fxml.FXML
    public void initialize() {
        shiftCombo.getItems().addAll("Escalator & Lift Repair", "AFC Gate Maintenance", "Electrical & Lighting", "Emergency Civil Repair");
        conditionCombo.getItems().addAll("Routine Maintenance", "Urgent - Operational Impact", "Emergency Safety Hazard");
    }

    @javafx.fxml.FXML
    public void handleCheckShift(ActionEvent actionEvent) {
        String category = shiftCombo.getValue();
        String costText = noteField.getText().trim();

        if (category == null || costText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please select an Expense Category and enter Estimated Cost.");
            return;
        }

        double cost = Double.parseDouble(costText);
        if (cost <= 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Invalid Cost", "Estimated cost must be greater than 0.");
            return;
        }

        if (cost > stationBudgetLimit) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Exceeds Station Limit",
                    "Requested BDT " + cost + " exceeds Station Limit (BDT " + stationBudgetLimit + ").\nRequires General Manager & Finance Approval!");
        } else {
            double remaining = stationBudgetLimit - cost;
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Budget Available",
                    "Within Station Limit! Remaining Petty Cash Budget after request: BDT " + remaining);
        }
    }

    @javafx.fxml.FXML
    public void handleSaveLog(ActionEvent actionEvent) {
        String category = shiftCombo.getValue();
        String urgency = conditionCombo.getValue();
        String costText = noteField.getText().trim();

        if (category == null || urgency == null || costText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please select Category, Urgency Level, and enter Estimated Cost.");
            return;
        }

        double cost = Double.parseDouble(costText);
        if (cost <= 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Invalid Cost", "Cost must be greater than 0.");
            return;
        }

        u7goal8 request = new u7goal8(category, urgency, costText + " BDT");
        expenseRequests.add(request);

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Expense Request Submitted",
                "Requisition ID: REQ-70" + expenseRequests.size() +
                        "\nCategory: " + category + " (" + urgency + ")" +
                        "\nAmount: BDT " + cost + " forwarded to Central Finance!");

        noteField.clear();
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}