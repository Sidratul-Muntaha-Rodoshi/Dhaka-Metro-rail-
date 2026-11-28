package com.example.dhakametrorailoperations.TasniahBashraat;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class u4_g6_PassReplacementAnalysisViewController
{
    @javafx.fxml.FXML
    private Label mostCommonReplacementReasonLabel;
    @javafx.fxml.FXML
    private Label replacementCountLabel;
    @javafx.fxml.FXML
    private TableColumn<u4_g6_PassReplacementAnalysisResult, String> passReplacementReasonsCol;
    @javafx.fxml.FXML
    private TableView<u4_g6_PassReplacementAnalysisResult> passReplacementAnalysisTableView;
    @javafx.fxml.FXML
    private TableColumn<u4_g6_PassReplacementAnalysisResult, Integer> rankCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g6_PassReplacementAnalysisResult, Integer> replacementCountCol;
    private ArrayList<u4_g6_PassReplacementAnalysisResult> passReplacementAnalysisList;

    @javafx.fxml.FXML
    public void initialize() {
        passReplacementReasonsCol.setCellValueFactory(new PropertyValueFactory<>("replacementReason"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("rank"));
        replacementCountCol.setCellValueFactory(new PropertyValueFactory<>("replacementCount"));

        passReplacementAnalysisList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void handlePassReplacementAnalyzeButton() {
        passReplacementAnalysisList.clear();
        passReplacementAnalysisTableView.getItems().clear();
        passReplacementAnalysisTableView.getItems().addAll(passReplacementAnalysisList);

        mostCommonReplacementReasonLabel.setText("Reason");
        replacementCountLabel.setText("0");
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardButton() {
    }
}