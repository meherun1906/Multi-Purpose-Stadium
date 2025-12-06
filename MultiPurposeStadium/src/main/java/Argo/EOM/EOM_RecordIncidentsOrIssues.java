package Argo.EOM;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class EOM_RecordIncidentsOrIssues {
    private String name, id, phoneNumber, email;
    public LocalDate date;
    private Boolean record;
    @javafx.fxml.FXML
    private TextField emailTextFieldFxid;
    @javafx.fxml.FXML
    private TextField idTextFieldFxid;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextArea loadViewTextAreaFieldFxid;
    @javafx.fxml.FXML
    private TextField numTextFieldFxid;
    @javafx.fxml.FXML
    private Text dateTextFxid;
    @javafx.fxml.FXML
    private TextField phoneNumberTextFieldFxid;
    @javafx.fxml.FXML
    private Label fastLabelFxid;

    public EOM_RecordIncidentsOrIssues(String name, String id, String phoneNumber, String email, LocalDate date, Boolean record) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
        this.record = record;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getRecord() {
        return record;
    }

    public void setRecord(Boolean record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "EOM_RecordIncidentsOrIssues{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", record=" + record +
                '}';
    }

    @javafx.fxml.FXML
    public void recordButtonOnAction(ActionEvent actionEvent) {
    }
}
