package Sakib.HRManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class TrainingDevelopmentHRController
{
    @javafx.fxml.FXML
    private TableView<WorkshopHR> workshopTable;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, String> trainerCol;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, String> dateCol;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, String> durationCol;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, String> deptCol;

    @javafx.fxml.FXML
    private Button createWorkshopButton;
    @javafx.fxml.FXML
    private TextField titleTF;
    @javafx.fxml.FXML
    private TextField trainerTF;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextField durationTF;
    @javafx.fxml.FXML
    private TextField departmentTF;
    @javafx.fxml.FXML
    private Button saveWorkshopButton;
    @javafx.fxml.FXML
    private Button backButtonTraining;
    @javafx.fxml.FXML
    private Label alertLabelTraining;

    private ObservableList<WorkshopHR> workshopList;

    @javafx.fxml.FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        trainerCol.setCellValueFactory(new PropertyValueFactory<>("trainer"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        durationCol.setCellValueFactory(new PropertyValueFactory<>("duration"));
        deptCol.setCellValueFactory(new PropertyValueFactory<>("department"));

        workshopList = FXCollections.observableArrayList(
                new WorkshopHR("Safety Training", "Rahim",
                        "2025-12-10", "2 hours", "Operations"),
                new WorkshopHR("Customer Service Basics", "Ayesha",
                        "2025-12-15", "3 hours", "Front Desk"),
                new WorkshopHR("Leadership 101", "Karim",
                        "2025-12-20", "4 hours", "Management")
        );

        workshopTable.setItems(workshopList);

        alertLabelTraining.setText("");
        showForm(false);
    }

    @javafx.fxml.FXML
    public void createWorkshopButton(ActionEvent actionEvent) {
        titleTF.clear();
        trainerTF.clear();
        dateDP.setValue(null);
        durationTF.clear();
        departmentTF.clear();

        showForm(true);
        createWorkshopButton.setDisable(true);

        alertLabelTraining.setText("Enter workshop details and click Save Workshop.");
    }

    @javafx.fxml.FXML
    public void saveWorkshopButton(ActionEvent actionEvent) {
        String title = titleTF.getText();
        String trainer = trainerTF.getText();
        LocalDate date = dateDP.getValue();
        String duration = durationTF.getText();
        String department = departmentTF.getText();

        if (title == null || title.isEmpty()) {
            alertLabelTraining.setText("Please enter the workshop title.");
            return;
        }
        if (trainer == null || trainer.isEmpty()) {
            alertLabelTraining.setText("Please enter the trainer name.");
            return;
        }
        if (date == null) {
            alertLabelTraining.setText("Please select a workshop date.");
            return;
        }

        WorkshopHR newWorkshop = new WorkshopHR(
                title,
                trainer,
                date.toString(),
                duration,
                department
        );
        workshopList.add(newWorkshop);

        alertLabelTraining.setText("Workshop scheduled successfully!");

        showForm(false);
        createWorkshopButton.setDisable(false);
    }

    @javafx.fxml.FXML
    public void backButtonTraining(ActionEvent actionEvent) {
        switchScene("HRDashboard.fxml", actionEvent);
    }

    private void showForm(boolean visible) {
        titleTF.setVisible(visible);
        trainerTF.setVisible(visible);
        dateDP.setVisible(visible);
        durationTF.setVisible(visible);
        departmentTF.setVisible(visible);
        saveWorkshopButton.setVisible(visible);

        titleTF.setDisable(!visible);
        trainerTF.setDisable(!visible);
        dateDP.setDisable(!visible);
        durationTF.setDisable(!visible);
        departmentTF.setDisable(!visible);
        saveWorkshopButton.setDisable(!visible);
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
