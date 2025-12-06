package Sakib.HRManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class ProvideReportHRController
{
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
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backReportButton(ActionEvent actionEvent) {
    }
}