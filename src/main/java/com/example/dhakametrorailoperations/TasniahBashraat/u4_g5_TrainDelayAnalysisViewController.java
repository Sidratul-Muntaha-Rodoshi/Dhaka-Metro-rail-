package com.example.dhakametrorailoperations.TasniahBashraat;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class u4_g5_TrainDelayAnalysisViewController
{
    @javafx.fxml.FXML
    private Label averageTrainDelayDurationLabel;
    @javafx.fxml.FXML
    private TableColumn<u4_g5_TrainDelayAnalysisResult, String> routeCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g5_TrainDelayAnalysisResult,Float> averageDelayCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g5_TrainDelayAnalysisResult, Integer> rankCol;
    @javafx.fxml.FXML
    private TableView<u4_g5_TrainDelayAnalysisResult> trainDelayAnalysisTableView;
    private ArrayList<u4_g5_TrainDelayAnalysisResult> trainDelayAnalysisList;

    @javafx.fxml.FXML
    public void initialize() {
        averageDelayCol.setCellValueFactory(new PropertyValueFactory<>("averageDelay"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("rank"));
        routeCol.setCellValueFactory(new PropertyValueFactory<>("route"));

        trainDelayAnalysisList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardButton()  {

    }

    @javafx.fxml.FXML
    public void handleTrainDelayAnalyzeButton() {
        trainDelayAnalysisList.clear();
        trainDelayAnalysisTableView.getItems().clear();
        trainDelayAnalysisTableView.getItems().addAll(trainDelayAnalysisList);

        averageTrainDelayDurationLabel.setText("0");
    }
}