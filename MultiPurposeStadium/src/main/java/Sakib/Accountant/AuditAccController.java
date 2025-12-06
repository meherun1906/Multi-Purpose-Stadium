package Sakib.Accountant;

import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
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
import java.util.ArrayList;

public class AuditAccController
{
    @javafx.fxml.FXML
    private TableColumn<AuditAcc, Double> amountColFD;
    @javafx.fxml.FXML
    private TableColumn<AuditAcc, Integer> transIdColFD;
    @javafx.fxml.FXML
    private TextField transIdTF;
    @javafx.fxml.FXML
    private TextField transTyprTF;
    @javafx.fxml.FXML
    private TableColumn<AuditAcc, String> transTypeColFD;
    @javafx.fxml.FXML
    private TableColumn<AuditAcc, String> statusColFD;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TableColumn<AuditAcc, LocalDate> dateColFD;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableView<AuditAcc> auditTable;

    @javafx.fxml.FXML
    public void initialize() {
        ArrayList<AuditAcc> auditList = new ArrayList<>();


        transIdColFD.setCellValueFactory(new PropertyValueFactory<>(" transactionId"));
        dateColFD.setCellValueFactory(new PropertyValueFactory<>("date"));
        transTypeColFD.setCellValueFactory(new PropertyValueFactory<>("transactionType"));
        amountColFD.setCellValueFactory(new PropertyValueFactory<>("amount"));


        statusColFD.setCellValueFactory(new PropertyValueFactory<>("status"
                ));

        auditTable = FXCollections.observableArrayList(
                new AuditAcc(1234, LocalDate.parse("2025-12-01"), "Bank Transfer", 15000.0),
                new AuditAcc(2456, LocalDate.parse("2025-12-02"), "Card", 20000.0),
                new AuditAcc(5678, LocalDate.parse("2025-12-03"), "Card", 20000.0)
        );
                auditTable.setItems(auditList);



         ;

        FilteredList<AuditAcc> filtered = new FilteredList<>(auditList, p -> true);

        String idText = transIdTF.getText().trim();
        String typeText = transTyprTF.getText().trim().toLowerCase();
        String amountText = amountTF.getText().trim();
        LocalDate date = dateDP.getValue();

        filtered.setPredicate(item -> {

            if (!idText.isEmpty()) {
                try {
                    int id = Integer.parseInt(idText);
                    if (!item.getTransactionId().equals(id)) return false;
                } catch (NumberFormatException ignored) {
                }
            }

        }
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
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
}