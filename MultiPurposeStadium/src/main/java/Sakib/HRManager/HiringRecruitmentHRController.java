package Sakib.HRManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HiringRecruitmentHRController
{
    @javafx.fxml.FXML
    private Button createJobPostButton;
    @javafx.fxml.FXML
    private TextField titleTF;
    @javafx.fxml.FXML
    private TextField vacancyTF;
    @javafx.fxml.FXML
    private TextField salaryRangeTF;
    @javafx.fxml.FXML
    private TextArea requirementsTA;
    @javafx.fxml.FXML
    private Button submitJobPostButton;
    @javafx.fxml.FXML
    private Label alertLabelHiring;

    @javafx.fxml.FXML
    public void initialize() {
        alertLabelHiring.setText("");
        showForm(false);
    }

    @javafx.fxml.FXML
    public void createJobPostButton(ActionEvent actionEvent) {
        titleTF.clear();
        vacancyTF.clear();
        salaryRangeTF.clear();
        requirementsTA.clear();

        showForm(true);
        createJobPostButton.setDisable(true);

        alertLabelHiring.setText("Enter job post details and click Submit Job Post.");
    }

    @javafx.fxml.FXML
    public void submitJobPostButton(ActionEvent actionEvent) {
        String title = titleTF.getText();
        String vacancy = vacancyTF.getText();
        String salaryRange = salaryRangeTF.getText();
        String requirements = requirementsTA.getText();

        if (title == null || title.isEmpty()) {
            alertLabelHiring.setText("Please enter a job title.");
            return;
        }

        if (vacancy != null && !vacancy.isEmpty() && !vacancy.matches("\\d+")) {
            alertLabelHiring.setText("Vacancy should be a number.");
            return;
        }

        alertLabelHiring.setText("Job post submitted successfully!");

        showForm(false);
        createJobPostButton.setDisable(false);
    }

    @javafx.fxml.FXML
    public void backButtonHRHiring(ActionEvent actionEvent) {
        switchScene("HRDashboard.fxml", actionEvent);
    }

    private void showForm(boolean visible) {
        titleTF.setVisible(visible);
        vacancyTF.setVisible(visible);
        salaryRangeTF.setVisible(visible);
        requirementsTA.setVisible(visible);
        submitJobPostButton.setVisible(visible);

        titleTF.setDisable(!visible);
        vacancyTF.setDisable(!visible);
        salaryRangeTF.setDisable(!visible);
        requirementsTA.setDisable(!visible);
        submitJobPostButton.setDisable(!visible);
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
