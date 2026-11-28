package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.ArrayList;

public class u8goal2Controller {

    @FXML private TextField penaltyIdField;
    @FXML private TextField passengerIdField;
    @FXML private ComboBox<String> categoryCombo;
    @FXML private Label accountCodeLabel;
    @FXML private TextField amountField;
    @FXML private TextField receiptField;

    @FXML private Button saveBtn;
    @FXML private Button totalBtn;
    @FXML private Button Backbutton;

    private final ArrayList<u8goal2> penaltyList = new ArrayList<>();

    @FXML
    private void initialize() {
        categoryCombo.getItems().addAll(
                "Ticketless Travel",
                "Overstay Penalty",
                "Card Damage Fine",
                "Station Rule Violation"
        );
    }

    @FXML
    private void handleCategorySelect(ActionEvent event) {
        String category = categoryCombo.getValue();
        if (category == null) return;

        if (category.equals("Ticketless Travel")) {
            accountCodeLabel.setText("ACC-401");
        } else if (category.equals("Overstay Penalty")) {
            accountCodeLabel.setText("ACC-402");
        } else if (category.equals("Card Damage Fine")) {
            accountCodeLabel.setText("ACC-403");
        } else {
            accountCodeLabel.setText("ACC-404");
        }
    }

    @FXML
    private void handleSavePenalty(ActionEvent event) {
        String penaltyId = penaltyIdField.getText();
        String passengerId = passengerIdField.getText();
        String category = categoryCombo.getValue();
        String accountCode = accountCodeLabel.getText();
        String amountText = amountField.getText();
        String receipt = receiptField.getText();

        if (penaltyId.isEmpty() || passengerId.isEmpty() || category == null || amountText.isEmpty() || receipt.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please fill in all fields and select a category.");
            return;
        }

        double amount = Double.parseDouble(amountText);
        if (amount <= 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Invalid Amount", "Amount must be greater than 0.");
            return;
        }

        u8goal2 record = new u8goal2(penaltyId, passengerId, category, accountCode, amount, receipt);
        penaltyList.add(record);

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Penalty Saved",
                "Penalty recorded for Passenger " + passengerId + " (BDT " + amount + ").\nTotal Records: " + penaltyList.size());

        penaltyIdField.clear();
        passengerIdField.clear();
        amountField.clear();
        receiptField.clear();
    }

    @FXML
    private void handleShowTotal(ActionEvent event) {
        double totalCollected = 0;
        for (u8goal2 item : penaltyList) {
            totalCollected += item.getAmount();
        }

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Total Penalty Revenue",
                "Total Penalties Recorded: " + penaltyList.size() + "\nTotal Revenue Collected: BDT " + totalCollected);
    }

    @FXML
    private void handleback(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/financeofficerdashboard-view.fxml");
    }
}