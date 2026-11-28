package com.example.dhakametrorailoperations.Rinty;

import commonClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.ArrayList;
//

public class u7goal1Controller {

    @javafx.fxml.FXML
    private TextField trainIdField;
    @javafx.fxml.FXML
    private ComboBox<String> routeCombo;
    @javafx.fxml.FXML
    private TextField timeField;

    @javafx.fxml.FXML
    private TableView<u7goal1> trainTable;
    @javafx.fxml.FXML
    private TableColumn<u7goal1, String> trainIdCol;
    @javafx.fxml.FXML
    private TableColumn<u7goal1, String> routeCol;
    @javafx.fxml.FXML
    private TableColumn<u7goal1, String> timeCol;
    @javafx.fxml.FXML
    private TableColumn<u7goal1, String> statusCol;

    @javafx.fxml.FXML
    private ComboBox<String> platformCombo;
    @javafx.fxml.FXML
    private PasswordField pinField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button addTrainBtn;
    @javafx.fxml.FXML
    private Button checkTrackBtn;
    @javafx.fxml.FXML
    private Button approveBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    private ArrayList<u7goal1> trainList = new ArrayList<>();
    private boolean isTrackClear = false;

    public void initialize() {
        routeCombo.getItems().addAll("Uttara - Motijheel", "Motijheel - Uttara", "Agargaon - Motijheel");
        platformCombo.getItems().addAll("Platform 1", "Platform 2", "Platform 3 (Maintenance)");

        trainIdCol.setCellValueFactory(new PropertyValueFactory<>("trainId"));
        routeCol.setCellValueFactory(new PropertyValueFactory<>("route"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void handleAddTrain(ActionEvent actionEvent) {
        String id = trainIdField.getText().trim();
        String route = routeCombo.getValue();
        String time = timeField.getText().trim();

        if (id.isEmpty() || route == null || time.isEmpty()) {
            statusLabel.setText("Please enter Train ID, Route, and Time.");
            return;
        }

        trainList.add(new u7goal1(id, route, time, "Waiting"));
        trainTable.getItems().clear();
        trainTable.getItems().addAll(trainList);

        trainIdField.clear();
        timeField.clear();
        statusLabel.setText("Train " + id + " added to waiting list.");
    }

    @javafx.fxml.FXML
    public void handleCheckTrack(ActionEvent actionEvent) {
        u7goal1 selectedTrain = trainTable.getSelectionModel().getSelectedItem();
        String platform = platformCombo.getValue();

        if (selectedTrain == null || platform == null) {
            statusLabel.setText("Please select a train from the table and a platform.");
            return;
        }

        if (platform.contains("Maintenance")) {
            isTrackClear = false;
            statusLabel.setText("Warning: Platform 3 track is blocked! Choose another platform.");
        } else {
            isTrackClear = true;
            statusLabel.setText("Track Clear & Signal Green for " + selectedTrain.getTrainId() + " at " + platform + ".");
        }
    }

    @javafx.fxml.FXML
    public void handleApproveTrain(ActionEvent actionEvent) {
        u7goal1 selectedTrain = trainTable.getSelectionModel().getSelectedItem();
        String platform = platformCombo.getValue();
        String pin = pinField.getText();

        if (selectedTrain == null || platform == null) {
            statusLabel.setText("Select a train and platform first.");
            return;
        }
        if (!isTrackClear) {
            statusLabel.setText("Please run Check Track Safety on a clear platform first.");
            return;
        }
        if (!pin.equals("1234")) {
            statusLabel.setText("Wrong Controller PIN! Try 1234.");
            return;
        }

        selectedTrain.setStatus("Approved (" + platform + ")");
        trainTable.getItems().clear();
        trainTable.getItems().addAll(trainList);

        isTrackClear = false;
        statusLabel.setText("Clearance issued for " + selectedTrain.getTrainId() + "!");
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/dhakametrorailoperations/Rintyfxml/stationcontrollerdashboard-view.fxml");
    }
}