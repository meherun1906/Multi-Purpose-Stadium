package Meherun.Client;

import Meherun.CEO.DepartmentalPolicy;
import Meherun.CEO.GenericFileManager;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class BookingRequestFormController
{
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private TextField secondPhoneTextField;
    @javafx.fxml.FXML
    private ComboBox<String> eventTyepComboBox;
    @javafx.fxml.FXML
    private TextArea eventDescriptionTextArea;
    @javafx.fxml.FXML
    private TextField secondNameTextField;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private Label messageLAbel;
    @javafx.fxml.FXML
    private TextField companyTextField;
    @javafx.fxml.FXML
    private AnchorPane partialAnchorPane;
    @javafx.fxml.FXML
    private TextField clientIDTextField;

    @javafx.fxml.FXML
    public void initialize() {
        eventTyepComboBox.getItems().addAll("Sports", "Concert", "Exhibition", "Conference");
    }
    //ObservableList<Event> events = GenericFileManager.readAll(Event.class, "Events.bin");

    public String generateBookingId() {
        return "BK-" + System.currentTimeMillis();
    }

    public String getDuration(){
        LocalDate a = startDatePicker.getValue();
        LocalDate b = endDatePicker.getValue();

        long days = ChronoUnit.DAYS.between(a, b);
        return String.valueOf(days);
    }

    @javafx.fxml.FXML
    public void submitRequestButtonOnAction(ActionEvent actionEvent) {
        if (nameTextField.getText().isEmpty()||
                phoneTextField.getText().isEmpty()||
                companyTextField.getText().isEmpty()||
                eventNameTextField.getText().isEmpty()||
                eventTyepComboBox.getValue() == null||
                startDatePicker.getValue() == null ||
                endDatePicker.getValue() == null||
                eventDescriptionTextArea.getText().isEmpty()||
                secondNameTextField.getText().isEmpty()||
                secondPhoneTextField.getText().isEmpty())
        {Alert alert = new Alert (Alert.AlertType.INFORMATION);
            alert.setTitle("Validation Error");
            alert.setContentText("All fields must be filled.");
            alert.showAndWait();
            return;
        }

        if (startDatePicker.getValue().isBefore(LocalDate.now())){
            messageLAbel.setText("Invalid Start Date");
            return;
        }
        long days = LocalDate.now().until(startDatePicker.getValue(), ChronoUnit.DAYS);
        if (days > 365){
            messageLAbel.setText("You can only book up to 1 year in advance.");
            return;
        }

        Event ev = new Event(clientIDTextField.getText(),
                nameTextField.getText(),
                phoneTextField.getText(),
                eventNameTextField.getText(),
                eventTyepComboBox.getValue(),
                eventDescriptionTextArea.getText(),
                companyTextField.getText(),
                secondNameTextField.getText(),
                secondPhoneTextField.getText(),
                startDatePicker.getValue(),
                endDatePicker.getValue());

        ev.setBookingID(generateBookingId());
        ev.setDuration(getDuration());
        try {
            GenericFileManager.append(ev,"Events.bin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}