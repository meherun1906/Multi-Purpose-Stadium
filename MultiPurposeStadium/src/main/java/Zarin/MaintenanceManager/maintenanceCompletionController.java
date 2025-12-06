package Zarin.MaintenanceManager;
import javafx.scene.control.*;
import javafx.event.*;

public class maintenanceCompletionController
{
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask,String> areaCol;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask,String> taskCol;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask,String> statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private ComboBox<String> remarkCB;
    @javafx.fxml.FXML
    private TableView<MaintenanceTask> taskTV;
    @javafx.fxml.FXML
    private ComboBox<String> taskCB;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask,String> assignCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
    }
}