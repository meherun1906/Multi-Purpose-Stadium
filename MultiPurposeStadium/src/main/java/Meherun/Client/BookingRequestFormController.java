package Meherun.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class BookingRequestFormController
{
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private TextField secondPhoneTextField;
    @javafx.fxml.FXML
    private ComboBox eventTyepComboBox;
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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitRequestButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/bookingDetailsView.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }
}