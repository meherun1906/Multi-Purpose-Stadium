package Zarin.MaintenanceManager;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class equipmentLogViewController
{
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog,String> equipmentCol;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TableView<EquipmentLog> logTV;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog,String> statusCol;
    @javafx.fxml.FXML
    private Label messageL1;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog, LocalDate> nextDueCol;
    @javafx.fxml.FXML
    private ComboBox<String> equipmentCB;
    @javafx.fxml.FXML
    private DatePicker lastServicedDP;
    @javafx.fxml.FXML
    private DatePicker nextDueDP;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog,String> technicianNameCol;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog,LocalDate> lastServicedCol;

    @javafx.fxml.FXML
    public void initialize() {
        equipmentCB.getItems().addAll(
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
    public void saveOA(ActionEvent actionEvent) {
        messageL.setText("");

        if (equipmentCB.getValue() == null
                || lastServicedDP.getValue() == null
                || nextDueDP.getValue() == null
                || nameTF.getText().isEmpty()) {

            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Invalid Input");
            a.setContentText("Please fill all fields (equipment, dates, technician).");
            a.showAndWait();
            return;
        }
        LocalDate lastServiced = lastServicedDP.getValue();
        LocalDate nextDue = nextDueDP.getValue();
        String equipment = equipmentCB.getValue();
        String technician = nameTF.getText();
        String status = calculateStatus(nextDue);

        try {
            File file = new File("EquipmentLogs.bin");

            EquipmentLog log = new EquipmentLog(
                    equipment,
                    lastServiced,
                    nextDue,
                    technician,
                    status
            );

            if (file.exists()) {
                FileOutputStream fos = new FileOutputStream(file, true);
                ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(log);
                oos.close();
            } else {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(log);
                oos.close();
            }
            messageL.setText("Service log saved successfully.");
            lastServicedDP.setValue(null);
            nextDueDP.setValue(null);
            nameTF.clear();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
        logTV.getItems().clear();
        messageL1.setText("");

        File file = new File("EquipmentLogs.bin");

        if (!file.exists()) {
            messageL1.setText("No equipment service logs found.");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            boolean found = false;

            while (true) {
                try {
                    EquipmentLog log = (EquipmentLog) ois.readObject();
                    logTV.getItems().add(log);
                    found = true;
                } catch (EOFException eof) {
                    break;
                }
            }
            ois.close();
            if (!found) {
                messageL.setText("No logs to display.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String calculateStatus(LocalDate nextDue) {
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(today, nextDue);

        if (days > 7) {
            return "On Time";
        } else if (days >= 0 && days <= 7) {
            return "Due Soon";
        } else {
            return "Overdue";
        }
    }
}