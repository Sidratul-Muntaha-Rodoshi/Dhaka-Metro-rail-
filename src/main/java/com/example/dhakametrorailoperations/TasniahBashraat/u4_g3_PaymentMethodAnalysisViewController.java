package com.example.dhakametrorailoperations.TasniahBashraat;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class u4_g3_PaymentMethodAnalysisViewController
{
    @javafx.fxml.FXML
    private Label mostCommonPaymentMethodLabel;
    @javafx.fxml.FXML
    private TableView<u4_g3_PaymentMethodAnalysisResult> paymentMethodAnalysisTableView;
    @javafx.fxml.FXML
    private TableColumn<u4_g3_PaymentMethodAnalysisResult, Integer> rankCol;
    @javafx.fxml.FXML
    private TableColumn<u4_g3_PaymentMethodAnalysisResult, Integer> transactionCountCol;
    @javafx.fxml.FXML
    private Label transactionCountLabel;
    @javafx.fxml.FXML
    private TableColumn<u4_g3_PaymentMethodAnalysisResult, String> paymentMethodCol;
    private ArrayList<u4_g3_PaymentMethodAnalysisResult> paymentMethodAnalysisList;

    @javafx.fxml.FXML
    public void initialize() {
        paymentMethodCol.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("rank"));
        transactionCountCol.setCellValueFactory(new PropertyValueFactory<>("transactionCount"));

        paymentMethodAnalysisList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void handlePaymentMethodAnalyzeButton() {
        paymentMethodAnalysisList.clear();
        paymentMethodAnalysisTableView.getItems().clear();
        paymentMethodAnalysisTableView.getItems().addAll(paymentMethodAnalysisList);

        mostCommonPaymentMethodLabel.setText("Payment Method");
        transactionCountLabel.setText("0");
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardButton() {

    }
}