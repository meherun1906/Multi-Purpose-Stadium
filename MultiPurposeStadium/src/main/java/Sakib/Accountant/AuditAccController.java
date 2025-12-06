package Sakib.Accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

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
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}