package Sakib.Accountant;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class PayrollAccController {
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
        EmployeeIdColFD.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        basicSalaryColFD.setCellValueFactory(new PropertyValueFactory<>("basicSalary"));
        allowanceColFD.setCellValueFactory(new PropertyValueFactory<>("allowance"));
        deductionColFD.setCellValueFactory(new PropertyValueFactory<>("deduction"));
        totalSalaryFD.setCellValueFactory(new PropertyValueFactory<>("totalSalary"));


        payrollTable.setItems(FXCollections.observableArrayList(
                new PayrollAcc("1245", "2378 ", "Sakib", "Accountant"),
                new PayrollAcc("3456", " 9876", "Sadman", "HR")
        ));

    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void salaryCountButton(ActionEvent actionEvent) {
        try {
            double basic = Double.parseDouble(basicSalaryTF.getText());
            double allowance = Double.parseDouble(allowanceTF.getText());
            double deduction = Double.parseDouble(deductionTF.getText());

            double total = (basic + allowance) - deduction;

            totalSalaryTF.setText(String.valueOf(total));
            statusLabel.setText("Salary calculated successfully!");

        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid salary input!");
        }
    }

    @javafx.fxml.FXML
    public void payrollButton(ActionEvent actionEvent) {
    }

    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(
                    getClass().getResource("CheifAccountantDashboard.fxml")
            );
            Stage stage = (Stage) ((Node) actionEvent.getSource())
                    .getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
        }
    }
}