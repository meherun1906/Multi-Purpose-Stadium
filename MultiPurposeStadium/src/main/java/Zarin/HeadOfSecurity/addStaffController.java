package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;

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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveStaffOA(ActionEvent actionEvent) {
    }
}