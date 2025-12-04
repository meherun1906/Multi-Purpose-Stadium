package Argo.CFO;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CFO_approve_reject_facility {
    private String request, amount;
    public String reason;
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

    @Override
    public String toString() {
        return "CFO_approve_reject_facility{" +
                "request='" + request + '\'' +
                ", amount='" + amount + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    public void submitOnaction(ActionEvent actionEvent) {
    }
}