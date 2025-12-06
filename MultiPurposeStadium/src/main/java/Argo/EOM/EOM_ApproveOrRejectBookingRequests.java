package Argo.EOM;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class EOM_ApproveOrRejectBookingRequests {
    private String name, id, phoneNumber, eventType;
    public LocalDate date;
    private Boolean BookingRequests;
    private int bill;
    @javafx.fxml.FXML
    private CheckBox rejectCheckBoxFxId;
    @javafx.fxml.FXML
    private Text eventTypeTextField;
    @javafx.fxml.FXML
    private ComboBox eeventTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker datepickerFxid;
    @javafx.fxml.FXML
    private Text viewLabelFxId;
    @javafx.fxml.FXML
    private Text BookingRequestTextFxId;
    @javafx.fxml.FXML
    private TextField billTextFieldFxId;
    @javafx.fxml.FXML
    private CheckBox acceptCheckBoxFxId;
    @javafx.fxml.FXML
    private TextField idTextFieldFxId;
    @javafx.fxml.FXML
    private TextField numTextFieldFxId;
    @javafx.fxml.FXML
    private TextArea loadInformationFxid;
    @javafx.fxml.FXML
    private Text dateTextFxid;
    @javafx.fxml.FXML
    private TextField phoneNumberTextFieldFxId;


    public EOM_ApproveOrRejectBookingRequests(String name, String id, String phoneNumber, String eventType, LocalDate date, Boolean bookingRequests, int bill) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.eventType = eventType;
        this.date = date;
        BookingRequests = bookingRequests;
        this.bill = bill;
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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getBookingRequests() {
        return BookingRequests;
    }

    public void setBookingRequests(Boolean bookingRequests) {
        BookingRequests = bookingRequests;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "EOM_ApproveOrRejectBookingRequests{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eventType='" + eventType + '\'' +
                ", date=" + date +
                ", BookingRequests=" + BookingRequests +
                ", bill=" + bill +
                '}';
    }

    @javafx.fxml.FXML
    public void addOnActionFxid(ActionEvent actionEvent) {
    }
}
