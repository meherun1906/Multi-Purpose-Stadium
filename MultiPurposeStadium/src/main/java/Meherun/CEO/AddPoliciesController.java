package Meherun.CEO;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddPoliciesController
{
    @javafx.fxml.FXML
    private TableView<DepartmentalPolicy> policyTableView;
    @javafx.fxml.FXML
    private TableColumn<DepartmentalPolicy, String> policyIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<DepartmentalPolicy, String> policyTableColumn;
    @javafx.fxml.FXML
    private TextField policyIdTextField;
    @javafx.fxml.FXML
    private TextArea policyTextArea;
    @javafx.fxml.FXML
    private TableColumn<DepartmentalPolicy, String> departmentTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> departmentComboBox;
    @javafx.fxml.FXML
    private Label addPolicyMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        departmentComboBox.getItems().addAll("Event Management", "Human Resource", "Facilities & Maintenance", "Finance & Accounts");
        departmentTableColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        policyIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("policyId"));
        policyTableColumn.setCellValueFactory(new PropertyValueFactory<>("policy"));

    }

    @javafx.fxml.FXML
    public void addPolicyButtonOnAction(ActionEvent actionEvent) {
        
    }
}