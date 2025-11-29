package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;

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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitOA(ActionEvent actionEvent) {
    }
}