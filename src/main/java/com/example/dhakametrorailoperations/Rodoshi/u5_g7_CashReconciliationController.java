
package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class u5_g7_CashReconciliationController {

    @FXML
    private TextField extraFareTextField;

    @FXML
    private TextField countedCashTextField;

    @FXML
    private TextField openingCashTextField;

    @FXML
    private TextField ticketSalesTextField;

    @FXML
    private TextField reasonTextField;

    @FXML
    private Label statusLabel;

    private int difference;
    private int expectedCash;

    private ArrayList<CashReconciliation> cashReconciliationList = new ArrayList<>();


    @FXML
    public void initialize() {

        statusLabel.setText("Cash Status: Not Checked");
    }


    @FXML
    public void handleCheckCash() {

        if (openingCashTextField.getText().isEmpty() ||
                ticketSalesTextField.getText().isEmpty() ||
                extraFareTextField.getText().isEmpty() ||
                countedCashTextField.getText().isEmpty()) {
            return;
        }

        int openingCash = Integer.parseInt(openingCashTextField.getText());
        int ticketSales = Integer.parseInt(ticketSalesTextField.getText());
        int extraFare = Integer.parseInt(extraFareTextField.getText());
        int countedCash = Integer.parseInt(countedCashTextField.getText());

        expectedCash = openingCash + ticketSales + extraFare;

        difference = countedCash - expectedCash;

        statusLabel.setText(
                "Expected Cash: " + expectedCash +
                        " Tk | Difference: " + difference + " Tk"
        );
    }


    @FXML
    public void handleSaveCashCheck() {

        if (openingCashTextField.getText().isEmpty() ||
                ticketSalesTextField.getText().isEmpty() ||
                extraFareTextField.getText().isEmpty() ||
                countedCashTextField.getText().isEmpty()) {
            return;
        }

        String reason = reasonTextField.getText();

        if (difference != 0 && reason.isEmpty()) {
            return;
        }

        int openingCash = Integer.parseInt(openingCashTextField.getText());
        int ticketSales = Integer.parseInt(ticketSalesTextField.getText());
        int extraFare = Integer.parseInt(extraFareTextField.getText());
        int countedCash = Integer.parseInt(countedCashTextField.getText());

        expectedCash = openingCash + ticketSales + extraFare;
        difference = countedCash - expectedCash;

        CashReconciliation cash = new CashReconciliation(
                openingCash,
                ticketSales,
                extraFare,
                countedCash,
                expectedCash,
                difference,
                reason
        );

        cashReconciliationList.add(cash);

        statusLabel.setText("Cash Reconciliation Saved");
    }


    @FXML
    public void handleBack(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_TicketOfficerDashBoard.fxml");
    }
}

