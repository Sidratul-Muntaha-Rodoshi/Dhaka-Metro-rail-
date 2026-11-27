package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class u5_g1_IssueTicketController
{
    @javafx.fxml.FXML
    private ComboBox<String> destinationComboBox;
    @javafx.fxml.FXML
    private TextField ticketIdTextField;
    @javafx.fxml.FXML
    private TextField fareTextField;
    @javafx.fxml.FXML
    private ComboBox<String>  orginComboBox;
    @javafx.fxml.FXML
    private ComboBox<String>  paymentMethodComboBox;
    @javafx.fxml.FXML
    private Label totalCostLabel;
    @javafx.fxml.FXML
    private TextField passengerCountTextField;
    private ArrayList<IssueTicket> issueTicketList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        orginComboBox.getItems().addAll(
                "Uttara North", "Uttara Center",
                "Mirpur 10", "Farmgate", "Motijheel"
        );

        destinationComboBox.getItems().addAll(
                "Uttara North", "Uttara Center",
                "Mirpur 10", "Farmgate", "Motijheel"
        );

        paymentMethodComboBox.getItems().addAll(
                "Cash", "Card", "Mobile Banking"
        );

        totalCostLabel.setText("Total Cost: 0 Tk");
    }

    @javafx.fxml.FXML
    public void handleIssueTicket() {
        if (ticketIdTextField.getText().isEmpty() ||
                orginComboBox.getValue() == null ||
                destinationComboBox.getValue() == null ||
                paymentMethodComboBox.getValue() == null ||
                passengerCountTextField.getText().isEmpty() ||
                fareTextField.getText().isEmpty()) {

            return;
        }

        String ticketId = ticketIdTextField.getText();
        String origin = orginComboBox.getValue();
        String destination = destinationComboBox.getValue();
        String paymentMethod = paymentMethodComboBox.getValue();

        if (origin.equals(destination)) {
            return;
        }

        int passengerCount = Integer.parseInt(
                passengerCountTextField.getText()
        );

        int fare = Integer.parseInt(
                fareTextField.getText()
        );

        if (passengerCount <= 0 || fare <= 0) {
            return;
        }

        int totalCost = passengerCount * fare;

        IssueTicket ticket = new IssueTicket(
                ticketId,
                origin,
                destination,
                passengerCount,
                fare,
                totalCost,
                paymentMethod
        );

        issueTicketList.add(ticket);

        totalCostLabel.setText("Total Cost: " + totalCost + " Tk");

    }

    @javafx.fxml.FXML
    public void handleBack(ActionEvent event) throws IOException {
        HelperSwitch.SceneSwitch(event, "/com/example/dhakametrorailoperations/Rodoshi/u5_TicketOfficerDashBoard.fxml");
    }
}