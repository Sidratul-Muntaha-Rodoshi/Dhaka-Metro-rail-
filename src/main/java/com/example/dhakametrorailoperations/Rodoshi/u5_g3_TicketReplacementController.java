
package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

import commonClass.SceneSwitcher;

import java.io.IOException;
import java.util.ArrayList;



public class u5_g3_TicketReplacementController {

    @FXML
    private TextField TicketIdTextField;

    @FXML
    private ComboBox<String> replacementReasonComboBox;
    private ArrayList<TicketReplacement> replacementList = new ArrayList<>();


    @FXML
    public void initialize() {

        replacementReasonComboBox.getItems().addAll(
                "Lost",
                "Damaged",
                "Unreadable"
        );
    }


    @FXML
    public void handleSearchTicket() {

        if (TicketIdTextField.getText().isEmpty()) {
            return;
        }

        String ticketId = TicketIdTextField.getText();
    }


    @FXML
    public void handleIssueReplacement() {

        if (TicketIdTextField.getText().isEmpty() ||
                replacementReasonComboBox.getValue() == null) {
            return;
        }

        String ticketId = TicketIdTextField.getText();
        String reason = replacementReasonComboBox.getValue();

        TicketReplacement replacement = new TicketReplacement(
                ticketId, reason
        );

        replacementList.add(replacement);
    }


    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_TicketOfficerDashBoard.fxml");
}
}
