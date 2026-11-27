
package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

import commonClass.SceneSwitcher;

import java.io.IOException;
import java.util.ArrayList;

public class u5_g6_EquipmentFaultController {

    @FXML
    private ComboBox<String> equipmentTypeComboBox;

    @FXML
    private ComboBox<String> faultTypeComboBox;

    @FXML
    private TextField equipmentIdTextField;

    @FXML
    private ComboBox<String> severityComboBox;
    private ArrayList<EquipmentFault> equipmentFaultList = new ArrayList<>();


    @FXML
    public void initialize() {

        equipmentTypeComboBox.getItems().addAll("Ticket Machine", "Ticket Printer", "QR Scanner", "AFC Gate", "Counter Computer");

        faultTypeComboBox.getItems().addAll("Not Working", "Damaged", "Technical Error");

        severityComboBox.getItems().addAll("Low", "Medium", "High");
    }


    @FXML
    public void handleSubmitReport() {

        if (equipmentTypeComboBox.getValue() == null ||
                equipmentIdTextField.getText().isEmpty() ||
                faultTypeComboBox.getValue() == null ||
                severityComboBox.getValue() == null) {
            return;
        }

        String equipmentType = equipmentTypeComboBox.getValue();
        String equipmentId = equipmentIdTextField.getText();
        String faultType = faultTypeComboBox.getValue();
        String severity = severityComboBox.getValue();

        EquipmentFault fault = new EquipmentFault(
                equipmentType, equipmentId, faultType, severity
        );

        equipmentFaultList.add(fault);
    }


    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        HelperSwitch.SceneSwitch(event, "/com/example/dhakametrorailoperations/Rodoshi/u5_TicketOfficerDashBoard.fxml");
    }
}