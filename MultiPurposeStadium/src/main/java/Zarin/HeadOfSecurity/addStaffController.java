package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class addStaffController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ComboBox<String> roleCB;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TableView<Staff> saveTV;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> contactCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> emailCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> roleCol;
    @javafx.fxml.FXML
    private TextField contactTF;
    @javafx.fxml.FXML
    private TableColumn<Staff,Integer> idCol;
    @javafx.fxml.FXML
    private TextField staffIDTF;
    @javafx.fxml.FXML
    private Label messageL;

    @javafx.fxml.FXML
    public void initialize() {
        roleCB.getItems().addAll("Gate Officer","Patrol","CCTV Monitor","Supervisor");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        roleCol.setCellValueFactory(new PropertyValueFactory<>("role"));
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contact"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
    }

    @javafx.fxml.FXML
    public void saveStaffOA(ActionEvent actionEvent) {
        try {
            File f = new File("Staff.bin");
            if (f.exists()){
                FileOutputStream fos = new FileOutputStream(f, true);
                ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(new Staff(staffIDTF.getText(),nameTF.getText(),roleCB.getValue(),contactTF.getText(),emailTF.getText()));
                messageL.setText("Staff Saved");
                staffIDTF.clear();
                nameTF.clear();
                roleCB.getSelectionModel().clearSelection();
                contactTF.clear();
                emailTF.clear();
                oos.close();
            }
            else{
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(new Staff(staffIDTF.getText(),nameTF.getText(),roleCB.getValue(),contactTF.getText(),emailTF.getText()));
                messageL.setText("Staff Saved");
                staffIDTF.clear();
                nameTF.clear();
                roleCB.getSelectionModel().clearSelection();
                contactTF.clear();
                emailTF.clear();
                oos.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void loadStaffOA(ActionEvent actionEvent) {
        saveTV.getItems().clear();

        try {
            FileInputStream fis = new FileInputStream("Staff.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Staff s = (Staff) ois.readObject();
                    saveTV.getItems().add(s);

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