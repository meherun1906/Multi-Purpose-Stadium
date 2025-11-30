package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;

public class staffListFilterViewController
{
    @javafx.fxml.FXML
    private TextField searchNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> filterRoleCB;
    @javafx.fxml.FXML
    private TableColumn<Staff,Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> contactCol;
    @javafx.fxml.FXML
    private TextField searchIdTF;
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
    }

    @javafx.fxml.FXML
    public void showAllOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterOA(ActionEvent actionEvent) {
    }
}