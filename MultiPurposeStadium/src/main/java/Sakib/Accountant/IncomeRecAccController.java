package Sakib.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class IncomeRecAccController
{
    @javafx.fxml.FXML
    private TextField incomeTF;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private Label AlertlabelIR;

    @javafx.fxml.FXML
    public void initialize() {
        AlertlabelIR.setText("");
    }

    @javafx.fxml.FXML
    public void addnewButton(ActionEvent actionEvent) {
        String income = incomeTF.getText();
        String amount = amountTF.getText();
        String description = descriptionTA.getText();

        if (income == null || income.isEmpty()) {
            AlertlabelIR.setText("Please enter the income source.");
            return;
        }
        if (amount == null || amount.isEmpty()) {
            AlertlabelIR.setText("Please enter the amount.");
            return;
        }
        if (description == null || description.isEmpty()) {
            AlertlabelIR.setText("Please enter a description.");
            return;
        }

        AlertlabelIR.setText("New income record added successfully!");

        incomeTF.clear();
        amountTF.clear();
        descriptionTA.clear();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        switchScene("CheifAccountantDashboard.fxml", actionEvent);
    }

    private void switchScene(String fxmlFileName, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
            Stage stage = (Stage) ((Node) event.getSource())
                    .getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e) {
        }
    }
}
