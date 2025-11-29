package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;

public class viewDutyScheduleController
{
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> shiftStartCol;
    @javafx.fxml.FXML
    private TableView<DutySchedule> dutyTV;
    @javafx.fxml.FXML
    private DatePicker SelectDateDP;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> zoneCol;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> staffCol;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> gateCol;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> shiftEndCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LoadOA(ActionEvent actionEvent) {
    }
}