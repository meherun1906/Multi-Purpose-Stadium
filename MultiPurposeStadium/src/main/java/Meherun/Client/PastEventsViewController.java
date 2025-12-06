package Meherun.Client;

import Meherun.CEO.GenericFileManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class PastEventsViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> filterEventTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<Event, String> descriptionTabCol;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventTypeTabCol;
    @javafx.fxml.FXML
    private TableColumn<Event, String> clientNameTabCol;
    @javafx.fxml.FXML
    private TableView<Event> filteredTableView;
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> startTabCol;
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> endTabCol;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventNameTabcol;

    @javafx.fxml.FXML
    public void initialize() {
        filterEventTypeComboBox.getItems().addAll("Sports", "Concert", "Exhibition", "Conference");

        eventNameTabcol.setCellValueFactory(new PropertyValueFactory<>("eventTitle"));
        descriptionTabCol.setCellValueFactory(new PropertyValueFactory<>("eventDescription"));
        eventTypeTabCol.setCellValueFactory(new PropertyValueFactory<>("eventType"));
        clientNameTabCol.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        startTabCol.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        endTabCol.setCellValueFactory(new PropertyValueFactory<>("endDate"));



    }
    ObservableList<Event> filtered = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {

        String filteredbookings = filterEventTypeComboBox.getValue();
        filteredTableView.getItems().clear();
        filtered = GenericFileManager.readAll(Event.class, "Events.bin");
        try {
            for (Event evs : filtered){
                if(evs.getEventType().equals(filteredbookings)){
                    filteredTableView.getItems().add(evs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}