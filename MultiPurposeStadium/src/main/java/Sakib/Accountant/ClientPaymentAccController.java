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

public class ClientPaymentAccController
{
    @javafx.fxml.FXML
    private TableView<ClientPayment> cpTable;
    @javafx.fxml.FXML
    private TableColumn<ClientPayment, String> amountColCP;
    @javafx.fxml.FXML
    private TableColumn<ClientPayment, String> dateColCP;
    @javafx.fxml.FXML
    private TableColumn<ClientPayment, String> methodColCP;
    @javafx.fxml.FXML
    private TableColumn<ClientPayment, String> statusColCP;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private Label alertlabel;
    @javafx.fxml.FXML
    private Button editbutton;
    @javafx.fxml.FXML
    private Button confirmbutton;

    @javafx.fxml.FXML
    public void initialize() {
        amountColCP.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateColCP.setCellValueFactory(new PropertyValueFactory<>("date"));
        methodColCP.setCellValueFactory(new PropertyValueFactory<>("method"));
        statusColCP.setCellValueFactory(new PropertyValueFactory<>("status"));

        cpTable.setItems(FXCollections.observableArrayList(
                new ClientPayment("1000", "2025-12-01", "Bank Transfer", "Not Confirmed"),
                new ClientPayment("500", "2025-12-02", "Cash", "Not Confirmed"),
                new ClientPayment("750", "2025-12-03", "Card", "Confirmed")
        ));

        statusCB.getItems().addAll("Confirmed", "Not Confirmed");
        statusCB.setDisable(true);

        editbutton.setDisable(true);
        confirmbutton.setDisable(true);

        alertlabel.setText("");

        cpTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                editbutton.setDisable(false);
            } else {
                editbutton.setDisable(true);
                confirmbutton.setDisable(true);
                statusCB.setDisable(true);
            }
        });
    }

    @javafx.fxml.FXML
    public void editButton(ActionEvent actionEvent) {
        ClientPayment selected = cpTable.getSelectionModel().getSelectedItem();

        if (selected == null) {
            alertlabel.setText("Please select a row first.");
            return;
        }

        statusCB.setDisable(false);
        statusCB.setValue(selected.getStatus());
        confirmbutton.setDisable(false);

        alertlabel.setText("Choose a status and click Confirm.");
    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
        ClientPayment selected = cpTable.getSelectionModel().getSelectedItem();
        String newStatus = statusCB.getValue();

        if (selected == null) {
            alertlabel.setText("Please select a row first.");
            return;
        }

        if (newStatus == null || newStatus.isEmpty()) {
            alertlabel.setText("Please select a status.");
            return;
        }

        selected.setStatus(newStatus);
        cpTable.refresh();

        alertlabel.setText("Status updated to: " + newStatus);

        statusCB.setDisable(true);
        confirmbutton.setDisable(true);
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
