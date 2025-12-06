package Meherun.CEO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SetEventPriorityController
{
    @javafx.fxml.FXML
    private TextField concertsPriorityTextField;
    @javafx.fxml.FXML
    private TextField exhibitionsPriorityTextField;
    @javafx.fxml.FXML
    private TextField sportsPriorityTextField;
    @javafx.fxml.FXML
    private Label eventPriorityMessageLabel;
    @javafx.fxml.FXML
    private TextField conferencesPriorityTextField;
    @javafx.fxml.FXML
    private Text third;
    @javafx.fxml.FXML
    private Text fourth;
    @javafx.fxml.FXML
    private Text first;
    @javafx.fxml.FXML
    private Text second;



    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void saveEventPrioritiesButtonOnAction(ActionEvent actionEvent) {
        if (sportsPriorityTextField.getText().isEmpty() ||
                concertsPriorityTextField.getText().isEmpty() ||
                exhibitionsPriorityTextField.getText().isEmpty() ||
                conferencesPriorityTextField.getText().isEmpty()){
            Alert alert = new Alert (Alert.AlertType.INFORMATION);
            alert.setTitle("Validation Error");
            alert.setContentText("All fields must be filled.");
            alert.showAndWait();
            return;
        }

        EventPriority sports = new EventPriority( "Sports", sportsPriorityTextField.getText());
        EventPriority concerts = new EventPriority( "Concerts", concertsPriorityTextField.getText());
        EventPriority exhibitions = new EventPriority( "Exhibitions", exhibitionsPriorityTextField.getText());
        EventPriority conferences = new EventPriority( "Conferences", conferencesPriorityTextField.getText());

        ObservableList<EventPriority> pList = FXCollections.observableArrayList();
        pList.addAll(sports,concerts, exhibitions, conferences);

        GenericFileManager.writeAll(pList, "EventPriority.bin");

        ObservableList<EventPriority> position = GenericFileManager.readAll(EventPriority.class, "EventPriority.bin");
        position.sort((a, b) -> Integer.parseInt(b.getPriorityValue()) - Integer.parseInt(a.getPriorityValue()));

        eventPriorityMessageLabel.setText("Priority Levels are saved successfully.");
        first.setText(position.get(0).getEventType());
        second.setText(position.get(1).getEventType());
        third.setText(position.get(2).getEventType());
        fourth.setText(position.get(3).getEventType());

    }
}