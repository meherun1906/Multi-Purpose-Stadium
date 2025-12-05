package Argo.CFO;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class CFO_RealTimeCashFlow {
    private String name, phoneNumber, email, Id;
    public String balance, cashFlow;
    public LocalDate date;
    @javafx.fxml.FXML
    private TextField numTextfield;
    @javafx.fxml.FXML
    private ComboBox listComboBox;
    @javafx.fxml.FXML
    private Text currentFlowFxId;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private TextField emailTextfield;
    @javafx.fxml.FXML
    private DatePicker datepickerFxId;
    @javafx.fxml.FXML
    private TextField phoneNumberTextfield;

    public CFO_RealTimeCashFlow(String name, String phoneNumber, String email, String id, String balance, String cashFlow, LocalDate date) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        Id = id;
        this.balance = balance;
        this.cashFlow = cashFlow;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(String cashFlow) {
        this.cashFlow = cashFlow;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CFO_RealTimeCashFlow{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", Id='" + Id + '\'' +
                ", balance='" + balance + '\'' +
                ", cashFlow='" + cashFlow + '\'' +
                ", date=" + date +
                '}';
    }

    @javafx.fxml.FXML
    public void addOnAction(ActionEvent actionEvent) {
    }
}
