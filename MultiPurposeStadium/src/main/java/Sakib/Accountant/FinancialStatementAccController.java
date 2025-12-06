package Sakib.Accountant;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class FinancialStatementAccController
{
    @javafx.fxml.FXML
    private ComboBox<String> monthCB;
    @javafx.fxml.FXML
    private ComboBox<Integer> yearCB;
    @javafx.fxml.FXML
    private TableColumn<FinancialStatementAcc, Integer> recordIdColFD;
    @javafx.fxml.FXML
    private TextField recordIdTF;
    @javafx.fxml.FXML
    private TableView<FinancialStatementAcc> financialStatTable;
    @javafx.fxml.FXML
    private TableColumn<FinancialStatementAcc, Integer> yearColFD;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<FinancialStatementAcc, String> monthColFD;

    @javafx.fxml.FXML
    public void initialize() {



}

    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {


    }

    }
