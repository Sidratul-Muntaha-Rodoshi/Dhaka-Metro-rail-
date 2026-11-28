package com.example.dhakametrorailoperations.TasniahBashraat;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;

import java.util.ArrayList;

public class u4_g2_BusiestTravelDateAnalysisViewController
{
    @javafx.fxml.FXML
    private TableView<u4_g2_BusiestTravelDateAnalysisResult> busiestTravelDateTableView;
    @javafx.fxml.FXML
    private Label busiestTravelDateLabel;
    @javafx.fxml.FXML
    private TableColumn<u4_g2_BusiestTravelDateAnalysisResult, LocalDate> busiestTravelDateCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g2_BusiestTravelDateAnalysisResult, Integer> passengerEntriesCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g2_BusiestTravelDateAnalysisResult, Integer> rankCol;
    @javafx.fxml.FXML
    private Label passengerEntriesLabel;
    private ArrayList<u4_g2_BusiestTravelDateAnalysisResult> busiestTravelDateList;

    @javafx.fxml.FXML
    public void initialize() {
        busiestTravelDateCol.setCellValueFactory(new PropertyValueFactory<>("busiestTravelDate"));
        passengerEntriesCol.setCellValueFactory(new PropertyValueFactory<>("passengerEntries"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("rank"));

        busiestTravelDateList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void handleBusiestTravelDateAnalyzeButton() {
        busiestTravelDateList.clear();
        busiestTravelDateTableView.getItems().clear();
        busiestTravelDateTableView.getItems().addAll(busiestTravelDateList);

        busiestTravelDateLabel.setText("Date");
        passengerEntriesLabel.setText("0");
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardButton() {
    }
}