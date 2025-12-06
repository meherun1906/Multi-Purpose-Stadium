package Argo.CFO;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class CFO_ApproveOrRejectFinancialInvestments {
    private String name, id, email, phoneNumber;
    public String reason;
    public LocalDate date;
    public Boolean request, amount;
    @javafx.fxml.FXML
    private Text dateText;
    @javafx.fxml.FXML
    private Text requestText;
    @javafx.fxml.FXML
    private TextField emailTextFieldFxid;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TextField idTextFieldFxid;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextArea reasonTextAreaFxid;
    @javafx.fxml.FXML
    private Text firstView;
    @javafx.fxml.FXML
    private TextField nameTextFieldFxid;
    @javafx.fxml.FXML
    private CheckBox noCheckBox;
    @javafx.fxml.FXML
    private TextField phoneNumberTextFieldFxid;
    @javafx.fxml.FXML
    private CheckBox yesCheckBox;

    public CFO_ApproveOrRejectFinancialInvestments(String name, String id, String email, String phoneNumber, String reason, LocalDate date, Boolean request, Boolean amount) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.reason = reason;
        this.date = date;
        this.request = request;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getRequest() {
        return request;
    }

    public void setRequest(Boolean request) {
        this.request = request;
    }

    public Boolean getAmount() {
        return amount;
    }

    public void setAmount(Boolean amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CFO_ApproveOrRejectFinancialInvestments{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", reason='" + reason + '\'' +
                ", date=" + date +
                ", request=" + request +
                ", amount=" + amount +
                '}';
    }

    @javafx.fxml.FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
    }
}
