package com.example.dhakametrorailoperations.Rinty;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class u7goal3Controller {

    @javafx.fxml.FXML
    private ComboBox<String> gateIdCombo;
    @javafx.fxml.FXML
    private TextField currentModeField;
    @javafx.fxml.FXML
    private TextField gateStateField;
    @javafx.fxml.FXML
    private ComboBox<String> modeCombo;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button applyBtn;
    @javafx.fxml.FXML
    private Button applyAllBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        gateIdCombo.getItems().addAll(
                "Gate-01",
                "Gate-02",
                "Gate-03",
                "Gate-04",
                "Gate-05"
        );

        modeCombo.getItems().addAll(
                "Entry",
                "Exit",
                "Bidirectional",
                "Closed"
        );
    }

    @javafx.fxml.FXML
    public void handleApply(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApplyAll(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) {
    }
}