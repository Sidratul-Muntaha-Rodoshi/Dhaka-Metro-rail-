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

public class u8goal4Controller {

    @FXML private TextField depositIdField;
    @FXML private ComboBox<String> stationCombo;
    @FXML private TextField slipNumberField;
    @FXML private TextField recordedRevField;
    @FXML private ComboBox<String> bankBranchCombo;
    @FXML private TextField depositedAmountField;

    @FXML private Button checkBtn;
    @FXML private Button approveBtn;
    @FXML private Button Backbutton;

    private final ArrayList<u8goal4> approvedDeposits = new ArrayList<>();
    private boolean revenueMatched = false;

    @FXML
    private void initialize() {
        stationCombo.getItems().addAll("Uttara North", "Mirpur 10", "Agargaon", "Farmgate", "Motijheel");
        bankBranchCombo.getItems().addAll("Sonali Bank - Motijheel", "Dutch-Bangla Bank - Mirpur", "BRAC Bank - Uttara", "Islami Bank - Farmgate");
    }

    @FXML
    private void handleCheckRevenue(ActionEvent event) {
        String recordedText = recordedRevField.getText();
        String depositedText = depositedAmountField.getText();

        if (recordedText.isEmpty() || depositedText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please enter both Recorded Revenue and Deposited Amount.");
            return;
        }

        double recorded = Double.parseDouble(recordedText);
        double deposited = Double.parseDouble(depositedText);

        if (recorded == deposited) {
            revenueMatched = true;
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Revenue Matched", "Amounts match! You can now approve the deposit.");
        } else {
            revenueMatched = false;
            double diff = deposited - recorded;
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Revenue Mismatch", "Mismatch detected! Difference: BDT " + diff);
        }
    }

    @FXML
    private void handleApproveDeposit(ActionEvent event) {
        String depositId = depositIdField.getText();
        String station = stationCombo.getValue();
        String slip = slipNumberField.getText();
        String recordedText = recordedRevField.getText();
        String branch = bankBranchCombo.getValue();
        String depositedText = depositedAmountField.getText();

        if (depositId.isEmpty() || station == null || slip.isEmpty() || recordedText.isEmpty() || branch == null || depositedText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please fill in all fields and select options.");
            return;
        }

        if (!revenueMatched) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Check Required", "Please click Check Revenue and make sure amounts match first.");
            return;
        }

        double recorded = Double.parseDouble(recordedText);
        double deposited = Double.parseDouble(depositedText);

        u8goal4 deposit = new u8goal4(depositId, station, slip, recorded, branch, deposited);
        approvedDeposits.add(deposit);

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Deposit Approved",
                "Bank deposit " + depositId + " approved!\nTotal Approved Deposits: " + approvedDeposits.size());

        depositIdField.clear();
        slipNumberField.clear();
        recordedRevField.clear();
        depositedAmountField.clear();
        revenueMatched = false;
    }

    @FXML
    private void handleback(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/financeofficerdashboard-view.fxml");
    }
}