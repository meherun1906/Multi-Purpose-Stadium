package Sakib.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController
{
    @javafx.fxml.FXML
    private PasswordField passwordTextField;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private TextField usernameTextField;

    private final String HR = "SakibHR";
    private final String HRPass = "1234";

    private final String CAcc = "SakibAcc";
    private final String CAccPass = "1234";

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LoginOnActionButton(ActionEvent actionEvent) {
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Please enter both username and password.");
            return;
        }

        if (username.equals(HR) && password.equals(HRPass)) {
            switchScene("HRDashboard.fxml");
        }
        else if (username.equals(CAcc) && password.equals(CAccPass)) {
            switchScene("CheifAccountantDashboard.fxml");
        }
        else {
            errorLabel.setText("Incorrect username or password. Please try again.");
        }
    }

    private void switchScene(String fxmlFileName) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));

            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

            errorLabel.setText("");
        }
        catch (IOException e) {
            errorLabel.setText("Error loading the next screen.");
            e.printStackTrace();
        }
    }
}
