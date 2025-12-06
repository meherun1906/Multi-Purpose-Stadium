package Sakib.Accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ExpenseRecordAccController
{
    @javafx.fxml.FXML
    private TableColumn<ExpenseRecordAcc, String> typeCol;
    @javafx.fxml.FXML
    private TableColumn<ExpenseRecordAcc, Double> amountCol;
    @javafx.fxml.FXML
    private ComboBox<String> expenseTypeCB;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private TableView<ExpenseRecordAcc> expenseRecordTable;
    @javafx.fxml.FXML
    private Button addExpenseButton;
    @javafx.fxml.FXML
    private Button backButtonER;
    @javafx.fxml.FXML
    private Label alertLabelER;
    @javafx.fxml.FXML
    private TableColumn<ExpenseRecordAcc, String> descriptionCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonER(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addExpenseButton(ActionEvent actionEvent) {
    }
}