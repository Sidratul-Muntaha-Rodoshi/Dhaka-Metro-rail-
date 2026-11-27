package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.io.IOException;

public class u7goal4Controller {

    @javafx.fxml.FXML
    private ComboBox<String> areaCombo;
    @javafx.fxml.FXML
    private ComboBox<String> levelCombo;
    @javafx.fxml.FXML
    private TextField crowdStatusField;

    @javafx.fxml.FXML
    private Button checkBtn;
    @javafx.fxml.FXML
    private Button applyBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        areaCombo.getItems().addAll(
                "North Gate & Escalator",
                "South Gate & Escalator",
                "Main Ticket Hall"
        );

        levelCombo.getItems().addAll(
                "Level 1: Normal Flow",
                "Level 2: Slow Down Entry",
                "Level 3: Hold Crowd at Gate"
        );
    }

    @javafx.fxml.FXML
    public void handleCheckCrowd(ActionEvent actionEvent) {
        String area = areaCombo.getValue();

        if (area == null) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Selection Missing", "Please select a station area first.");
            return;
        }

        if (area.equals("North Gate & Escalator")) {
            crowdStatusField.setText("Very Crowded (96% Full)");
            AlertHelper.showAlert(Alert.AlertType.WARNING, "High Crowd Alert", "High crowd detected! Select Level 3 to hold crowd.");
        } else if (area.equals("South Gate & Escalator")) {
            crowdStatusField.setText("Busy (75% Full)");
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Crowd Status", "Moderate crowd. Ready to apply control.");
        } else {
            crowdStatusField.setText("Normal (45% Full)");
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Crowd Status", "Crowd flow is normal.");
        }
    }

    @javafx.fxml.FXML
    public void handleApplyControl(ActionEvent actionEvent) {
        String area = areaCombo.getValue();
        String level = levelCombo.getValue();
        String crowd = crowdStatusField.getText();

        if (area == null || level == null) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Selection Missing", "Please select both area and control level.");
            return;
        }

        if (crowd.contains("Very Crowded") && !level.startsWith("Level 3")) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Invalid Level", "Area is very crowded! Choose Level 3: Hold Crowd at Gate.");
        } else {
            crowdStatusField.setText("Controlled (" + level + ")");
            u7goal4 record = new u7goal4(area, level, crowdStatusField.getText());
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Success", level + " applied to " + area + ".");
        }
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}