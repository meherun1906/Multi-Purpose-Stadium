package Sakib.HRManager;

import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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

public class DutyRosterHRController {
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
        empNameCB.setItems(FXCollections.observableArrayList(
                "Sakib Khan", "Rahim", "Karim", "Hasib"
        ));

        departmentCB.setItems(FXCollections.observableArrayList(
                "HR", "Finance", "Security", "Maintenance", "Events"
        ));

        shiftCB.setItems(FXCollections.observableArrayList(
                "Morning", "Evening", "Night"
        ));


        empNameCol.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        shiftCol.setCellValueFactory(new PropertyValueFactory<>("shift"));
        startDateCol.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        endDateCol.setCellValueFactory(new PropertyValueFactory<>("endDate"));

        private javafx.collections.ObservableList<DutyRosterHR> rosterList = FXCollections.observableArrayList();
        private FilteredList<DutyRosterHR> filteredList;

        filteredList = new FilteredList<>(rosterList, p -> true);
        dutyRosterTable.setItems(filteredList);
        empNameCB.valueProperty().addListener((observable, oldVal, newVal) -> applyFilter());
        departmentCB.valueProperty().addListener((observable, oldVal, newVal) -> applyFilter());
        shiftCB.valueProperty().addListener((observable, oldVal, newVal) -> applyFilter());
        startDateDP.valueProperty().addListener((observable, oldVal, newVal) -> applyFilter());
        endDateDP.valueProperty().addListener((observable, oldVal, newVal) -> applyFilter());


    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        switchScene("/Sakib/HRManager/HRDashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void assignButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
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