package Zarin.HeadOfSecurity;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class headOfSecurityDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane anchorPane;
    @javafx.fxml.FXML
    private AnchorPane partialPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void manageIncidentOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/HeadOfSecurity/updateIncident.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void reportInOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/HeadOfSecurity/reportIncident.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void addStaffOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/HeadOfSecurity/addStaff.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void viewDutyOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/HeadOfSecurity/saveAndViewDutySchedule.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }


    @javafx.fxml.FXML
    public void assignOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/HeadOfSecurity/assignStaff.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void attendanceReportOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/HeadOfSecurity/attendanceRecord.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }


    @javafx.fxml.FXML
    public void filterOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/HeadOfSecurity/staffListFilterView.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }
}