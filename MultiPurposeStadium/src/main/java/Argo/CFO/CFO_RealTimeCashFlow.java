package Argo.CFO;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class CFO_RealTimeCashFlow {
    private String name, phoneNumber, email, Id;
    public String balance, cashFlow;
    public LocalDate date;
    @javafx.fxml.FXML
    private TextField numFxid;
    @javafx.fxml.FXML
    private TextField emailFxid;
    @javafx.fxml.FXML
    private TextField phoneNumberFxid;
    @javafx.fxml.FXML
    private TextField IdFxId;
    @javafx.fxml.FXML
    private TextArea loadViewFxid;
    @javafx.fxml.FXML
    private DatePicker datePickerFxid;
    @javafx.fxml.FXML
    private ComboBox balanceComboBox;
    @javafx.fxml.FXML
    private Label realtimeFxId;
    @javafx.fxml.FXML
    private Text cashFlowFxid;

    public CFO_RealTimeCashFlow(String name, String phoneNumber, String email, String id, String currentbalance, String ashFlow, LocalDate date, LocalDate time) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        Id = id;
        this.balance = currentbalance;
        this.cashFlow = ashFlow;
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

    public String getCurrentbalance() {
        return balance;
    }

    public void setCurrentbalance(String currentbalance) {
        this.balance = currentbalance;
    }

    public String getAshFlow() {
        return cashFlow;
    }

    public void setAshFlow(String ashFlow) {
        this.cashFlow = ashFlow;
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
    public void loadOnAction(ActionEvent actionEvent) {
    }
}
