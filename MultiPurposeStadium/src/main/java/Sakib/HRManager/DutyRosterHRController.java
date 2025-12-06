package Sakib.HRManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class DutyRosterHRController
{
    @javafx.fxml.FXML
    private TableColumn<DutyRosterHR, String> shiftCol;
    @javafx.fxml.FXML
    private TableColumn<DutyRosterHR, LocalDate> endDateCol;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private TableColumn<DutyRosterHR, String> departmentCol;
    @javafx.fxml.FXML
    private TableColumn<DutyRosterHR, LocalDate> startDateCol;
    @javafx.fxml.FXML
    private TableColumn<DutyRosterHR, String> empNameCol;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private ComboBox<String> shiftCB;
    @javafx.fxml.FXML
    private DatePicker startDateDP;
    @javafx.fxml.FXML
    private TableView<DutyRosterHR> dutyRosterTable;
    @javafx.fxml.FXML
    private ComboBox<String> empNameCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
    }
}