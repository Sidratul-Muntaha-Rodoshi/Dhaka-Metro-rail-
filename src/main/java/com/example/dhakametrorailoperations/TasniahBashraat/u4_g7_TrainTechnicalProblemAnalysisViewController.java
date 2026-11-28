package com.example.dhakametrorailoperations.TasniahBashraat;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class u4_g7_TrainTechnicalProblemAnalysisViewController
{
    @javafx.fxml.FXML
    private TableView<u4_g7_TrainTechnicalProblemAnalysisResult> trainTechnicalProblemAnalysisTableView;
    @javafx.fxml.FXML
    private Label mostReportedProblemLabel;
    @javafx.fxml.FXML
    private TableColumn<u4_g7_TrainTechnicalProblemAnalysisResult,Integer> rankCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g7_TrainTechnicalProblemAnalysisResult, String > reportedProblemCol;
    @javafx.fxml.FXML
    private Label problemReportCountLabel;
    @javafx.fxml.FXML
    private TableColumn<u4_g7_TrainTechnicalProblemAnalysisResult, Integer> reportCountCol;
    private ArrayList<u4_g7_TrainTechnicalProblemAnalysisResult> trainTechnicalProblemAnalysisList;

    @javafx.fxml.FXML
    public void initialize() {
        reportedProblemCol.setCellValueFactory(new PropertyValueFactory<>("reportedProblem"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("rank"));
        reportCountCol.setCellValueFactory(new PropertyValueFactory<>("reportCount"));

        trainTechnicalProblemAnalysisList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void handleTrainTechnicalProblemAnalyzeButton() {
        trainTechnicalProblemAnalysisList.clear();
        trainTechnicalProblemAnalysisTableView.getItems().clear();
        trainTechnicalProblemAnalysisTableView.getItems().addAll(trainTechnicalProblemAnalysisList);

        mostReportedProblemLabel.setText("Problem");
        problemReportCountLabel.setText("0");
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardButton() {

    }
}