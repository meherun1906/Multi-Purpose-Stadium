package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;


public class attendanceRecordController
{
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private TableView<AttendanceRecord> attendanceTV;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecord,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecord,String> staffCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecord,String> gateCol;
    @javafx.fxml.FXML
    private DatePicker attendanceDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
    }
}