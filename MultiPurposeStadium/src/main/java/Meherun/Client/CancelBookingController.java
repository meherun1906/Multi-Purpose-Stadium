package Meherun.Client;

import Meherun.CEO.DepartmentalPolicy;
import Meherun.CEO.GenericFileManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancelBookingController
{
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> endTableColumn;
    @javafx.fxml.FXML
    private Label cancellationMessageLabel;
    @javafx.fxml.FXML
    private TextField calcelBookingIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Event, String> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableView<Event> tableView;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> startDateTableColumn;

    ObservableList<Event> evList = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void initialize() {

        eventNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("eventTitle"));
        bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingID"));
        eventTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("eventType"));
        startDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        endTableColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));

        ObservableList<Event> added = GenericFileManager.readAll(Event.class, "Events.bin");
        tableView.setItems(added);
    }


    @javafx.fxml.FXML
    public void cancelBookingButtonOnAction(ActionEvent actionEvent) {
        if (calcelBookingIdTextField.getText().isEmpty()){
            cancellationMessageLabel.setText("Please enter ID to remove policy.");
            return;
        }

        evList = GenericFileManager.readAll(Event.class, "Events.bin");
        String selectedID = calcelBookingIdTextField.getText() ;
        try {
            for (Event e : evList){
                if (selectedID.equals(e.getBookingID())){

                    long days = LocalDate.now().until(e.getStartDate(), ChronoUnit.DAYS);;
                    if (days < 20){
                        cancellationMessageLabel.setText("You cannot cancel now.");
                        return;
                    }else{
                        evList.remove(e);
                        tableView.getItems().remove(e);
                        cancellationMessageLabel.setText("Booking successfully cancelled.");
                        tableView.getItems().clear();
                        tableView.getItems().addAll(evList);
                        GenericFileManager.writeAll(evList, "Events.bin");
                    }

                }
            }
        } catch (Exception e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
}