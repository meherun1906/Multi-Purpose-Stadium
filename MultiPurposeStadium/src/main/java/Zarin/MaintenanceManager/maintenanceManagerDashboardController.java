package Zarin.MaintenanceManager;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.layout.AnchorPane;

public class maintenanceManagerDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane anchorpane;
    @javafx.fxml.FXML
    private AnchorPane partialPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createTaskOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/MaintenanceManager/createNewMaintenanceTask.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void requestSuppliesOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/MaintenanceManager/requestSupplies.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void viewMaintenanceScheduleOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/MaintenanceManager/saveAndViewMaintenanceSchedule.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void checkSuppliesOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/MaintenanceManager/checkSupplies.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @Deprecated
    public void viewSupplyReqOA(ActionEvent actionEvent) {
        
    }

    @Deprecated
    public void recordTaskCompletionOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/MaintenanceManager/maintenanceCompletion.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @Deprecated
    public void facilitySummaryOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void equipmentServiceLogsOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/MaintenanceManager/equipmentLogView.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void filterSupplyReqOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/MaintenanceManager/filterSupply.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void filterEquipmentServiceLogsOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Zarin/MaintenanceManager/filterEquipmentLogs.fxml"));
            Node node = loader.load();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            //
        }
    }
}