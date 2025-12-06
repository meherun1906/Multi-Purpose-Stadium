package Sakib.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CheifAccountantDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AuditVerificationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ClientPaymentsButton(ActionEvent actionEvent) {
        switchScene("ClientPaymentAcc.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void GenerateMonthlyReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void TaxReportGenerationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FinancialDatabaseButton(ActionEvent actionEvent) {
        switchScene("FinancialDatabaseAcc.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutButtonCAcc(ActionEvent actionEvent) {
        switchScene("LogIn.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ExpenseRecordButton(ActionEvent actionEvent) {
        switchScene("ExpenseRecAcc.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void PayrollManagementButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void IncomeRecordButton(ActionEvent actionEvent) {
        switchScene("IncomeRecAcc.fxml", actionEvent);
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
