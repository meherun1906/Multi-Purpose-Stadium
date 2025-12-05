package Sakib.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ExpenseRecAccController
{
    @javafx.fxml.FXML
    private ComboBox<String> expenseTypeCB;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private Label alertLabelER;
    @javafx.fxml.FXML
    private Button addExpenseButton;
    @javafx.fxml.FXML
    private Button backButtonER;

    @javafx.fxml.FXML
    public void initialize() {
        expenseTypeCB.getItems().addAll(
                "Utility Bills",
                "Maintenance",
                "Staff Salary",
                "Equipment",
                "Other"
        );
        alertLabelER.setText("");
    }

    @javafx.fxml.FXML
    public void addExpenseButton(ActionEvent actionEvent) {
        String type = expenseTypeCB.getValue();
        String amount = amountTF.getText();
        String description = descriptionTA.getText();

        if (type == null || type.isEmpty()) {
            alertLabelER.setText("Please select an expense type.");
            return;
        }
        if (amount == null || amount.isEmpty()) {
            alertLabelER.setText("Please enter the amount.");
            return;
        }
        if (description == null || description.isEmpty()) {
            alertLabelER.setText("Please enter a description.");
            return;
        }

        alertLabelER.setText("New expense record added successfully!");

        expenseTypeCB.setValue(null);
        amountTF.clear();
        descriptionTA.clear();
    }

    @javafx.fxml.FXML
    public void backButtonER(ActionEvent actionEvent) {
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
