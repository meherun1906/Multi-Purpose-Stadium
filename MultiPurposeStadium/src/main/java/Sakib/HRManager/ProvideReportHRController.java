package Sakib.HRManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ProvideReportHRController {
    @javafx.fxml.FXML
    private TableColumn<ProvideReportHR, LocalDate> endDateCol;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private TableView<ProvideReportHR> provideReportTable;
    @javafx.fxml.FXML
    private TableColumn<ProvideReportHR, String> departmentCol;
    @javafx.fxml.FXML
    private TableColumn<ProvideReportHR, LocalDate> startDateCol;
    @javafx.fxml.FXML
    private TableColumn<ProvideReportHR, String> reportTypeCol;
    @javafx.fxml.FXML
    private ComboBox<String> JobRoleCB;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeCB;
    @javafx.fxml.FXML
    private TableColumn<ProvideReportHR, String> jobRoleCol;
    @javafx.fxml.FXML
    private DatePicker startDateDP;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeCB.setItems(FXCollections.observableArrayList(
                "Attendance Report", "Salary Report", "Workforce Report"
        ));

        departmentCB.setItems(FXCollections.observableArrayList(
                "HR", "Finance", "IT", "Marketing", "Sales"
        ));

        JobRoleCB.setItems(FXCollections.observableArrayList(
                "Manager", "Officer", "Assistant", "Intern", "Supervisor"
        ));


        reportTypeCol.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        startDateCol.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        endDateCol.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        jobRoleCol.setCellValueFactory(new PropertyValueFactory<>("jobRole"));

        private ObservableList<ProvideReportHR> reportList;

        reportList.addAll(
                new ProvideReportHR("Attendance Report", LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 31), "HR", "Manager"),
                new ProvideReportHR("Salary Report", LocalDate.of(2025, 2, 1), LocalDate.of(2025, 2, 28), "Finance", "Officer"),
                new ProvideReportHR("Workforce Report", LocalDate.of(2025, 3, 1), LocalDate.of(2025, 3, 31), "IT", "Assistant")
        );
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {
    }

    private void switchScene(String fxmlFile, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        @javafx.fxml.FXML
        public void backReportButton (ActionEvent actionEvent){
            switchScene("/Sakib/HRManager/HRDashboard.fxml", actionEvent);
        }
    }
}