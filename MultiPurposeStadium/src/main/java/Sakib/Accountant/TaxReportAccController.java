package Sakib.Accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TaxReportAccController
{
    @javafx.fxml.FXML
    private DatePicker toDateDP;
    @javafx.fxml.FXML
    private TextField reportIdTF;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private TextField incomeTF;
    @javafx.fxml.FXML
    private TextField statusTF;
    @javafx.fxml.FXML
    private TextField taxAmountTF;
    @javafx.fxml.FXML
    private TableView<TaxReportAcc> taxReportTable;
    @javafx.fxml.FXML
    private TableColumn<TaxReportAcc, Double> taxAmountColFD;
    @javafx.fxml.FXML
    private TableColumn<TaxReportAcc, String> statusColFD;
    @javafx.fxml.FXML
    private TableColumn<TaxReportAcc, Integer> reportIdColFD;
    @javafx.fxml.FXML
    private TableColumn<TaxReportAcc, String> dateColFD;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitReportButton(ActionEvent actionEvent) {
    }
}