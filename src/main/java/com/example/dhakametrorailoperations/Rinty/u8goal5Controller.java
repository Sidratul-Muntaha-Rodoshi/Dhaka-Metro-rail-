package com.example.dhakametrorailoperations.Rinty;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class u8goal5Controller {

    @javafx.fxml.FXML
    private ComboBox<String> shiftIdCombo;
    @javafx.fxml.FXML
    private TextField cashierStationField;
    @javafx.fxml.FXML
    private TextField expectedCashField;
    @javafx.fxml.FXML
    private TextField submittedCashField;
    @javafx.fxml.FXML
    private ComboBox<String> reasonCombo;
    @javafx.fxml.FXML
    private TextField noteField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button reviewBtn;
    @javafx.fxml.FXML
    private Button resolveBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        shiftIdCombo.getItems().addAll(
                "SH-102 (Mirpur 10 - Short 500)",
                "SH-105 (Farmgate - Short 200)",
                "SH-108 (Uttara North - Excess 100)",
                "SH-101 (Motijheel - Short 150)"
        );

        reasonCombo.getItems().addAll(
                "Counting Error",
                "Counterfeit Note",
                "System Glitch",
                "Shortage Deducted"
        );
    }

    @javafx.fxml.FXML
    public void handleReviewDetails(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleResolveDifference(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) {
    }
}