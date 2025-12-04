package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class reportIncidentController
{
    @javafx.fxml.FXML
    private TableColumn<Incident,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn<Incident,String> typeCol;
    @javafx.fxml.FXML
    private ComboBox<String> locationCB;
    @javafx.fxml.FXML
    private TableColumn<Incident,String> statusCol;
    @javafx.fxml.FXML
    private TableView<Incident> incidentTV;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private TextField descTF;
    @javafx.fxml.FXML
    private DatePicker reportDP;
    @javafx.fxml.FXML
    private Label messageL;

    @javafx.fxml.FXML
    public void initialize() {
        locationCB.getItems().addAll(
                "Gate A",
                "East Parking",
                "VIP Lounge",
                "Field Tunnel"
        );
        typeCB.getItems().addAll(
                "Trespass",
                "Disturbance",
                "Medical",
                "Suspicious Item"
        );
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        reportDP.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void submitOA(ActionEvent actionEvent) {
        messageL.setText("");

        String location = locationCB.getValue();
        String type = typeCB.getValue();
        String desc = descTF.getText();
        LocalDate date = reportDP.getValue();

        if (location == null
                || type == null
                || date == null
                || desc == null
                || desc.trim().isEmpty()
                || desc.length() > 200) {

            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setTitle("Invalid Incident Report");
            a.setHeaderText(null);

            if (location == null || type == null || date == null) {
                a.setContentText("Please select Location, Type and Date.");
            } else if (desc == null || desc.trim().isEmpty()) {
                a.setContentText("Description cannot be empty.");
            } else if (desc.length() > 200) {
                a.setContentText("Description must be 200 characters or less.");
            } else {
                a.setContentText("Please check all fields.");
            }
            a.showAndWait();
            return;
        }
        try {
            File f = new File("Incident.bin");
            Incident ir = new Incident(
                    location,
                    type,
                    desc,
                    date,
                    "Reported"
            );
            if (f.exists()) {
                FileOutputStream fos = new FileOutputStream(f, true);
                ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(ir);
                oos.close();
            } else {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(ir);
                oos.close();
            }
            incidentTV.getItems().add(ir);
            messageL.setText("Incident reported.");
            locationCB.getSelectionModel().clearSelection();
            typeCB.getSelectionModel().clearSelection();
            descTF.clear();
            reportDP.setValue(LocalDate.now());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}