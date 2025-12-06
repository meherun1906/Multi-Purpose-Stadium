package Zarin.MaintenanceManager;
import javafx.scene.control.*;
import javafx.event.*;

public class filterSupplyController
{
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,Integer> qtyCol;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,String> statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> filFacCB;
    @javafx.fxml.FXML
    private TableView<SupplyItem> supplyTV;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,String> itemCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filOA(ActionEvent actionEvent) {
    }
}