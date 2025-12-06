package Meherun.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class ClientDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane clientPane;
    @javafx.fxml.FXML
    private AnchorPane partialAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitReviewButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void editBookingsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/edit.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void bookStadiumButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/bookingRequestForm.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void cancelBookingsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/cancelBooking.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void showPastEventsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/pastEventsView.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void checkAvailabilityButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/checkAvailability.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void viewPendingPaymentsButtonOnAction(ActionEvent actionEvent) {
    }
}