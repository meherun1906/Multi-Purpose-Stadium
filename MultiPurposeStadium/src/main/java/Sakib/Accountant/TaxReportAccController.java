package Sakib.Accountant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

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

    private javafx.collections.ObservableList<TaxReportAcc> taxList = javafx.collections.FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void initialize() {
        reportIdColFD.setCellValueFactory(new PropertyValueFactory<>("reportId"));

        // Show date range as: "2025-01-01 to 2025-01-30"
        dateColFD.setCellValueFactory(cell -> {
            LocalDate from = cell.getValue().getFromDate();
            LocalDate to = cell.getValue().getToDate();
            return new javafx.beans.property.SimpleStringProperty(from + " to " + to);
        });

        taxAmountColFD.setCellValueFactory(new PropertyValueFactory<>("taxAmount"));
        statusColFD.setCellValueFactory(new PropertyValueFactory<>("status"));

        taxReportTable.setItems(FXCollections.observableArrayList(
                new TaxReportAcc("5678",  "2025-01-01", "2025-06-01 ", " 50000"),
                new TaxReportAcc("500", "2025-06-02", "2025-12-04", "100000 "),
                new TaxReportAcc("750", "2024-12-03", "2025-03-01", "50000"));

        taxReportTable.setItems(taxList);
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {
        LocalDate from = fromDateDP.getValue();
        LocalDate to = toDateDP.getValue();

        if (from == null || to == null) {
            return;
        }

        ObservableList<TaxReportAcc> filtered = FXCollections.observableArrayList();

        for (TaxReportAcc r : taxList) {
            boolean insideRange =
                    ( !r.getFromDate().isAfter(to) ) &&
                            ( !r.getToDate().isBefore(from) );

            if (insideRange) {
                filtered.add(r);
            }
        }

        taxReportTable.setItems(filtered);
    }

    @javafx.fxml.FXML
    public void submitReportButton(ActionEvent actionEvent) {
        int id = Integer.parseInt(reportIdTF.getText());
        LocalDate from = fromDateDP.getValue();
        LocalDate to = toDateDP.getValue();
        double taxAmount = Double.parseDouble(taxAmountTF.getText());
        String status = statusTF.getText();

        TaxReportAcc newReport = new TaxReportAcc(id, from, to, taxAmount, status);
        taxList.add(newReport);

        taxReportTable.setItems(taxList);
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
}}