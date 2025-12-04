package Argo.CFO;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class CFOBudgetRequest {
    private String name, phoneNumber, email, justification;
    public Integer amount;
    public LocalDate date;
    @javafx.fxml.FXML
    private TextField numFxId;
    @javafx.fxml.FXML
    private TextField emailFxId;
    @javafx.fxml.FXML
    private TextField phoneNumberFxId;
    @javafx.fxml.FXML
    private TextArea justificationFxId;
    @javafx.fxml.FXML
    private TextField amountFxId;
    @javafx.fxml.FXML
    private Label requestFxId;
    @javafx.fxml.FXML
    private DatePicker datepickerFxId;
    @javafx.fxml.FXML
    private Text amountlabel;

    public CFOBudgetRequest(String name, String phoneNumber, String mail, String justification, Integer amount, LocalDate date) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = mail;
        this.justification = justification;
        this.amount = amount;
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

    public String getMail() {
        return email;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CFOBudgetRequest{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mail='" + email + '\'' +
                ", justification='" + justification + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    @javafx.fxml.FXML
    public void SubmitOnAction(ActionEvent actionEvent) {
    }
}
