package Sakib.Accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class FinancialDatabaseAccController
{
    @javafx.fxml.FXML
    private TableColumn<FinancialDatabaseAcc, String> typeCol;
    @javafx.fxml.FXML
    private TableColumn<FinancialDatabaseAcc, Double> amountCol;
    @javafx.fxml.FXML
    private TableColumn<FinancialDatabaseAcc, LocalDate> dateCol;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private TextField reportIdTF;
    @javafx.fxml.FXML
    private TableView<FinancialDatabaseAcc> databaseTable;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TableColumn<FinancialDatabaseAcc, Integer> reportIdCol;
    @javafx.fxml.FXML
    private TableColumn<FinancialDatabaseAcc, String> descriptionCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }
}