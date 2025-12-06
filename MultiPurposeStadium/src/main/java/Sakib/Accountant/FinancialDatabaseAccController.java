package Sakib.Accountant;

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
import java.time.LocalDate;

public class FinancialDatabaseAccController {
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
        reportIdCol.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));

        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));

        databaseTable.setItems(FXCollections.observableArrayList(
                new FinancialDatabaseAcc("1245", "Client Payment", "12000.0", "2025-1-5"),
                new FinancialDatabaseAcc("3456", "Office Supplies", "15000.00", "2025-11-8 "),
                new FinancialDatabaseAcc("9876", "Service Charge", "1600.00", "2025-11-15")
        ));
        typeCB.setItems(FXCollections.observableArrayList("Income", "Expense"));
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        if (typeCB.getValue() == null ||
                amountTF.getText().isEmpty() ||
                dateDP.getValue() == null ||
                descriptionTA.getText().isEmpty()) {

            showAlert("Validation Error", "All fields must be filled!");
            return;
        }

        public void backButton (ActionEvent actionEvent){
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
}