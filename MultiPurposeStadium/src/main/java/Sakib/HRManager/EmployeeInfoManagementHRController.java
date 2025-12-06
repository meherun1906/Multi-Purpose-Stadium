package Sakib.HRManager;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeInfoManagementHRController {

    @javafx.fxml.FXML
    private TextArea addressTA;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField salaryTF;
    @javafx.fxml.FXML
    private Label alertLabelEmp;
    @javafx.fxml.FXML
    private TextField departmentTF;
    @javafx.fxml.FXML
    private TableColumn<EmployeeInfoHR, String> idCol;
    @javafx.fxml.FXML
    private TableColumn<EmployeeInfoHR, String> deptCol;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TableView<EmployeeInfoHR> employeeTable;
    @javafx.fxml.FXML
    private TableColumn<EmployeeInfoHR, String> nameCol;
    @javafx.fxml.FXML
    private TextField jobTitleTF;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private Button saveButton;

    @javafx.fxml.FXML
    public void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        deptCol.setCellValueFactory(new PropertyValueFactory<>("department"));

        employeeTable.setItems(FXCollections.observableArrayList(
                new EmployeeInfoHR("101", "Carlo Ancelotti", "HR",
                        "Road 1, City A", "01711111111", "doncarlo@gmail.com",
                        "HR Manager", "60000"),
                new EmployeeInfoHR("102", "Karim Benzema", "Finance",
                        "Road 2, City B", "01822222222", "benzema@gmail.com",
                        "Accountant", "55000"),
                new EmployeeInfoHR("103", "Cristiano Ronaldo", "Operations",
                        "Road 3, City C", "01933333333", "cr7goat@gmail.com",
                        "Operations Officer", "50000")
        ));

        alertLabelEmp.setText("");

        employeeTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                loadEmployeeDetails(newSel);
            }
        });
    }

    private void loadEmployeeDetails(EmployeeInfoHR emp) {
        idTF.setText(emp.getId());
        nameTF.setText(emp.getName());
        addressTA.setText(emp.getAddress());
        phoneTF.setText(emp.getPhone());
        emailTF.setText(emp.getEmail());
        departmentTF.setText(emp.getDepartment());
        jobTitleTF.setText(emp.getJobTitle());
        salaryTF.setText(emp.getSalary());
        alertLabelEmp.setText("Employee details loaded. You can edit and click Save.");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        switchScene("HRDashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        EmployeeInfoHR selected = employeeTable.getSelectionModel().getSelectedItem();

        if (selected == null) {
            alertLabelEmp.setText("Please select an employee from the list.");
            return;
        }

        String id = idTF.getText();
        String name = nameTF.getText();
        String address = addressTA.getText();
        String phone = phoneTF.getText();
        String email = emailTF.getText();
        String dept = departmentTF.getText();
        String jobTitle = jobTitleTF.getText();
        String salary = salaryTF.getText();

        if (id == null || id.isEmpty() || !id.matches("\\d+")) {
            alertLabelEmp.setText("Please enter a valid numeric ID.");
            return;
        }
        if (phone == null || phone.isEmpty() || !phone.matches("\\d+")) {
            alertLabelEmp.setText("Please enter a valid numeric phone number.");
            return;
        }
        if (name == null || name.isEmpty()) {
            alertLabelEmp.setText("Please enter the employee name.");
            return;
        }

        selected.setId(id);
        selected.setName(name);
        selected.setAddress(address);
        selected.setPhone(phone);
        selected.setEmail(email);
        selected.setDepartment(dept);
        selected.setJobTitle(jobTitle);
        selected.setSalary(salary);

        employeeTable.refresh();

        alertLabelEmp.setText("Employee information saved successfully.");
    }

    private void switchScene(String fxmlFileName, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
            Stage stage = (Stage) ((Node) event.getSource())
                    .getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
        }
    }
}
