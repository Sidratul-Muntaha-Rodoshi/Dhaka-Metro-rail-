module com.example.dhakametrorailoperations {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.dhakametrorailoperations to javafx.fxml;
    exports com.example.dhakametrorailoperations;
    exports commonClass;
    opens commonClass to javafx.fxml;
}