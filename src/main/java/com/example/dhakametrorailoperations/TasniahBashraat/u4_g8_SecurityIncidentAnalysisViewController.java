package com.example.dhakametrorailoperations.TasniahBashraat;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class u4_g8_SecurityIncidentAnalysisViewController
{
    @javafx.fxml.FXML
    private Label mostCommonSecurityIncidentLabel;
    @javafx.fxml.FXML
    private Label incidentCountLabel;
    @javafx.fxml.FXML
    private TableView<u4_g8_SecurityIncidentAnalysisResult> securityIncidentAnalysisTableView;
    @javafx.fxml.FXML
    private TableColumn<u4_g8_SecurityIncidentAnalysisResult, Integer> rankCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g8_SecurityIncidentAnalysisResult, String> securityIncidentTypeCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g8_SecurityIncidentAnalysisResult, Integer> incidentCountCol;
    private ArrayList<u4_g8_SecurityIncidentAnalysisResult> securityIncidentAnalysisList;



    @javafx.fxml.FXML
    public void initialize() {
        securityIncidentTypeCol.setCellValueFactory(new PropertyValueFactory<>("securityIncidentType"));
        incidentCountCol.setCellValueFactory(new PropertyValueFactory<>("incidentCount"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("rank"));

        securityIncidentAnalysisList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardButton() {
    }

    @javafx.fxml.FXML
    public void handleSecurityIncidentAnalyzeButton() {
        securityIncidentAnalysisList.clear();
        securityIncidentAnalysisTableView.getItems().clear();
        securityIncidentAnalysisTableView.getItems().addAll(securityIncidentAnalysisList);

        mostCommonSecurityIncidentLabel.setText("Incident Type");
        incidentCountLabel.setText("0");
    }
}