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
import java.util.ArrayList;

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
        ArrayList<FinancialStatementAcc> financialList = new ArrayList<>();

        recordIdColFD.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        yearColFD.setCellValueFactory(new PropertyValueFactory<>("'year"));
        monthColFD.setCellValueFactory(new PropertyValueFactory<>("month"));

        financialStatTable.setItems(FXCollections.observableArrayList(
                new FinancialStatementAcc(1, "January", 2025, 12000, 8000, 4000),
                new FinancialStatementAcc(2, "February", 2025, 15000, 5000, 10000),
                new FinancialStatementAcc(3, "March", 2025, 10000, 3000, 7000)
                financialStatTable.setItems(financialList);
        ));

        monthCB.setItems(FXCollections.observableArrayList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        ));

        yearCB.setItems(FXCollections.observableArrayList(2023, 2024, 2025, 2026));
    }


    }


    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {

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
        }
        catch (IOException e) {
        }

    }
