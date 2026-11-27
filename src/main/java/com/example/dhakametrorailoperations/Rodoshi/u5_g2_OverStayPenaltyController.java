package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

import commonClass.SceneSwitcher;

import java.io.IOException;
import java.util.ArrayList;

public class u5_g2_OverStayPenaltyController {

    @FXML
    private TextField ticketIdTextField;

    @FXML
    private Label penaltyAmountLabel;

    @FXML
    private TextField overStayTextField;

    @FXML
    private ComboBox<String> paymentMethodComboBox;
    private ArrayList<overStayPenalty> overStayPenaltyList = new ArrayList<>();


    @FXML
    public void initialize() {

        paymentMethodComboBox.getItems().addAll(
                "Cash",
                "Card",
                "Mobile Banking"
        );

        penaltyAmountLabel.setText("Penalty Amount: 0 Tk");
    }


    @FXML
    public void handleOverStayPenalty() {

        if (ticketIdTextField.getText().isEmpty() ||
                overStayTextField.getText().isEmpty() ||
                paymentMethodComboBox.getValue() == null) {
            return;
        }

        String ticketId = ticketIdTextField.getText();
        String paymentMethod = paymentMethodComboBox.getValue();

        int overStay = Integer.parseInt(overStayTextField.getText());

        if (overStay <= 0) {
            return;
        }

        int penaltyAmount = overStay * 5;

        overStayPenalty penalty = new overStayPenalty(
                ticketId, overStay, penaltyAmount, paymentMethod
        );

        overStayPenaltyList.add(penalty);

        penaltyAmountLabel.setText("Penalty Amount: " + penaltyAmount + " Tk");
    }


    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_TicketOfficerDashBoard.fxml");
}
}


