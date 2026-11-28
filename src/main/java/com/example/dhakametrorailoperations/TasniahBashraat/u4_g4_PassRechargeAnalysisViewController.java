package com.example.dhakametrorailoperations.TasniahBashraat;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class u4_g4_PassRechargeAnalysisViewController
{
    @javafx.fxml.FXML
    private TableColumn<u4_g4_PassRechargeAnalysisResult, Float> rechargeAmountCol;
    @javafx.fxml.FXML
    private Label rechargeCountLabel;
    @javafx.fxml.FXML
    private TableColumn<u4_g4_PassRechargeAnalysisResult, Integer> rankCol;
    @javafx.fxml.FXML
    private TableView<u4_g4_PassRechargeAnalysisResult> passRechargeAnalysisTableView;
    @javafx.fxml.FXML
    private TableColumn<u4_g4_PassRechargeAnalysisResult, Integer> rechargeCountCol;
    @javafx.fxml.FXML
    private Label mostCommonRechargeAmountLabel;
    private ArrayList<u4_g4_PassRechargeAnalysisResult> passRechargeAnalysisList;

    @javafx.fxml.FXML
    public void initialize() {
        rechargeAmountCol.setCellValueFactory(new PropertyValueFactory<>("rechargeAmount"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("rank"));
        rechargeCountCol.setCellValueFactory(new PropertyValueFactory<>("rechargeCount"));

        passRechargeAnalysisList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void handlePassRechargeAnalyzeButton() {
        passRechargeAnalysisList.clear();
        passRechargeAnalysisTableView.getItems().clear();
        passRechargeAnalysisTableView.getItems().addAll(passRechargeAnalysisList);

        mostCommonRechargeAmountLabel.setText("0");
        rechargeCountLabel.setText("0");
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardButton() {
    }
}