package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.io.IOException;

public class u7goal5Controller {

    @javafx.fxml.FXML
    private ComboBox<String> trainCombo;
    @javafx.fxml.FXML
    private ComboBox<String> messageTypeCombo;
    @javafx.fxml.FXML
    private TextField messagePreviewField;

    @javafx.fxml.FXML
    private Button previewBtn;
    @javafx.fxml.FXML
    private Button sendBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    @javafx.fxml.FXML
    public void initialize() {
        trainCombo.getItems().addAll(
                "Train-101 (Uttara North)",
                "Train-102 (Motijheel)",
                "Train-103 (Agargaon)",
                "Train-104 (Farmgate)"
        );

        messageTypeCombo.getItems().addAll(
                "5-Minute Delay",
                "10-Minute Delay",
                "Platform Change Notice",
                "Service Resumed"
        );
    }

    @javafx.fxml.FXML
    public void handlePreviewMessage(ActionEvent actionEvent) {
        String train = trainCombo.getValue();
        String type = messageTypeCombo.getValue();

        if (train == null || type == null) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Selection Missing", "Please select both a train and a message type first.");
            return;
        }

        if (type.equals("5-Minute Delay")) {
            messagePreviewField.setText("Attention: " + train + " is delayed by 5 minutes.");
        } else if (type.equals("10-Minute Delay")) {
            messagePreviewField.setText("Attention: " + train + " is delayed by 10 minutes due to technical checks.");
        } else if (type.equals("Platform Change Notice")) {
            messagePreviewField.setText("Important: " + train + " will now arrive at Platform 2.");
        } else {
            messagePreviewField.setText("Update: Normal schedule for " + train + " has resumed.");
        }
    }

    @javafx.fxml.FXML
    public void handleSendAnnouncement(ActionEvent actionEvent) {
        String train = trainCombo.getValue();
        String type = messageTypeCombo.getValue();
        String preview = messagePreviewField.getText();

        if (train == null || type == null || preview.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, "Message Not Ready", "Please click 'Create Message' first before sending.");
            return;
        }

        u7goal5 record = new u7goal5(train, type, preview);
        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Announcement Sent", "Update broadcasted for " + train + "!");
        messagePreviewField.clear();
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}