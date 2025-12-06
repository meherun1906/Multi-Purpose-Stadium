package Meherun.CEO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class RemovePoliciesController
{
    @javafx.fxml.FXML
    private TableView<DepartmentalPolicy> policyTableView;
    @javafx.fxml.FXML
    private TableColumn<DepartmentalPolicy, String> policyIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<DepartmentalPolicy, String> policyTableColumn;
    @javafx.fxml.FXML
    private TextField removePolicyIdTF;
    @javafx.fxml.FXML
    private TableColumn<DepartmentalPolicy, String> departmentTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectDepartmentCB;
    @javafx.fxml.FXML
    private Label removePolicyMessageLabel;

    ObservableList<DepartmentalPolicy> dpList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        selectDepartmentCB.getItems().addAll("Event Management", "Human Resource", "Facilities & Maintenance", "Finance & Accounts");
        departmentTableColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        policyTableColumn.setCellValueFactory(new PropertyValueFactory<>("policy"));
        policyIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("policyId"));

        ObservableList<DepartmentalPolicy> added = GenericFileManager.readAll(DepartmentalPolicy.class, "DepartmentalPolicies.bin");
        policyTableView.setItems(added);
    }

    @javafx.fxml.FXML
    public void viewPoliciesButtonOnAction(ActionEvent actionEvent) {
        if (selectDepartmentCB.getValue() == null ){
            removePolicyMessageLabel.setText("Please select a Department.");
            return;
        }
        policyTableView.getItems().clear();

        dpList = GenericFileManager.readAll(DepartmentalPolicy.class, "DepartmentalPolicies.bin");
        String selectedDepartment = selectDepartmentCB.getValue();
        for (DepartmentalPolicy p : dpList){
            if (selectedDepartment.equals(p.getDepartment())){
                policyTableView.getItems().add(p);
            }
        }
    }

    @javafx.fxml.FXML
    public void removePolicyButtonOnAction(ActionEvent actionEvent) {
        if (removePolicyIdTF.getText().isEmpty()){
            removePolicyMessageLabel.setText("Please enter ID to remove policy.");
            return;
        }

        dpList = GenericFileManager.readAll(DepartmentalPolicy.class, "DepartmentalPolicies.bin");
        String selectedPolicy = removePolicyIdTF.getText();
        try {
            for (DepartmentalPolicy p : dpList){
                if (selectedPolicy.equals(p.getPolicyId())){
                    dpList.remove(p);
                    policyTableView.getItems().remove(p);
                    removePolicyMessageLabel.setText("Policy successfully removed.");
                    policyTableView.getItems().clear();
                    policyTableView.getItems().addAll(dpList);
                    GenericFileManager.writeAll(dpList, "DepartmentalPolicies.bin");
                }
            }
        } catch (Exception e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
}