package com.example.dhakametrorailoperations.Rinty;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class u7goal7Controller {

    @javafx.fxml.FXML
    private ComboBox<String> equipmentCombo;
    @javafx.fxml.FXML
    private ComboBox<String> priorityCombo;
    @javafx.fxml.FXML
    private TextField detailsField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button checkBtn;
    @javafx.fxml.FXML
    private Button submitBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    public void initialize() {
        equipmentCombo.getItems().addAll("North Escalator", "Ticket Machine 2", "Platform 1 Screen Door", "Station CCTV");
        priorityCombo.getItems().addAll("Low", "Medium", "High - Urgent");
    }

    @javafx.fxml.FXML
    public void handleCheckStatus(ActionEvent actionEvent) {
        String item = equipmentCombo.getValue();

        if (item == null) {
            statusLabel.setText("Please select an equipment first.");
            return;
        }

        if (item.equals("Platform 1 Screen Door")) {
            statusLabel.setText("Alert: High safety risk! Set priority to High - Urgent.");
        } else {
            statusLabel.setText(item + " is ready to report.");
        }
    }

    @javafx.fxml.FXML
    public void handleSubmitReport(ActionEvent actionEvent) {
        String item = equipmentCombo.getValue();
        String priority = priorityCombo.getValue();
        String details = detailsField.getText();

        if (item == null || priority == null) {
            statusLabel.setText("Please select equipment and problem level.");
            return;
        }
        if (details.isEmpty()) {
            statusLabel.setText("Please write short problem details.");
            return;
        }

        statusLabel.setText("Report sent to Maintenance Team (" + item + " - " + priority + ").");
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) {
    }
}
