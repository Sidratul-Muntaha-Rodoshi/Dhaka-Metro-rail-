package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button previewBtn;
    @javafx.fxml.FXML
    private Button sendBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    public void initialize() {
        trainCombo.getItems().addAll("Train-101", "Train-102", "Train-105");
        messageTypeCombo.getItems().addAll("Train Delay Update", "Platform Change", "Maintenance Notice");
    }

    @javafx.fxml.FXML
    public void handlePreviewMessage(ActionEvent actionEvent) {
        String train = trainCombo.getValue();
        String type = messageTypeCombo.getValue();

        if (train == null || type == null) {
            statusLabel.setText("Please select a train and message type first.");
            return;
        }

        if (type.equals("Train Delay Update")) {
            messagePreviewField.setText(train + " is delayed by 10 minutes.");
        } else if (type.equals("Platform Change")) {
            messagePreviewField.setText(train + " will arrive at Platform 2.");
        } else {
            messagePreviewField.setText("Station maintenance work is ongoing.");
        }

        statusLabel.setText("Message ready. Click Send Update.");
    }

    @javafx.fxml.FXML
    public void handleSendAnnouncement(ActionEvent actionEvent) {
        String message = messagePreviewField.getText();

        if (message.isEmpty()) {
            statusLabel.setText("Please create a message first.");
            return;
        }

        statusLabel.setText("Announcement sent to all platforms!");
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }

}