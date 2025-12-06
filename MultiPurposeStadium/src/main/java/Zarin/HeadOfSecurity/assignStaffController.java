package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class assignStaffController
{
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private TableColumn<Assignment, LocalDate> dateCol;
    @javafx.fxml.FXML
    private ComboBox<String> zoneCB;
    @javafx.fxml.FXML
    private TableView<Assignment> assignTV;
    @javafx.fxml.FXML
    private ComboBox<String> gateCB;
    @javafx.fxml.FXML
    private TableColumn<Assignment,String> zoneCol;
    @javafx.fxml.FXML
    private TableColumn<Assignment,String> staffCol;
    @javafx.fxml.FXML
    private TableColumn<Assignment,String> gateCol;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private DatePicker assignmentDateDP;

    @javafx.fxml.FXML
    public void initialize() {
        gateCB.getItems().addAll("Gate A","Gate B","VIP Entrance","Emergency Exit");
        zoneCB.getItems().addAll("North Stand","South VIP Box","Field Perimeter","Media Area");
        staffCol.setCellValueFactory(new PropertyValueFactory<>("staffName"));
        gateCol.setCellValueFactory(new PropertyValueFactory<>("gate"));
        zoneCol.setCellValueFactory(new PropertyValueFactory<>("zone"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

    }

    @javafx.fxml.FXML
    public void assignOA(ActionEvent actionEvent) {
        try {
            File f = new File("Assignment.bin");
            if (f.exists()){
                FileOutputStream fos = new FileOutputStream(f, true);
                ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(new Assignment(nameTF.getText(),zoneCB.getValue(),gateCB.getValue(),assignmentDateDP.getValue()));
                messageL.setText("Staff assigned");
                nameTF.clear();
                zoneCB.getSelectionModel().clearSelection();
                gateCB.getSelectionModel().clearSelection();
                assignmentDateDP.setValue(null);
                oos.close();
            }
            else{
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(new Assignment(nameTF.getText(),zoneCB.getValue(),gateCB.getValue(),assignmentDateDP.getValue()));
                messageL.setText("Staff assigned");
                nameTF.clear();
                zoneCB.getSelectionModel().clearSelection();
                gateCB.getSelectionModel().clearSelection();
                assignmentDateDP.setValue(null);
                oos.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
        assignTV.getItems().clear();

        try {
            FileInputStream fis = new FileInputStream("Assignment.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Assignment a = (Assignment) ois.readObject();
                    assignTV.getItems().add(a);

                } catch (EOFException e) {
                    break;
                }
            }
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}