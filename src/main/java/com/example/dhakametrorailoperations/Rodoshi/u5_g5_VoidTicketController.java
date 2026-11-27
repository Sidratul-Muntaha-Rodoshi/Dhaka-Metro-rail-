package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;


public class u5_g5_VoidTicketController
{
    @javafx.fxml.FXML
    private TextField ticketIdTextField;
    @javafx.fxml.FXML
    private Text statusText;
    @javafx.fxml.FXML
    private ComboBox<String> reasonComboBox;
    private ArrayList<VoidTicket> voidTicketList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        reasonComboBox.getItems().addAll(
                "Wrong Station", "Wrong Passenger Count", "Other"
        );

        statusText.setText("");
    }

    @javafx.fxml.FXML
    public void handleBack(ActionEvent event) throws IOException {
        HelperSwitch.SceneSwitch(event, "/com/example/dhakametrorailoperations/Rodoshi/u5_TicketOfficerDashBoard.fxml");
    }

    @javafx.fxml.FXML
    public void handleVoidTicket() {
        if (ticketIdTextField.getText().isEmpty() ||
                reasonComboBox.getValue() == null) {
            return;
        }

        String ticketId = ticketIdTextField.getText();
        String reason = reasonComboBox.getValue();
        String status = "Void";

        VoidTicket ticket = new VoidTicket(
                status, reason, ticketId
        );

        voidTicketList.add(ticket);

        statusText.setText("Void Request Submitted");
    }

    @javafx.fxml.FXML
    public void handleSearchTicket() {
        if (ticketIdTextField.getText().isEmpty()) {
            return;
        }

        String ticketId = ticketIdTextField.getText();

        statusText.setText("Ticket ID: " + ticketId);
    }
    }
