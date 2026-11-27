package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class StationDasboardController {


    //Approve Train Arrival
    @FXML
    public void handleopengoal1(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u7.goal1-view.fxml");
    }
    // Control Platform Screen Doors
    @FXML
    public void handleopengoal2(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u7.goal2-view.fxml");
    }
    // Set Entry & Exit Gate Modes for Ticket Gates
    @FXML
    public void handleopengoal3(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u7.goal3-view.fxml");
    }
    //Control Passenger Flow During Crowded Hours
    @FXML
    public void handleopengoal4(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u7.goal4-view.fxml");
    }
    //Announce Delays & Update
    @FXML
    public void handleopengoal5(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u7.goal5-view.fxml");
    }
    //Unlock All Gates (Emergency)
    @FXML
    public void handleopengoal6(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u7.goal6-view.fxml");
    }
    //Prepare & Submit Cash Report
    @FXML
    public void handleopengoal7(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u7.goal7-view.fxml");
    }
    //Request Money For Station Repair And Expenses
    @FXML
    public void handleopengoal8(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u7.goal8-view.fxml");
    }
    @FXML
    public void handlesignOutButton(ActionEvent event) {
        SceneSwitcher.handleSignOut(event, "/com/example/dhakametrorailoperations/LoginView.fxml");
    }
}