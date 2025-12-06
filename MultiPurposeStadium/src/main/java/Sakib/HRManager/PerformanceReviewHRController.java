package Sakib.HRManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class PerformanceReviewHRController
{
    @javafx.fxml.FXML
    private Label attendanceLabel;
    @javafx.fxml.FXML
    private Label ratingLabel;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReviewHR, String> departmentCol;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReviewHR,Number> taskCol;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReviewHR, String> empNameCol;
    @javafx.fxml.FXML
    private TextField empNameTF;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReviewHR, Number> attendanceCol;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReviewHR, Number> ratingCol;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private Label taskLabel;
    @javafx.fxml.FXML
    private TableView<PerformanceReviewHR> reviewTable;


    private ObservableList<PerformanceReviewHR> performancereview =
            FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void initialize() {
        empNameCol.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        taskCol.setCellValueFactory(new PropertyValueFactory<>("tasksCompleted"));
        attendanceCol.setCellValueFactory(new PropertyValueFactory<>("attendancePercent"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("supervisorRating"));

        departmentCB.setItems(FXCollections.observableArrayList(
                "HR", "Finance", "IT", "Operations", "Marketing", "Sales"
        ));

        reviewTable.setItems(performancereview);
    }

    @javafx.fxml.FXML
    public void backReviewButton(ActionEvent actionEvent) {
        switchScene("HRDashboard.fxml", actionEvent);
    }
    private void switchScene(String fxmlFileName, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ignored) {}
    }

    @javafx.fxml.FXML
    public void reviewButton(ActionEvent actionEvent) {
    }

}