package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class u8goal3Controller {

    @FXML private TextField trxIdField;
    @FXML private ComboBox<String> providerCombo;
    @FXML private DatePicker datePicker;
    @FXML private ComboBox<String> typeCombo;
    @FXML private TextField amountField;

    @FXML private Label matchedTotalLabel;
    @FXML private Label bankFeeLabel;

    @FXML private Button addTrxBtn;
    @FXML private Button autoMatchBtn;
    @FXML private Button confirmBtn;
    @FXML private Button Backbutton;

    private final ArrayList<u8goal3> transactionList = new ArrayList<>();

    @FXML
    private void initialize() {
        providerCombo.getItems().addAll("bKash", "Nagad", "Rocket", "VISA / Mastercard");
        typeCombo.getItems().addAll("Single Journey Ticket", "MRT Pass Top-Up");
    }

    @FXML
    private void handleAddTransaction(ActionEvent event) {
        String trxId = trxIdField.getText();
        String provider = providerCombo.getValue();
        LocalDate date = datePicker.getValue();
        String type = typeCombo.getValue();
        String amountText = amountField.getText();

        if (trxId.isEmpty() || provider == null || date == null || type == null || amountText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please fill in all fields and select a date.");
            return;
        }

        double amount = Double.parseDouble(amountText);
        if (amount <= 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Invalid Amount", "Amount must be greater than 0.");
            return;
        }

        transactionList.add(new u8goal3(trxId, provider, date, type, amount, "Unmatched"));
        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Transaction Added",
                "Transaction " + trxId + " added.\nTotal Transactions: " + transactionList.size());

        trxIdField.clear();
        amountField.clear();
    }

    @FXML
    private void handleAutoMatch(ActionEvent event) {
        if (transactionList.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Empty List", "Please add transactions first.");
            return;
        }

        double matchedTotal = 0;
        for (u8goal3 trx : transactionList) {
            trx.setMatchStatus("Matched");
            matchedTotal += trx.getAmount();
        }

        double bankFee = matchedTotal * 0.02;
        matchedTotalLabel.setText(String.valueOf(matchedTotal));
        bankFeeLabel.setText(String.valueOf(bankFee));

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Auto-Match Complete",
                "Matched " + transactionList.size() + " transactions!\nTotal: BDT " + matchedTotal);
    }

    @FXML
    private void handleConfirmReconciliation(ActionEvent event) {
        if (transactionList.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "No Data", "No transactions to reconcile.");
            return;
        }

        for (u8goal3 trx : transactionList) {
            if (trx.getMatchStatus().equals("Unmatched")) {
                AlertHelper.showAlert(Alert.AlertType.WARNING, "Pending Items", "Please click Auto-Match first.");
                return;
            }
        }

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Reconciliation Confirmed",
                "Digital payment reconciliation confirmed!\nTotal Transactions: " + transactionList.size() + "\nMatched Total: BDT " + matchedTotalLabel.getText());
    }

    @FXML
    private void handleback(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/financeofficerdashboard-view.fxml");
    }
}