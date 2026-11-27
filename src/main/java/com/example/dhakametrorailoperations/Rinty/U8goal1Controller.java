package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class U8goal1Controller {

    @FXML private TextField shiftIdField;
    @FXML private TextField cashierNameField;
    @FXML private TextField stationField;
    @FXML private TextField systemTotalInputField;
    @FXML private Button addEntryBtn;

    @FXML private TableView<u8goal1> cashHandoverTable;
    @FXML private TableColumn<u8goal1, String> shiftIdCol;
    @FXML private TableColumn<u8goal1, String> cashierNameCol;
    @FXML private TableColumn<u8goal1, String> stationCol;
    @FXML private TableColumn<u8goal1, Double> systemTotalCol;
    @FXML private TableColumn<u8goal1, String> statusCol;

    @FXML private Label cashierNameLabel;
    @FXML private Label systemTotalLabel;
    @FXML private TextField countedCashField;
    @FXML private Label differenceLabel;

    @FXML private Button checkDiffBtn;
    @FXML private Button approveMatchBtn;
    @FXML private Button Backbutton;

    private final ObservableList<u8goal1> handoverList = FXCollections.observableArrayList();
    private boolean differenceChecked = false;
    private double currentDifference = 0.0;

    @FXML
    private void initialize() {
        shiftIdCol.setCellValueFactory(new PropertyValueFactory<>("shiftId"));
        cashierNameCol.setCellValueFactory(new PropertyValueFactory<>("cashierName"));
        stationCol.setCellValueFactory(new PropertyValueFactory<>("station"));
        systemTotalCol.setCellValueFactory(new PropertyValueFactory<>("systemTotal"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        cashHandoverTable.setItems(handoverList);
    }

    @FXML
    private void handleAddEntry(ActionEvent event) {
        String shiftId = shiftIdField.getText();
        String cashier = cashierNameField.getText();
        String station = stationField.getText();
        String totalText = systemTotalInputField.getText();

        if (shiftId.isEmpty() || cashier.isEmpty() || station.isEmpty() || totalText.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please fill in all fields.");
            return;
        }

        double systemTotal = Double.parseDouble(totalText);
        if (systemTotal < 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Invalid Amount", "System total cannot be negative.");
            return;
        }

        handoverList.add(new u8goal1(shiftId, cashier, station, systemTotal, "Pending"));
        shiftIdField.clear();
        cashierNameField.clear();
        stationField.clear();
        systemTotalInputField.clear();
    }

    @FXML
    private void handleRowSelect(MouseEvent event) {
        u8goal1 selected = cashHandoverTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            cashierNameLabel.setText(selected.getCashierName());
            systemTotalLabel.setText(String.valueOf(selected.getSystemTotal()));
            countedCashField.clear();
            differenceLabel.setText("0.00");
            differenceChecked = false;
        }
    }

    @FXML
    private void handleCheckDifference(ActionEvent event) {
        u8goal1 selected = cashHandoverTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "No Row Selected", "Please select a row from the table first.");
            return;
        }

        String input = countedCashField.getText();
        if (input.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Input Missing", "Please enter Counted Cash.");
            return;
        }

        double countedCash = Double.parseDouble(input);
        currentDifference = countedCash - selected.getSystemTotal();
        differenceLabel.setText(String.valueOf(currentDifference));
        differenceChecked = true;

        if (currentDifference != 0) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Cash Mismatch", "Difference: BDT " + currentDifference);
        } else {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Exact Match", "Difference is 0.0! Click Approve Cash Match.");
        }
    }

    @FXML
    private void handleApproveMatch(ActionEvent event) {
        u8goal1 selected = cashHandoverTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "No Row Selected", "Please select a row first.");
            return;
        }
        if (selected.getStatus().equals("Matched")) {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Already Matched", "This shift is already Matched.");
            return;
        }
        if (!differenceChecked) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Check Required", "Click Check Difference first.");
            return;
        }
        if (currentDifference != 0) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Mismatch Error", "Difference must be 0.0 to approve.");
            return;
        }

        selected.setStatus("Matched");
        cashHandoverTable.refresh();
        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Cash Matched", "Shift " + selected.getShiftId() + " matched successfully!");
    }

    @FXML
    private void handleback(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/financeofficerdashboard-view.fxml");
    }
}