package Meherun.Client;

import Meherun.CEO.GenericFileManager;
import Meherun.CEO.VIPBenefits;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewVIPBenefitsController
{
    @javafx.fxml.FXML
    private TableView<VIPBenefits> clientBenefitsTableView;
    @javafx.fxml.FXML
    private TableColumn<VIPBenefits, String> clientBenefitsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<VIPBenefits, String> benefitsConditionTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        clientBenefitsTableColumn.setCellValueFactory(new PropertyValueFactory<>("benefit"));
        benefitsConditionTableColumn.setCellValueFactory(new PropertyValueFactory<>("condition"));
        ObservableList<VIPBenefits> benefits = GenericFileManager.readAll(VIPBenefits.class, "VIPBenefits.bin");
        clientBenefitsTableView.setItems(benefits);
    }
}