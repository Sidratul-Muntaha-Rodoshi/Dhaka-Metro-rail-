package com.example.dhakametrorailoperations.TasniahBashraat;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


import java.util.ArrayList;

public class u4_g1_MetroRouteAnalysisViewController
{
    @javafx.fxml.FXML
    private Label mostSelectedRouteLabel;
    @javafx.fxml.FXML
    private TableColumn<u4_g1_MetroRouteAnalysisResult, String> routeCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g1_MetroRouteAnalysisResult, Integer> rankCol;
    @javafx.fxml.FXML
    private Label selectionCountLabel;
    @javafx.fxml.FXML
    private TableColumn<u4_g1_MetroRouteAnalysisResult, Integer> selectionCountCol;
    @javafx.fxml.FXML
    private TableView<u4_g1_MetroRouteAnalysisResult> metroRouteAnalysisTableView;
    private ArrayList<u4_g1_MetroRouteAnalysisResult> metroRouteAnalysisList;

    @javafx.fxml.FXML
    public void initialize() {
        routeCol.setCellValueFactory(new PropertyValueFactory<>("route"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("rank"));
        selectionCountCol.setCellValueFactory(new PropertyValueFactory<>("selectionCount"));

        metroRouteAnalysisList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardButton()  {

    }

    @javafx.fxml.FXML
    public void handleMetroRoutesAnalyzeButton() {
        metroRouteAnalysisList.clear();
        metroRouteAnalysisTableView.getItems().clear();
        metroRouteAnalysisTableView.getItems().addAll(metroRouteAnalysisList);

        mostSelectedRouteLabel.setText("Route");
        selectionCountLabel.setText("Selections");
    }
}