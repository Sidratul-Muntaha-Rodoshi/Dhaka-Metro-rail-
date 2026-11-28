module com.example.dhakametrorailoperations {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.jfr;

    opens com.example.dhakametrorailoperations to javafx.fxml;
    exports com.example.dhakametrorailoperations;

    exports commonClass;
    opens commonClass to javafx.fxml;

    exports com.example.dhakametrorailoperations.Rinty;
    opens com.example.dhakametrorailoperations.Rinty to javafx.fxml;
    opens com.example.dhakametrorailoperations.Rintyfxml to javafx.fxml;
}