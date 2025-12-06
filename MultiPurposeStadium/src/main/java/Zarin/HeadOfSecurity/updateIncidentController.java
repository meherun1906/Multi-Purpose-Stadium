package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;

public class updateIncidentController
{
    @javafx.fxml.FXML
    private TableColumn<Incident,String> typeCol;
    @javafx.fxml.FXML
    private ComboBox<String> newStatusCB;
    @javafx.fxml.FXML
    private TableColumn<Incident,String> statusCol;
    @javafx.fxml.FXML
    private TableView<Incident> activeIncidentTV;
    @javafx.fxml.FXML
    private TableColumn<Incident,String> incIDCol;
    @javafx.fxml.FXML
    private ComboBox<String> selectIncCB;
    @javafx.fxml.FXML
    private TableColumn<Incident,String> locationCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateOA(ActionEvent actionEvent) {
    }
}