package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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
    private Label statusLabel;

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
            statusLabel.setText("Please select a station area first.");
            return;
        }

        if (area.equals("North Gate & Escalator")) {
            crowdStatusField.setText("Very Crowded (96% Full)");
            statusLabel.setText("Alert: High crowd! Select Level 3 to hold crowd.");
        } else if (area.equals("South Gate & Escalator")) {
            crowdStatusField.setText("Busy (75% Full)");
            statusLabel.setText("Moderate crowd. Ready to apply control.");
        } else {
            crowdStatusField.setText("Normal (45% Full)");
            statusLabel.setText("Crowd is normal.");
        }
    }

    @javafx.fxml.FXML
    public void handleApplyControl(ActionEvent actionEvent) {
        String area = areaCombo.getValue();
        String level = levelCombo.getValue();
        String crowd = crowdStatusField.getText();

        if (area == null || level == null) {
            statusLabel.setText("Please select both area and control level.");
            return;
        }

        if (crowd.contains("Very Crowded") && !level.startsWith("Level 3")) {
            statusLabel.setText("Area is very crowded! Choose Level 3: Hold Crowd at Gate.");
        } else {
            crowdStatusField.setText("Controlled (" + level + ")");
            statusLabel.setText(level + " applied to " + area + ".");
        }
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}