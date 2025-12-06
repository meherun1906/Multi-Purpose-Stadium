package Argo.CFO;

import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class CFO_EnsureTimelyPaymentOfBills {
    private String name, phoneNumber, email, Id;
    public String balance;
    public LocalDate date;
    public Boolean payment;
    @javafx.fxml.FXML
    private Button addOnAction;
    @javafx.fxml.FXML
    private TextField emailTextFieldFxid;
    @javafx.fxml.FXML
    private TextField paymmentListTextFieldFxid;
    @javafx.fxml.FXML
    private TextField balanceTextFieldFxid;
    @javafx.fxml.FXML
    private TextField PhoneNumberTextFieldFxid;
    @javafx.fxml.FXML
    private TextField idTextFieldFxid;
    @javafx.fxml.FXML
    private TextField nameTextFieldFxid;
    @javafx.fxml.FXML
    private Text dateTextFxid;
    @javafx.fxml.FXML
    private DatePicker datePickerFxid;
    @javafx.fxml.FXML
    private Label fastLabelFxid;
    @javafx.fxml.FXML
    private TextArea loadViewtextAreaFxid;

    public CFO_EnsureTimelyPaymentOfBills(String name, String phoneNumber, String email, String id, String balance, LocalDate date, Boolean payment) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        Id = id;
        this.balance = balance;
        this.date = date;
        this.payment = payment;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getPayment() {
        return payment;
    }

    public void setPayment(Boolean payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "CFO_EnsureTimelyPaymentOfBills{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", Id='" + Id + '\'' +
                ", balance='" + balance + '\'' +
                ", date=" + date +
                ", payment=" + payment +
                '}';
    }
}
