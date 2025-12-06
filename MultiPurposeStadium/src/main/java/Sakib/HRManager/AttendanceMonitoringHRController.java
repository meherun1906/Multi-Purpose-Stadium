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

public class AttendanceMonitoringHRController
{
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private TextField employeeNameTF;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private DatePicker toDateDP;

    @javafx.fxml.FXML
    private TableView<AttendanceRecordHR> attendanceTable;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordHR, String> dateCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordHR, String> empNameCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordHR, String> deptCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordHR, String> checkInCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordHR, String> checkOutCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordHR, String> totalHoursCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordHR, String> absenceCol;

    @javafx.fxml.FXML
    private Button searchButton;
    @javafx.fxml.FXML
    private Button backButtonAtt;
    @javafx.fxml.FXML
    private Label alertLabelAtt;

    private ObservableList<AttendanceRecordHR> allRecords;

    @javafx.fxml.FXML
    public void initialize() {
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        empNameCol.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        deptCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        checkInCol.setCellValueFactory(new PropertyValueFactory<>("checkInTime"));
        checkOutCol.setCellValueFactory(new PropertyValueFactory<>("checkOutTime"));
        totalHoursCol.setCellValueFactory(new PropertyValueFactory<>("totalHours"));
        absenceCol.setCellValueFactory(new PropertyValueFactory<>("absenceDetails"));

        allRecords = FXCollections.observableArrayList(
                new AttendanceRecordHR("2025-11-01", "Alamin Rahman", "HR",
                        "09:00", "17:00", "8", "Present"),
                new AttendanceRecordHR("2025-11-01", "Dj Karim", "Finance",
                        "09:15", "17:10", "7.9", "Present"),
                new AttendanceRecordHR("2025-11-01", "Islam kaka", "Operations",
                        "09:30", "16:30", "7", "Left early"),
                new AttendanceRecordHR("2025-11-02", "Alamin Rahman", "HR",
                        "09:05", "17:05", "8", "Present"),
                new AttendanceRecordHR("2025-11-02", "Dj Karim", "Finance",
                        "-", "-", "0", "Absent")
        );

        attendanceTable.setItems(allRecords);

        departmentCB.getItems().addAll("All", "HR", "Finance", "Operations");
        departmentCB.setValue("All");

        alertLabelAtt.setText("");
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
        String deptFilter = departmentCB.getValue();
        String nameFilter = employeeNameTF.getText();
        LocalDate fromDate = fromDateDP.getValue();
        LocalDate toDate = toDateDP.getValue();

        alertLabelAtt.setText("");

        if (fromDate != null && toDate != null && fromDate.isAfter(toDate)) {
            alertLabelAtt.setText("From date cannot be after To date.");
            return;
        }

        ObservableList<AttendanceRecordHR> filtered = FXCollections.observableArrayList();

        for (AttendanceRecordHR rec : allRecords) {
            if (deptFilter != null && !"All".equals(deptFilter)) {
                if (!rec.getDepartment().equalsIgnoreCase(deptFilter)) {
                    continue;
                }
            }

            if (nameFilter != null && !nameFilter.trim().isEmpty()) {
                if (!rec.getEmployeeName().toLowerCase()
                        .contains(nameFilter.trim().toLowerCase())) {
                    continue;
                }
            }

            if (fromDate != null || toDate != null) {
                LocalDate recDate = LocalDate.parse(rec.getDate());
                if (fromDate != null && recDate.isBefore(fromDate)) {
                    continue;
                }
                if (toDate != null && recDate.isAfter(toDate)) {
                    continue;
                }
            }

            filtered.add(rec);
        }

        attendanceTable.setItems(filtered);

        if (filtered.isEmpty()) {
            alertLabelAtt.setText("No attendance records found for the selected filters.");
        } else {
            alertLabelAtt.setText("Showing " + filtered.size() + " record(s).");
        }
    }

    @javafx.fxml.FXML
    public void backButtonAtt(ActionEvent actionEvent) {
        switchScene("HRDashboard.fxml", actionEvent);
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
