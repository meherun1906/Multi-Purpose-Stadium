package Argo.CFO;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class CFO_approve_reject_facility {
    private String request, amount;
    public String reason;
    public LocalDate date;
    @javafx.fxml.FXML
    private AnchorPane dateFxId;

    public CFO_approve_reject_facility(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CFO_approve_reject_facility{" +
                "date=" + date +
                '}';
    }

    @javafx.fxml.FXML
    private CheckBox yesFxId;
    @javafx.fxml.FXML
    private TextField requestFxId;
    @javafx.fxml.FXML
    private CheckBox noFxId;
    @javafx.fxml.FXML
    private TextArea reasonFxId;
    @javafx.fxml.FXML
    private TextField ammountFxId;
    @javafx.fxml.FXML
    private Label labelFxId;
    @javafx.fxml.FXML
    private ComboBox moneyComboBox;

    public CFO_approve_reject_facility(String request, String amount, String reason) {
        this.request = request;
        this.amount = amount;
        this.reason = reason;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @javafx.fxml.FXML
    public void submitOnaction(ActionEvent actionEvent) {
    }
}