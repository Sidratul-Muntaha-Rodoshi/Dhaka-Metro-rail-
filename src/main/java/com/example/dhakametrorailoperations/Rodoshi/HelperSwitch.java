package com.example.dhakametrorailoperations.Rodoshi;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelperSwitch {
    public void SceneSwitch(ActionEvent event,String fxmlPath) throws IOException {
        FXMLLoader loader= new FXMLLoader( HelperSwitch.class.getResource(fxmlPath));
        Scene scene = new Scene(loader.load());
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();




    }
}
