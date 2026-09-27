module com.example.dhakametrorailoperations {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dhakametrorailoperations to javafx.fxml;
    exports com.example.dhakametrorailoperations;
}