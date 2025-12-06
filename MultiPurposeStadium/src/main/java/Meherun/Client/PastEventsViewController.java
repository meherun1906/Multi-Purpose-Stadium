package Meherun.Client;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PastEventsViewController
{
    @javafx.fxml.FXML
    private ComboBox filterEventTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn descriptionTabCol;
    @javafx.fxml.FXML
    private TableColumn eventNameTabcol;
    @javafx.fxml.FXML
    private TableColumn eventTypeTabCol;
    @javafx.fxml.FXML
    private TableColumn clientNameTabCol;
    @javafx.fxml.FXML
    private TableView filteredTableView;
    @javafx.fxml.FXML
    private TableColumn startTabCol;
    @javafx.fxml.FXML
    private TableColumn endTabCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }
}