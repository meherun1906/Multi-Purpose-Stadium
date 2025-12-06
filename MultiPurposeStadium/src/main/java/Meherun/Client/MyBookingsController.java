package Meherun.Client;

import Meherun.CEO.DepartmentalPolicy;
import Meherun.CEO.GenericFileManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MyBookingsController
{
    @javafx.fxml.FXML
    private TableColumn<Event , String> eventTypeCTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Event , String> paymentStatusCTableColumn;
    @javafx.fxml.FXML
    private TextField loadBookingsByIDTextField;
    @javafx.fxml.FXML
    private TableColumn<Event , String> clientBookingIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Event , String> eventNameCTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Event , String> durationCTableColumn;
    @javafx.fxml.FXML
    private TableView<Event> clientBookingsTableView;
    @javafx.fxml.FXML
    private TableColumn<Event, String> requestStatusTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        clientBookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingID"));
        eventNameCTableColumn.setCellValueFactory(new PropertyValueFactory<>("eventTitle"));
        eventTypeCTableColumn.setCellValueFactory(new PropertyValueFactory<>("eventType"));
        durationCTableColumn.setCellValueFactory(new PropertyValueFactory<>("duration"));
        paymentStatusCTableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        requestStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("eventStatus"));

    }

    ObservableList<Event> clientBookings = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void loadBookingsbuttonOnAction(ActionEvent actionEvent) {

        String bookings = loadBookingsByIDTextField.getText();
        clientBookingsTableView.getItems().clear();
        clientBookings = GenericFileManager.readAll(Event.class, "Events.bin");
        try {
            for (Event evs : clientBookings){
                if(evs.getClientID().equals(bookings)){
                    clientBookingsTableView.getItems().add(evs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}