package Meherun.CEO;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

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
        policyTableColumn.setCellValueFactory(new PropertyValueFactory<>("policy"));
        policyIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("policyId"));

        ObservableList<DepartmentalPolicy> added = GenericFileManager.readAll(DepartmentalPolicy.class, "DepartmentalPolicies.bin");
        policyTableView.setItems(added);
    }
    private boolean isDuplicatePolicyId(String id) {
        ObservableList<DepartmentalPolicy> list =
                GenericFileManager.readAll(DepartmentalPolicy.class, "DepartmentalPolicies.bin");

        for (DepartmentalPolicy dp : list) {
            if (dp.getPolicyId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @javafx.fxml.FXML
    public void addPolicyButtonOnAction(ActionEvent actionEvent) {
        if (departmentComboBox.getValue() == null ||
                policyIdTextField.getText().isEmpty()
                || policyTextArea.getText().isEmpty()){
            Alert alert = new Alert (Alert.AlertType.INFORMATION);
            alert.setTitle("Validation Error");
            alert.setContentText("All fields must be filled.");
            alert.showAndWait();
            return;
        }

        String enteredID = policyIdTextField.getText().trim();
        if (isDuplicatePolicyId(enteredID)) {
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Varification Error");
            alert1.setContentText("Policy ID already exists.");
            alert1.showAndWait();
            return;
        }

        DepartmentalPolicy p = new DepartmentalPolicy(
                departmentComboBox.getValue(),
                policyTextArea.getText(),
                policyIdTextField.getText());

        GenericFileManager.append(p, "DepartmentalPolicies.bin");
        policyTableView.getItems().add(p);
}}