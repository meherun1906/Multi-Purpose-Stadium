package Meherun.CEO;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class CeoDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane ceoDashboardAnchorPane;
    @javafx.fxml.FXML
    private AnchorPane partialAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void removePoliciesButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/CEO/removePolicy.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void addPoliciesButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/CEO/addPolicy.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void revenueGrowthButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewEventStatisticsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/CEO/viewEventStatistics.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void setEventPriorityButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/CEO/setEventPriority.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void capitalExpenditureButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/CEO/approveRejectCapExBudget.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void setVIPBenefitsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/CEO/setVIPBenefits.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void viewUpcomingEventsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meherun/CEO/viewUpcomingEvents.fxml"));
            Node node = loader.load();
            partialAnchorPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}