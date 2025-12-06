package Meherun.Client;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EditingBookingFormController
{
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TextArea editedDescriptionTextArea;
    @javafx.fxml.FXML
    private TextField editedEventNameTextField;
    @javafx.fxml.FXML
    private TextField editedSecondNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveChangesButtonOnAction(ActionEvent actionEvent) {
    }
}