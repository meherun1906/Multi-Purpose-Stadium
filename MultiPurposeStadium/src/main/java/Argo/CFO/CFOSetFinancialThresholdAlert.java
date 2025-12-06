package Argo.CFO;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class CFOSetFinancialThresholdAlert {
    public String name, id, email;
    private String phoneNumber;
    public LocalDate date;
    public Boolean alert;
    private int balance;
    @javafx.fxml.FXML
    private CheckBox noCheckBoxFxId;
    @javafx.fxml.FXML
    private TextField emailTextFieldFxId;
    @javafx.fxml.FXML
    private TextField balanceTextFieldFxId;
    @javafx.fxml.FXML
    private TextField idTextFieldFxId;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField numTextFieldFxId;
    @javafx.fxml.FXML
    private Text alertTextFxId;
    @javafx.fxml.FXML
    private TextField phoneNumberTextFieldFxId;
    @javafx.fxml.FXML
    private CheckBox yesCheckBoxFxId;

    public CFOSetFinancialThresholdAlert(String name, String id, String email, String phoneNumber, LocalDate date, Boolean alert, int balance) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.alert = alert;
        this.balance = balance;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getAlert() {
        return alert;
    }

    public void setAlert(Boolean alert) {
        this.alert = alert;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CFOSetFinancialThresholdAlert{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", date=" + date +
                ", alert=" + alert +
                ", balance=" + balance +
                '}';
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
    }
}
