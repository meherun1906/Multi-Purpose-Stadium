package Sakib.HRManager;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class WorkshopHRController
{
    @javafx.fxml.FXML
    private TextField durationTF;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, String> trainerColFD;
    @javafx.fxml.FXML
    private TableView<WorkshopHR> workshopTable;
    @javafx.fxml.FXML
    private TextField trainerTF;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, String> titleColFD;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, String> departmentColFD;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, LocalDate> dateColFD;
    @javafx.fxml.FXML
    private TextField titleTF;
    @javafx.fxml.FXML
    private TableColumn<WorkshopHR, Integer> durationColFD;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void workshopBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addWorkshopButton(ActionEvent actionEvent) {


    }

    }
