package Zarin.HeadOfSecurity;
import javafx.scene.control.*;
import javafx.event.*;

import java.time.LocalDate;

public class assignStaffController
{
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private TableColumn<Assignment, LocalDate> dateCol;
    @javafx.fxml.FXML
    private ComboBox<String> zoneCB;
    @javafx.fxml.FXML
    private TableView<Assignment> assignTV;
    @javafx.fxml.FXML
    private DatePicker assignmentDateCB;
    @javafx.fxml.FXML
    private ComboBox<String> staffCB;
    @javafx.fxml.FXML
    private ComboBox<String> gateCB;
    @javafx.fxml.FXML
    private TableColumn<Assignment,String> zoneCol;
    @javafx.fxml.FXML
    private TableColumn<Assignment,String> staffCol;
    @javafx.fxml.FXML
    private TableColumn<Assignment,String> gateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void assignOA(ActionEvent actionEvent) {
    }
}