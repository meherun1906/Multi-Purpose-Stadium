package mainpackage.multipurposestadium;

import Meherun.CEO.CEO;
import Meherun.Client.Client;
//import Zarin.HeadOfSecurity.HeadOfSecurity;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class logInViewController
{
    @javafx.fxml.FXML
    private PasswordField logInPasswordField;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField logInIdTextField;
    @javafx.fxml.FXML
    private AnchorPane logInAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logInButtonOnAction(ActionEvent actionEvent) {
        if (logInIdTextField.getText().length() == 3) {
            CEO logCEO = null;
            boolean log = false;
            try {
                FileInputStream fis = new FileInputStream("CEO.bin");
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    CEO c = (CEO) ois.readObject();
                    if ((logInIdTextField.getText().equals(c.getiD())) && (logInPasswordField.getText().equals(c.getPassWord()))) {
                        log = true;
                        logCEO = c;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                //messageLabel.setText("User ID and PassWord doesn't match");
            }
            if (log) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/CEO/cEODashboard.fxml"));
                    Node node = loader.load();
                    logInAnchorPane.getChildren().setAll(node);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (logInIdTextField.getText().length() == 4) {
            Client logClient = null;
            boolean client = false;
            try {
                FileInputStream fis = new FileInputStream("Client.bin");
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    Client c = (Client) ois.readObject();
                    if ((logInIdTextField.getText().equals(c.getiD())) && (logInPasswordField.getText().equals(c.getPassWord()))) {
                        client = true;
                        logClient = c;
                        break;
                    }
                }
            } catch (Exception e) {
                //e.printStackTrace();
                messageLabel.setText("User ID and PassWord doesn't match");
            }
            if (client) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/clientDashboard.fxml"));
                    Node node = loader.load();
                    logInAnchorPane.getChildren().setAll(node);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        /*if (logInIdTextField.getText().length() == 5) {
            HeadOfSecurity logHoS = null;
            boolean log = false;
            try {
                FileInputStream fis = new FileInputStream("HeadOfSecurity.bin");
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    HeadOfSecurity hs = (HeadOfSecurity) ois.readObject();
                    if ((logInIdTextField.getText().equals(hs.getiD())) && (logInPasswordField.getText().equals(hs.getPassWord()))) {
                        log = true;
                        logHoS = hs;
                        break;
                    }
                }
            } catch (Exception e) {
                //e.printStackTrace();
                messageLabel.setText("User ID and PassWord doesn't match");
            }
            if (log) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/HeadOfSecurity/headOfSecurityDashboard.fxml"));
                    Node node = loader.load();
                    logInAnchorPane.getChildren().setAll(node);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }*/
    }

}