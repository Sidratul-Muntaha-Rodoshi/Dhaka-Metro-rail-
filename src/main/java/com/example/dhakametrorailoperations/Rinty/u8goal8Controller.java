package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class u8goal8Controller {

    @javafx.fxml.FXML
    private ComboBox<String> monthCombo;
    @javafx.fxml.FXML
    private ComboBox<String> stationCombo;
    @javafx.fxml.FXML
    private TextField totalRevenueField;
    @javafx.fxml.FXML
    private TextField totalExpenseField;
    @javafx.fxml.FXML
    private TextField netBalanceField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button viewOverviewBtn;
    @javafx.fxml.FXML
    private Button clearBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        monthCombo.getItems().addAll(
                "August 2026",
                "September 2026",
                "October 2026",
                "November 2026"
        );

        stationCombo.getItems().addAll(
                "All Stations",
                "Uttara North",
                "Mirpur 10",
                "Agargaon",
                "Farmgate",
                "Motijheel"
        );
    }

    @javafx.fxml.FXML
    public void handleViewOverview(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/financeofficerdashboard-view.fxml");
    }
}