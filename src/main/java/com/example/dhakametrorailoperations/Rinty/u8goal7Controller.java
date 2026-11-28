package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//
public class u8goal7Controller {

    @javafx.fxml.FXML
    private ComboBox<String> requestIdCombo;
    @javafx.fxml.FXML
    private TextField stationField;
    @javafx.fxml.FXML
    private TextField categoryField;
    @javafx.fxml.FXML
    private TextField amountField;
    @javafx.fxml.FXML
    private TextField remarksField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button approveBtn;
    @javafx.fxml.FXML
    private Button rejectBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        requestIdCombo.getItems().addAll(
                "EXP-201 (Uttara North - Maintenance)",
                "EXP-202 (Mirpur 10 - Cleaning Supplies)",
                "EXP-203 (Agargaon - Ticket Paper Roll)",
                "EXP-204 (Motijheel - Security Gear)"
        );
    }

    @javafx.fxml.FXML
    public void handleApproveExpense(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRejectExpense(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/financeofficerdashboard-view.fxml");
    }
}