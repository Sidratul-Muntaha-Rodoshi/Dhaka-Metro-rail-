package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class u8goal6Controller {

    @FXML private DatePicker reportDatePicker;
    @FXML private ComboBox<String> stationCombo;
    @FXML private TextField ticketSalesField;
    @FXML private TextField cardRechargeField;
    @FXML private TextField totalRevenueField;

    @FXML private Button generateBtn;
    @FXML private Button saveBtn;
    @FXML private Button Backbutton;

    private final ArrayList<u8goal6> reportList = new ArrayList<>();
    private boolean calculated = false;

    @FXML
    private void initialize() {
        stationCombo.getItems().addAll("Uttara North", "Mirpur 10", "Agargaon", "Farmgate", "Motijheel");
    }

    @FXML
    private void handleGenerateReport(ActionEvent event) {
        String ticketText = ticketSalesField.getText();
        String rechargeText = cardRechargeField.getText();

        if (ticketText.isEmpty() || rechargeText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please enter both Ticket Sales and Card Recharge amounts.");
            return;
        }

        double ticketSales = Double.parseDouble(ticketText);
        double cardRecharge = Double.parseDouble(rechargeText);

        if (ticketSales < 0 || cardRecharge < 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Invalid Amount", "Amounts cannot be negative.");
            return;
        }

        double total = ticketSales + cardRecharge;
        totalRevenueField.setText(String.valueOf(total));
        calculated = true;

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Summary Calculated",
                "Total Daily Revenue: BDT " + total + "\nClick 'Save Report' to record this summary.");
    }

    @FXML
    private void handleSaveReport(ActionEvent event) {
        LocalDate date = reportDatePicker.getValue();
        String station = stationCombo.getValue();
        String ticketText = ticketSalesField.getText();
        String rechargeText = cardRechargeField.getText();
        String totalText = totalRevenueField.getText();

        if (date == null || station == null || ticketText.isEmpty() || rechargeText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please select Date, Station, and enter revenue amounts.");
            return;
        }

        if (!calculated || totalText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Calculation Required", "Please click 'Calculate Total' before saving the report.");
            return;
        }

        double ticketSales = Double.parseDouble(ticketText);
        double cardRecharge = Double.parseDouble(rechargeText);
        double total = Double.parseDouble(totalText);

        u8goal6 report = new u8goal6(date, station, ticketSales, cardRecharge, total);
        reportList.add(report);

        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Report Saved",
                "Daily summary report saved for " + station + " (" + date + ").\nTotal Saved Reports: " + reportList.size());

        ticketSalesField.clear();
        cardRechargeField.clear();
        totalRevenueField.clear();
        calculated = false;
    }

    @FXML
    private void handleback(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/financeofficerdashboard-view.fxml");
    }
}