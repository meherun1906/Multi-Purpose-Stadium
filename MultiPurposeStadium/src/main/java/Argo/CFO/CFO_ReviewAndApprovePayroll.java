package Argo.CFO;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class CFO_ReviewAndApprovePayroll {
    private String name, phoneNumber, email, Id;
    public String balance;
    public LocalDate date;
    public Boolean review, payroll;
    @javafx.fxml.FXML
    private CheckBox goodreviewComboBoxFxid;
    @javafx.fxml.FXML
    private TextField emailTextFieldFxid;
    @javafx.fxml.FXML
    private TextArea loadViewtextAreaFxid;
    @javafx.fxml.FXML
    private CheckBox averagereviewComboBoxFxid;
    @javafx.fxml.FXML
    private TextField balanceShowTextFieldFxid;
    @javafx.fxml.FXML
    private TextField rollTextFieldFxid;
    @javafx.fxml.FXML
    private TextField idTextFieldFxid;
    @javafx.fxml.FXML
    private TextField numTextFieldFxid;
    @javafx.fxml.FXML
    private Text balanceTextFxid;
    @javafx.fxml.FXML
    private Text dateTextFxid;
    @javafx.fxml.FXML
    private TextField phoneNumberTextFieldFxid;
    @javafx.fxml.FXML
    private DatePicker datePickerFxid;
    @javafx.fxml.FXML
    private Text reviewTextFieldFxid;
    @javafx.fxml.FXML
    private Label fastLabelFxid;
    @javafx.fxml.FXML
    private CheckBox notGoodreviewComboBoxFxid;


    public CFO_ReviewAndApprovePayroll(String name, String phoneNumber, String email, String id, String balance, LocalDate date, Boolean review, Boolean payroll) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        Id = id;
        this.balance = balance;
        this.date = date;
        this.review = review;
        this.payroll = payroll;
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

    public Boolean getReview() {
        return review;
    }

    public void setReview(Boolean review) {
        this.review = review;
    }

    public Boolean getPayroll() {
        return payroll;
    }

    public void setPayroll(Boolean payroll) {
        this.payroll = payroll;
    }

    @Override
    public String toString() {
        return "CFO_ReviewAndApprovePayroll{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", Id='" + Id + '\'' +
                ", balance='" + balance + '\'' +
                ", date=" + date +
                ", review=" + review +
                ", payroll=" + payroll +
                '}';
    }

    @javafx.fxml.FXML
    public void addOnAction(ActionEvent actionEvent) {
    }
}
