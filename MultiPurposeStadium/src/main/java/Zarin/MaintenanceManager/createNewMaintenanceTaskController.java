package Zarin.MaintenanceManager;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class createNewMaintenanceTaskController
{
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask,String> areaCol;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask,String> taskCol;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TextField assignTF;
    @javafx.fxml.FXML
    private ComboBox<String> areaCB;
    @javafx.fxml.FXML
    private Label messageL1;
    @javafx.fxml.FXML
    private TableView<MaintenanceTask> taskTV;
    @javafx.fxml.FXML
    private ComboBox<String> taskCB;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask,String> assignCol;

    @javafx.fxml.FXML
    public void initialize() {
        taskCB.getItems().addAll(
                "Air Conditioner Inspection",
                "Light Bulb Replacement",
                "Plumbing Leak Check",
                "Electrical Panel Check",
                "Generator Maintenance",
                "Glass Cleaning",
                "Fire Safety Equipment Test"
        );
        areaCB.getItems().addAll(
                "Main Lobby",
                "North Stand",
                "South Wing",
                "VIP Lounge",
                "Parking Level 1",
                "Restroom Block A",
                "Media Room"
        );
        taskCol.setCellValueFactory(new PropertyValueFactory<>("task"));
        areaCol.setCellValueFactory(new PropertyValueFactory<>("area"));
        assignCol.setCellValueFactory(new PropertyValueFactory<>("assignedTo"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
        messageL.setText("");
        if (taskCB.getValue() == null
                || areaCB.getValue() == null
                || assignTF.getText().isEmpty()
                || dateDP.getValue() == null) {

            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setTitle("Missing Information");
            a.setHeaderText(null);
            a.setContentText("Please fill all fields and select a valid date.");
            a.showAndWait();
            return;
        }

        LocalDate selectedDate = dateDP.getValue();
        LocalDate today = LocalDate.now();

        if (selectedDate.isBefore(today)) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Invalid Date");
            a.setHeaderText(null);
            a.setContentText("Please fill all fields and select a valid date.");
            a.showAndWait();
            return;
        }

        try {
            File f = new File("MaintenanceSchedule.bin");
            MaintenanceTask mt = new MaintenanceTask(
                    taskCB.getValue(),
                    areaCB.getValue(),
                    assignTF.getText(),
                    "Scheduled",
                    selectedDate
            );
            if (f.exists()) {
                FileOutputStream fos = new FileOutputStream(f, true);
                ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(mt);
                oos.close();
            } else {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(mt);
                oos.close();
            }

            messageL.setText("New Task Created");
            taskCB.getSelectionModel().clearSelection();
            areaCB.getSelectionModel().clearSelection();
            assignTF.getText();
            dateDP.setValue(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
        taskTV.getItems().clear();
        messageL1.setText("");
        File f = new File("MaintenanceSchedule.bin");
        if (!f.exists()) {
            messageL1.setText("No maintenance tasks found.");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            boolean found = false;
            while (true) {
                try {
                    MaintenanceTask mt = (MaintenanceTask) ois.readObject();
                    if ("Scheduled".equals(mt.getStatus())) {
                        taskTV.getItems().add(mt);
                        found = true;
                    }

                } catch (EOFException e) {
                    break;
                }
            }
            if (!found) {
                messageL1.setText("No scheduled tasks found.");
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

