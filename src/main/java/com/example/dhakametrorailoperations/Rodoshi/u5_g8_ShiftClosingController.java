package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;

public class u5_g8_ShiftClosingController {

    @FXML
    private TextField financeOfficerIdTextField;

    @FXML
    private Text statusText;

    @FXML
    private TextField finalCashTextField;

    @FXML
    private TextField reasonTextField;

    private ArrayList<ShiftClosing> shiftClosingList = new ArrayList<>();


    @FXML
    public void initialize() {

        statusText.setText("Handover Status: Not Submitted");
    }


    @FXML
    public void handleCalculateHandover() {

        if (finalCashTextField.getText().isEmpty()) {
            return;
        }

        int finalCash = Integer.parseInt(
                finalCashTextField.getText()
        );

        if (finalCash < 0) {
            return;
        }

        statusText.setText("Handover Amount: " + finalCash + " Tk");
    }


    @FXML
    public void handleSubmitHandover() {

        if (financeOfficerIdTextField.getText().isEmpty() ||
                finalCashTextField.getText().isEmpty() ||
                reasonTextField.getText().isEmpty()) {
            return;
        }

        String financeOfficerId = financeOfficerIdTextField.getText();

        int finalCash = Integer.parseInt(
                finalCashTextField.getText()
        );

        String reason = reasonTextField.getText();

        if (finalCash < 0) {
            return;
        }

        ShiftClosing closing = new ShiftClosing(
                financeOfficerId, finalCash, reason
        );

        shiftClosingList.add(closing);

        statusText.setText("Handover Status: Submitted");
    }


    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_TicketOfficerDashBoard.fxml");


    }
}