package Sakib.HRManager;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SalaryProcessingHRController
{
    @javafx.fxml.FXML
    private TableColumn<SalaryProcessingHR, Integer> empIdCol;
    @javafx.fxml.FXML
    private TableColumn<SalaryProcessingHR, Integer> payIdcol;
    @javafx.fxml.FXML
    private TableColumn<SalaryProcessingHR, Integer> empNameCol;
    @javafx.fxml.FXML
    private TextField empIdTF;
    @javafx.fxml.FXML
    private TextField empNameTF;
    @javafx.fxml.FXML
    private TableView<SalaryProcessingHR> SalaryProcessTable;
    @javafx.fxml.FXML
    private TextField payIdTF;

    @javafx.fxml.FXML
    public void initialize() {
        empIdCol.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        payIdcol.setCellValueFactory(new PropertyValueFactory<>("payrollId"));
        empNameCol.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
    }

    @javafx.fxml.FXML
    public void salaryProcessButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void salaryBackButton(ActionEvent actionEvent) {
        System.out.println("Back button clicked – implement navigation here.");

    }
}