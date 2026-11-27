package commonClass;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

import javafx.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField userIDTF;
    @javafx.fxml.FXML
    private Label labelErrorLabel;
    @javafx.fxml.FXML
    private TextField passwordTF;
    private int failedLoginCounter = 0;

    @javafx.fxml.FXML
    public void initialize() {
        labelErrorLabel.setText("");
    }

    private List<User> getDummyUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("U101", "Pass@1234", "Passenger"));
        users.add(new User("U201", "Pass@1234", "Security Officer"));
        users.add(new User("U301", "Pass@1234", "MRT Pass Officer"));
        users.add(new User("U401", "Pass@1234", "Data Analyst Officer"));
        users.add(new User("U501", "Pass@1234", "Ticket Counter Officer"));
        users.add(new User("U601", "Pass@1234", "Metro Train Operator"));
        users.add(new User("U701", "Pass@1234", "Station Controller"));
        users.add(new User("U801", "Pass@1234", "Central Finance Officer"));
        return users;
    }

    @javafx.fxml.FXML
    public void handleloginButton(ActionEvent actionEvent) {
        String userId = userIDTF.getText().trim();
        String password = passwordTF.getText();
        labelErrorLabel.setText("");


        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$";

        if (userId.isEmpty() || !password.matches(passwordPattern)) {
            labelErrorLabel.setText("Invalid ID or Password format");
            passwordTF.clear();
            return;
    }

        User matchedUser = null;
        for (User u : getDummyUsers()) {
            if (u.getUserId().equals(userId) && u.getPassword().equals(password)) {
                matchedUser = u;
                break;
            }
        }

        if (matchedUser == null) {
            failedLoginCounter++;
            passwordTF.clear();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Incorrect ID or Password");
            alert.showAndWait();
            return;
        }


        SessionManager.setCurrentUser(matchedUser);
        routeToRoleDashboard(matchedUser.getRole(), actionEvent);
    }

    private void routeToRoleDashboard(String role, ActionEvent event) {
        String fxmlPath = switch (role) {
            case "Passenger" -> "/passenger/PassengerDashboard.fxml";
            case "Security Officer" -> "/security/SecurityOfficerDashboard.fxml";
            case "MRT Pass Officer" -> "/mrtpass/MrtPassOfficerDashboard.fxml";
            case "Data Analyst Officer" -> "/dataanalyst/DataAnalystDashboard.fxml";
            case "Ticket Counter Officer" -> "/com/example/dhakametrorailoperations/Rodoshi/u5_TicketOfficerDashBoard.fxml";
            case "Metro Train Operator" -> "/com/example/dhakametrorailoperations/Rodoshi/u6_TrainOperatorDashBoard.fxml";
            case "Station Controller" -> "/stationcontroller/StationControllerDashboard.fxml";
            case "Central Finance Officer" -> "/finance/FinanceOfficerDashboard.fxml";
            default -> "";
        };

        if (!fxmlPath.isEmpty()) {
            SceneSwitcher.switchScene(event, fxmlPath);
        }
    }


}