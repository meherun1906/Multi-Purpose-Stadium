package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class staffListFilterViewController
{
    @javafx.fxml.FXML
    private TextField searchNameTF;
    @javafx.fxml.FXML
    private TableColumn<Staff,Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> contactCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> emailCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> roleCol;
    @javafx.fxml.FXML
    private TableView<Staff> filterSearchStaffTV;

    @javafx.fxml.FXML
    public void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        roleCol.setCellValueFactory(new PropertyValueFactory<>("role"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contact"));
    }


    @javafx.fxml.FXML
    public void filterOA(ActionEvent actionEvent) {
        filterSearchStaffTV.getItems().clear();

        try {
            FileInputStream fis = new FileInputStream("Staff.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Staff s = (Staff) ois.readObject();
                    if (s.getName().equals(searchNameTF.getText())){
                        filterSearchStaffTV.getItems().add(s);
                    }
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