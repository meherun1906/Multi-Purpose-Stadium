package Argo.CFO;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @javafx.fxml.FXML
    private TextField passwardFxId;
    @javafx.fxml.FXML
    private TextField idFxId;
    @javafx.fxml.FXML
    private Label fastlabelFxId;

    private final String CFO = "1234";
    private final String CFOPass = "1234";

    private final String EOM = "1234";
    private final String EOMPass = "1234";

    @javafx.fxml.FXML
    public void loginOnAction(ActionEvent actionEvent) {

        String id = idFxId.getText().trim();
        String password = passwardFxId.getText().trim();

        if (id.isEmpty() || password.isEmpty()) {
            fastlabelFxId.setText("Please enter both username and password.");
            return;
        }

        if (id.equals(CFO) && password.equals(CFOPass)) {
            switchScene("CFODashboard.fxml", actionEvent);
        } else if (id.equals(EOM) && password.equals(EOMPass)) {
            switchScene("EOMDashboard.fxml", actionEvent);
        } else {
            fastlabelFxId.setText("Incorrect username or password. Please try again.");
        }
    }

    private void switchScene(String fxmlFileName, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            fastlabelFxId.setText("Error loading the next screen.");
            e.printStackTrace();
        }
    }
}
