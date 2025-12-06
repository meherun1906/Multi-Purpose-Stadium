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
    public void viewPendingPaymentsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewVIPBenefitsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/viewBenefits.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void viewMyBookingsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/Client/myBookingsView.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void ViewPastReviewsButtonOnAction(ActionEvent actionEvent) {
    }
}