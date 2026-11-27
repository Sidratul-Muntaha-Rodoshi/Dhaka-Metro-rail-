
package com.example.dhakametrorailoperations.Rodoshi;

import commonClass.User;
import commonClass.SessionManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class u5_TicketOfficerDashBoardController {

    @FXML
    private Label welcomeLabel;

    @FXML
    public void initialize() {

        User user = SessionManager.getCurrentUser();

        if (user != null) {
            welcomeLabel.setText("Welcome, " + user.getUserId());
        }
    }

    @FXML
    public void handleIssueTicket(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_g1_IssueTicket.fxml");
    }

    @FXML
    public void handleOverStayPenalty(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_g2_OverstayPenalty.fxml");
    }

    @FXML
    public void handleTicketReplacement(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_g3_TicketReplacement.fxml");
    }

    @FXML
    public void handleExtraFare(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_g4_ExtraFare.fxml");
    }

    @FXML
    public void handleVoidTicket(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_g5_VoidTicket.fxml");
    }

    @FXML
    public void handleEquipmentFault(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_g6_EquipmentFault.fxml");
    }

    @FXML
    public void handleCashReconciliation(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_g7_CashReconciliation.fxml");
    }

    @FXML
    public void handleShiftClosing(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u5_g8_ShiftClosing.fxml");
    }

    @FXML
    public void handleLogOut(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/LoginView.fxml");
    }
}
