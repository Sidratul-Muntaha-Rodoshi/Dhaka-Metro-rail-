package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class FinanceOfficerDashboardController {

    @FXML
    private void handleopengoal1(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u8.goal1-view.fxml");
    }

    @FXML
    private void handleopengoal2(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u8.goal2-view.fxml");
    }

    @FXML
    private void handleopengoal3(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u8.goal3-view.fxml");
    }

    @FXML
    private void handleopengoal4(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u8.goal4-view.fxml");
    }

    @FXML
    private void handleopengoal5(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u8.goal5-view.fxml");
    }

    @FXML
    private void handleopengoal6(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u8.goal6-view.fxml");
    }

    @FXML
    private void handleopengoal7(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u8.goal7-view.fxml");
    }

    @FXML
    private void handleopengoal8(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/Rintyfxml/u8.goal8-view.fxml");
    }

    @FXML
    private void handlesignOutButton(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/example/dhakametrorailoperations/LoginView.fxml");
    }
}