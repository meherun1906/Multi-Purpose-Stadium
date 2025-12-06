package Argo.EOM;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class EOM_CommunicateWithCients {
    private String name, id, phoneNumber, email;
    public LocalDate date;
    private Boolean communicate, clients;
    @javafx.fxml.FXML
    private Text dateText;
    @javafx.fxml.FXML
    private TextField communicateTextFieldFxid;
    @javafx.fxml.FXML
    private TextField clientsTextFieldFxid;
    @javafx.fxml.FXML
    private TextField emailTextFieldFxid;
    @javafx.fxml.FXML
    private TextField idTextFieldFxid;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextArea loadViewTextAreaFxid;
    @javafx.fxml.FXML
    private TextField numTextFieldFxid;
    @javafx.fxml.FXML
    private TextField phoneNumberTextFieldFxid;
    @javafx.fxml.FXML
    private Label fastLabelFxid;

    public EOM_CommunicateWithCients(String name, String id, String phoneNumber, String email, LocalDate date, Boolean communicate, Boolean clients) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
        this.communicate = communicate;
        this.clients = clients;
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

    public Boolean getCommunicate() {
        return communicate;
    }

    public void setCommunicate(Boolean communicate) {
        this.communicate = communicate;
    }

    public Boolean getClients() {
        return clients;
    }

    public void setClients(Boolean clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "EOM_CommunicateWithCients{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", communicate=" + communicate +
                ", clients=" + clients +
                '}';
    }

    @javafx.fxml.FXML
    public void addButtonOnActioon(ActionEvent actionEvent) {
    }
}
