package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class u5_g4_ExtraFareController {

    @FXML
    private TextField ticketIdTextField;

    @FXML
    private TextField paymentAmountTextField;

    @FXML
    private ComboBox<String> originalDestinationComboBox;

    @FXML
    private Label extraFareLabel;

    private ArrayList<ExtraFare> extraFareList = new ArrayList<>();

    private int extraFare = 0;


    @FXML
    public void initialize() {

        originalDestinationComboBox.getItems().addAll(
                "Uttara North - 50 Tk",
                "Uttara Center - 40 Tk",
                "Mirpur 10 - 30 Tk",
                "Farmgate - 20 Tk",
                "Motijheel - 10 Tk"
        );

        extraFareLabel.setText("Extra Fare: 0 Tk");
    }


    @FXML
    public void handleExtraFare() {

        if (ticketIdTextField.getText().isEmpty() ||
                originalDestinationComboBox.getValue() == null) {
            return;
        }

        String ticketId = ticketIdTextField.getText();
        String destination = originalDestinationComboBox.getValue();

        if (destination.equals("Uttara North - 50 Tk")) {
            extraFare = 50;
        }
        else if (destination.equals("Uttara Center - 40 Tk")) {
            extraFare = 40;
        }
        else if (destination.equals("Mirpur 10 - 30 Tk")) {
            extraFare = 30;
        }
        else if (destination.equals("Farmgate - 20 Tk")) {
            extraFare = 20;
        }
        else if (destination.equals("Motijheel - 10 Tk")) {
            extraFare = 10;
        }

        extraFareLabel.setText("Extra Fare: " + extraFare + " Tk");
    }


    @FXML
    public void handleConfirmPayment() {

        if (ticketIdTextField.getText().isEmpty() ||
                originalDestinationComboBox.getValue() == null ||
                paymentAmountTextField.getText().isEmpty()) {
            return;
        }

        String ticketId = ticketIdTextField.getText();
        String destination = originalDestinationComboBox.getValue();

        int paymentAmount = Integer.parseInt(
                paymentAmountTextField.getText()
        );

        if (paymentAmount != extraFare) {
            return;
        }

        ExtraFare extraFareObject = new ExtraFare(
                ticketId,
                destination,
                extraFare,
                paymentAmount
        );

        extraFareList.add(extraFareObject);

        extraFareLabel.setText(
                "Payment Successful: " + paymentAmount + " Tk"
        );
    }


    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        HelperSwitch.SceneSwitch(event, "/com/example/dhakametrorailoperations/Rodoshi/u5_TicketOfficerDashBoard.fxml");
    }
}