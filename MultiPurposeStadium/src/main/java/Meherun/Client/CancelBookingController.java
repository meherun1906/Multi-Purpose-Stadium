package Meherun.Client;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CancelBookingController
{
    @javafx.fxml.FXML
    private TableColumn endTableColumn;
    @javafx.fxml.FXML
    private Label cancellationMessageLabel;
    @javafx.fxml.FXML
    private TextField calcelBookingIdTextField;
    @javafx.fxml.FXML
    private TableColumn bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn eventNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn eventTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn startDateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancelBookingButtonOnAction(ActionEvent actionEvent) {
    }
}