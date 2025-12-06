package Sakib.HRManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void backReviewButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewButton(ActionEvent actionEvent) {
    }
}