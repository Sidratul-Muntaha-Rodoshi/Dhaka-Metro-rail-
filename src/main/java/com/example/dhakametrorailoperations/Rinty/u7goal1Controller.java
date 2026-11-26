package com.example.dhakametrorailoperations.Rinty;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class u7goal1Controller {

    @javafx.fxml.FXML
    private TableView<TrainRow> trainTable;
    @javafx.fxml.FXML
    private TableColumn<TrainRow, String> trainIdCol;
    @javafx.fxml.FXML
    private TableColumn<TrainRow, String> routeCol;
    @javafx.fxml.FXML
    private TableColumn<TrainRow, String> timeCol;
    @javafx.fxml.FXML
    private TableColumn<TrainRow, String> statusCol;

    @javafx.fxml.FXML
    private ComboBox<String> platformCombo;
    @javafx.fxml.FXML
    private PasswordField pinField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Button checkTrackBtn;
    @javafx.fxml.FXML
    private Button approveBtn;
    @javafx.fxml.FXML
    private Button Backbutton;

    private final ObservableList<TrainRow> trainList = FXCollections.observableArrayList();
    private boolean isTrackClear = false;

    public void initialize() {
        platformCombo.getItems().addAll("Platform 1", "Platform 2", "Platform 3 (Maintenance)");

        trainIdCol.setCellValueFactory(new PropertyValueFactory<>("trainId"));
        routeCol.setCellValueFactory(new PropertyValueFactory<>("route"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        trainList.addAll(
                new TrainRow("Train-101", "Uttara - Motijheel", "09:10 AM", "Waiting"),
                new TrainRow("Train-102", "Motijheel - Uttara", "09:20 AM", "Waiting"),
                new TrainRow("Train-103", "Agargaon - Motijheel", "09:30 AM", "Waiting")
        );
        trainTable.setItems(trainList);
    }

    @javafx.fxml.FXML
    public void handleCheckTrack(ActionEvent actionEvent) {
        TrainRow selectedTrain = trainTable.getSelectionModel().getSelectedItem();
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
        TrainRow selectedTrain = trainTable.getSelectionModel().getSelectedItem();
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
        trainTable.refresh();
        isTrackClear = false;
        statusLabel.setText("Clearance issued for " + selectedTrain.getTrainId() + "!");
    }

    @javafx.fxml.FXML
    public void handleback(ActionEvent actionEvent) {
        statusLabel.setText("Returning to Station Controller Dashboard...");
    }

    public static class TrainRow {
        private String trainId;
        private String route;
        private String time;
        private String status;

        public TrainRow(String trainId, String route, String time, String status) {
            this.trainId = trainId;
            this.route = route;
            this.time = time;
            this.status = status;
        }

        public String getTrainId() { return trainId; }
        public String getRoute() { return route; }
        public String getTime() { return time; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
    }
}