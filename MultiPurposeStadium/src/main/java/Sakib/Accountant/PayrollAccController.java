package Sakib.Accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PayrollAccController
{
    @javafx.fxml.FXML
    private TableColumn<PayrollAcc, Double> allowanceColFD;
    @javafx.fxml.FXML
    private TableColumn<PayrollAcc, Double> totalSalaryFD;
    @javafx.fxml.FXML
    private TableView<PayrollAcc> payrollTable;
    @javafx.fxml.FXML
    private TextField allowanceTF;
    @javafx.fxml.FXML
    private TableColumn<PayrollAcc, Integer> EmployeeIdColFD;
    @javafx.fxml.FXML
    private TableColumn<PayrollAcc, Double> deductionColFD;
    @javafx.fxml.FXML
    private TextField basicSalaryTF;
    @javafx.fxml.FXML
    private TextField employeeIdTF;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField totalSalaryTF;
    @javafx.fxml.FXML
    private TableColumn<PayrollAcc, Double> basicSalaryColFD;
    @javafx.fxml.FXML
    private TextField deductionTF;
    @javafx.fxml.FXML
    private TextField designationTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void salaryCountButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void payrollButton(ActionEvent actionEvent) {
    }
}