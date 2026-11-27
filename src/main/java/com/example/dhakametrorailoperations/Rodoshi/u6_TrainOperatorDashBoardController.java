package com.example.dhakametrorailoperations.Rodoshi;

import commonClass.User;
import commonClass.SessionManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class u6_TrainOperatorDashBoardController {

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
    public void handleSafetyCheck(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_g1_SafetyCheck.fxml");
    }

    @FXML
    public void handleStartTrip(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_g2_StartTrip.fxml");
    }

    @FXML
    public void handleStationTiming(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_g3_StationTiming.fxml");
    }

    @FXML
    public void handleReportTrainFault(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_g4_TrainFault.fxml");
    }

    @FXML
    public void handleReportEmergency(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_g5_ReportEmergency.fxml");
    }

    @FXML
    public void handlePsdProblem(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_g6_PSDProblem.fxml");
    }

    @FXML
    public void handleTrainControlIssue(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_g7_TrainControlIssue.fxml");
    }

    @FXML
    public void handleTripReport(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/Rodoshi/u6_g8_TripReport.fxml");
    }

    @FXML
    public void handleLogOut(ActionEvent event) throws IOException {

        HelperSwitch.SceneSwitch(event,
                "/com/example/dhakametrorailoperations/LoginView.fxml");
    }
}