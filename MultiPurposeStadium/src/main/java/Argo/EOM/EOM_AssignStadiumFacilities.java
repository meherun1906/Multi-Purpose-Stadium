package Argo.EOM;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class EOM_AssignStadiumFacilities {
    private String name, id, phoneNumber, email;
    public LocalDate date;
    private Boolean stadiumFacilities, assign;
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private Text dateText;
    @javafx.fxml.FXML
    private CheckBox noCheckBoxFxid;
    @javafx.fxml.FXML
    private Label headlineLabelFxId;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private ComboBox stadiumFacilitiesTypeFxid;
    @javafx.fxml.FXML
    private DatePicker datepickerFxid;
    @javafx.fxml.FXML
    private TextField idTextFieldFxid;
    @javafx.fxml.FXML
    private TextField numTextFieldFxid;
    @javafx.fxml.FXML
    private Text stadiumFacilitiesFxid;
    @javafx.fxml.FXML
    private TextArea loadViewFxid;
    @javafx.fxml.FXML
    private Text assignTextFxid;
    @javafx.fxml.FXML
    private CheckBox yesCheckBoxFxid;

    public EOM_AssignStadiumFacilities(String name, String id, String phoneNumber, String email, LocalDate date, Boolean stadiumFacilities, Boolean assign) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
        this.stadiumFacilities = stadiumFacilities;
        this.assign = assign;
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

    public Boolean getStadiumFacilities() {
        return stadiumFacilities;
    }

    public void setStadiumFacilities(Boolean stadiumFacilities) {
        this.stadiumFacilities = stadiumFacilities;
    }

    public Boolean getAssign() {
        return assign;
    }

    public void setAssign(Boolean assign) {
        this.assign = assign;
    }

    @Override
    public String toString() {
        return "EOM_AssignStadiumFacilities{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", stadiumFacilities=" + stadiumFacilities +
                ", assign=" + assign +
                '}';
    }

    @javafx.fxml.FXML
    public void addOnAction(ActionEvent actionEvent) {
    }
}
