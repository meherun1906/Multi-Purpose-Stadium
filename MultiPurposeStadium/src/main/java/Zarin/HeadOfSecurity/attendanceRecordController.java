package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;


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
    private TextField nameTF;
    @javafx.fxml.FXML
    private Label messageL1;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private ComboBox<String> gateCB;
    @javafx.fxml.FXML
    private DatePicker dateDP;

    @javafx.fxml.FXML
    public void initialize() {
        gateCB.getItems().addAll(
                "Gate A",
                "Gate B",
                "VIP Entrance",
                "Emergency Exit"
        );
        statusCB.getItems().addAll(
                "Present",
                "Absent"
        );
        staffCol.setCellValueFactory(new PropertyValueFactory<>("staffName"));
        gateCol.setCellValueFactory(new PropertyValueFactory<>("gate"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        dateDP.setValue(LocalDate.now());
        attendanceDP.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
        attendanceTV.getItems().clear();
        messageL.setText("");

        LocalDate selectedDate = attendanceDP.getValue();

        if (selectedDate == null) {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setTitle("No Date Selected");
            a.setHeaderText(null);
            a.setContentText("Please select a date before loading attendance.");
            a.showAndWait();
            return;
        }

        File f = new File("Attendance.bin");
        if (!f.exists()) {
            messageL.setText("No attendance available.");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            boolean found = false;

            while (true) {
                try {
                    AttendanceRecord ar = (AttendanceRecord) ois.readObject();
                    if (ar.getDate().equals(selectedDate)) {
                        attendanceTV.getItems().add(ar);
                        found = true;
                    }
                } catch (EOFException e) {
                    break;
                }
            }
            if (!found) {
                messageL.setText("No attendance found for selected date.");
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
        messageL1.setText("");

        if (nameTF.getText().isEmpty()
                || gateCB.getValue() == null
                || statusCB.getValue() == null
                || dateDP.getValue() == null) {

            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setTitle("Missing Information");
            a.setHeaderText(null);
            a.setContentText("Please fill up Name, Gate, Status and Date before saving.");
            a.showAndWait();
            return;
        }

        try {
            File f = new File("Attendance.bin");

            AttendanceRecord ar = new AttendanceRecord(
                    nameTF.getText(),
                    gateCB.getValue(),
                    statusCB.getValue(),
                    dateDP.getValue()
            );

            if (f.exists()) {
                FileOutputStream fos = new FileOutputStream(f, true);
                ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(ar);
                oos.close();
            } else {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(ar);
                oos.close();
            }

            messageL1.setText("Attendance Saved");

            nameTF.clear();
            gateCB.getSelectionModel().clearSelection();
            statusCB.getSelectionModel().clearSelection();
            dateDP.setValue(LocalDate.now());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}