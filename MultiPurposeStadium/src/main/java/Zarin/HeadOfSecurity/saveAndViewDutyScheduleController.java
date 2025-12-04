package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class saveAndViewDutyScheduleController
{
    @javafx.fxml.FXML
    private Label messageL1;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> zoneCol;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> staffCol;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> gateCol;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> shiftEndCol;
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private TableColumn<DutySchedule,String> shiftStartCol;
    @javafx.fxml.FXML
    private TableView<DutySchedule> dutyTV;
    @javafx.fxml.FXML
    private ComboBox<String> zoneCB;
    @javafx.fxml.FXML
    private DatePicker saveDateDP;
    @javafx.fxml.FXML
    private TextField staffTF;
    @javafx.fxml.FXML
    private ComboBox<String> gateCB;
    @javafx.fxml.FXML
    private DatePicker loadDateDP;

    @javafx.fxml.FXML
    public void initialize() {
        gateCB.getItems().addAll("Gate A", "Gate B", "VIP Entrance", "Emergency Exit");
        zoneCB.getItems().addAll("North Stand", "South VIP Box", "Field Perimeter", "Media Area");

        staffCol.setCellValueFactory(new PropertyValueFactory<>("staff"));
        gateCol.setCellValueFactory(new PropertyValueFactory<>("gate"));
        zoneCol.setCellValueFactory(new PropertyValueFactory<>("zone"));
        shiftStartCol.setCellValueFactory(new PropertyValueFactory<>("shiftStart"));
        shiftEndCol.setCellValueFactory(new PropertyValueFactory<>("shiftEnd"));

        dutyTV.setPlaceholder(new Label("No duty schedule loaded."));
    }

    @javafx.fxml.FXML
    public void LoadOA(ActionEvent actionEvent) {
        dutyTV.getItems().clear();
        messageL1.setText("");

        LocalDate selectedDate = loadDateDP.getValue();

        if (selectedDate == null) {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setTitle("No Date Selected");
            a.setHeaderText(null);
            a.setContentText("Please select a date before loading the schedule.");
            a.showAndWait();
            return;
        }

        if (selectedDate.isBefore(LocalDate.now())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Invalid Date");
            a.setHeaderText(null);
            a.setContentText("Cannot view schedules for past dates.");
            a.showAndWait();
            return;
        }

        File f = new File("DutySchedule.bin");

        if (!f.exists()) {
            messageL1.setText("No staff scheduled on selected date.");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            boolean found = false;
            boolean useDayShift = true;

            while (true) {
                try {
                    DutySchedule ds = (DutySchedule) ois.readObject();

                    if (ds.getDate().equals(selectedDate)) {
                        if (useDayShift) {
                            ds.setShiftStart("08:00");
                            ds.setShiftEnd("16:00");
                        } else {
                            ds.setShiftStart("16:00");
                            ds.setShiftEnd("00:00");
                        }
                        useDayShift = !useDayShift;
                        dutyTV.getItems().add(ds);
                        found = true;
                    }
                } catch (EOFException e) {
                    break;
                }
            }
            if (!found) {
                messageL1.setText("No staff scheduled on selected date.");
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
        messageL.setText("");

        if (staffTF.getText().isEmpty()
                || gateCB.getValue() == null
                || zoneCB.getValue() == null
                || saveDateDP.getValue() == null) {

            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setTitle("Missing Information");
            a.setHeaderText(null);
            a.setContentText("Please fill up Staff, Gate, Zone and Date before saving.");
            a.showAndWait();
            return;
        }

        try {
            File f = new File("DutySchedule.bin");

            DutySchedule ds = new DutySchedule(
                    staffTF.getText(),
                    gateCB.getValue(),
                    zoneCB.getValue(),
                    "", "",
                    saveDateDP.getValue()
            );

            if (f.exists()) {
                FileOutputStream fos = new FileOutputStream(f, true);
                ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(ds);
                oos.close();
            } else {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(ds);
                oos.close();
            }

            messageL.setText("Duty Schedule Saved");

            staffTF.clear();
            gateCB.getSelectionModel().clearSelection();
            zoneCB.getSelectionModel().clearSelection();
            saveDateDP.setValue(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}