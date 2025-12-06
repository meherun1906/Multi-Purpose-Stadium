package Meherun.CEO;

import Meherun.Client.Event;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ViewUpcomingEventsController
{
    @javafx.fxml.FXML
    private TableColumn<Event, String> clientNameTC;
    @javafx.fxml.FXML
    private TableView<Event> upcomingEventsTableView;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventNameTC;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventTypeTC;
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> startDateTC;
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> endDateTC;

    @javafx.fxml.FXML
    public void initialize() {
        clientNameTC.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        eventNameTC.setCellValueFactory(new PropertyValueFactory<>("eventTitle"));
        eventTypeTC.setCellValueFactory(new PropertyValueFactory<>("eventType"));
        startDateTC.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        endDateTC.setCellValueFactory(new PropertyValueFactory<>("endDate"));

        ObservableList<Event> eventList = GenericFileManager.readAll(Event.class, "Events.bin");
        for (Event upcoming : eventList){
            if (upcoming.getEventStatus().equals("Approved")){
                upcomingEventsTableView.getItems().add(upcoming);
            }
        }

    }}