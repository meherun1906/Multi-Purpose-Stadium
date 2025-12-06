package Sakib.HRManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HRDashboardController {

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LogOutButtonHR(ActionEvent actionEvent) {
        switchScene("LogIn.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void SalaryBenefitsManagementButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void EminfoButton(ActionEvent actionEvent) {
        switchScene("EmployeeInfoManagementHR.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void DroasterButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ManageAccountButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AttendanceMonitoringButton(ActionEvent actionEvent) {
        switchScene("AttendanceMonitoringHR.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void HiringRequetmentButton(ActionEvent actionEvent) {
        switchScene("HiringRecruitmentHR.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void TrainingDevelopmentButton(ActionEvent actionEvent) {
        switchScene("TrainingDevelopmentHR.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void PerformanceReviewButton(ActionEvent actionEvent) {
    }

    private void switchScene(String fxmlFileName, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
            Stage stage = (Stage) ((Node) event.getSource())
                    .getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
        }
    }
}
