package Zarin.MaintenanceManager;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class filterEquipmentLogsController
{
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog,String> equipmentCol;
    @javafx.fxml.FXML
    private TableView<EquipmentLog> logTV;
    @javafx.fxml.FXML
    private ComboBox<String> equipCB;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog, LocalDate> nextDueCol;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog,String> technicianNameCol;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog,LocalDate> lastServicedCol;

    @javafx.fxml.FXML
    public void initialize() {
        equipCB.getItems().addAll(
                "Generator A",
                "Generator B",
                "Elevator 1",
                "HVAC Unit 1",
                "Water Pump 3"
        );
        equipmentCol.setCellValueFactory(new PropertyValueFactory<>("equipment"));
        lastServicedCol.setCellValueFactory(new PropertyValueFactory<>("lastServiced"));
        nextDueCol.setCellValueFactory(new PropertyValueFactory<>("nextDue"));
        technicianNameCol.setCellValueFactory(new PropertyValueFactory<>("technician"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void filterOA(ActionEvent actionEvent) {
        logTV.getItems().clear();
        messageL.setText("");

        String selectedEquipment = equipCB.getValue();

        if (selectedEquipment == null) {
            messageL.setText("Please select an equipment to view logs.");
            return;
        }

        File file = new File("EquipmentLogs.bin");

        if (!file.exists()) {
            messageL.setText("No equipment service logs found.");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            boolean found = false;
            while (true) {
                try {
                    EquipmentLog log = (EquipmentLog) ois.readObject();
                    if (selectedEquipment.equals(log.getEquipment())) {
                        logTV.getItems().add(log);
                        found = true;
                    }
                } catch (EOFException eof) {
                    break;
                }
            }
            ois.close();
            if (!found) {
                messageL.setText("No service logs available for the selected equipment.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}