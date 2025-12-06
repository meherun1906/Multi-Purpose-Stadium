package Meherun.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditController
{
    @javafx.fxml.FXML
    private TableColumn endTableColumn;
    @javafx.fxml.FXML
    private TableColumn bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TextField editBookingIdTextField;
    @javafx.fxml.FXML
    private TableColumn eventNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn eventTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn startDateTableColumn;
    @javafx.fxml.FXML
    private AnchorPane partialAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void nextToEditableFieldsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/editingBookingForm.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}