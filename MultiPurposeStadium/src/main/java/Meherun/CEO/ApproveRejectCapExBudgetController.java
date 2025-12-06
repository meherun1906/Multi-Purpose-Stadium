package Meherun.CEO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ApproveRejectCapExBudgetController
{
    @javafx.fxml.FXML
    private TableColumn<CapExBudget, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CapExBudget, Float> amountTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CapExBudget, String> budgetTitleTableColumn;
    @javafx.fxml.FXML
    private DatePicker fromRangeDatePicker;
    @javafx.fxml.FXML
    private TableColumn<CapExBudget, String> budgetDetailsTableColumn;
    @javafx.fxml.FXML
    private TextField budgetIDTextField;
    @javafx.fxml.FXML
    private TableView<CapExBudget> budgetTableView;
    @javafx.fxml.FXML
    private TableColumn<CapExBudget, LocalDate> requestDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker toRangeDatePicker;
    @javafx.fxml.FXML
    private TableColumn<CapExBudget, String> budgetIDTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        budgetIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("budgetID"));
        budgetTitleTableColumn.setCellValueFactory(new PropertyValueFactory<>("budgetTitle"));
        budgetDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("budgetDetails"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("budgetStatus"));
        requestDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("requestDate"));


    }

    @javafx.fxml.FXML
    public void loadBudgetsButtonOnAction(ActionEvent actionEvent) {
        if (fromRangeDatePicker.getValue()==null || toRangeDatePicker.getValue()==null){
            Alert alert = new Alert (Alert.AlertType.INFORMATION);
            alert.setTitle("Validation Error");
            alert.setContentText("All fields must be filled.");
            alert.showAndWait();
            return;
        }
        ObservableList<CapExBudget> caps = FXCollections.observableArrayList();
        caps = GenericFileManager.readAll(CapExBudget.class, "CapExBudget.bin");
        LocalDate fromDate = fromRangeDatePicker.getValue();
        LocalDate toDate = toRangeDatePicker.getValue();
        budgetTableView.getItems().clear();

        for (CapExBudget b : caps){
            if ((b.getRequestDate().isAfter(fromDate) || b.getRequestDate().isEqual(fromDate)) ||
                    (b.getRequestDate().isBefore(toDate) || b.getRequestDate().isEqual(toDate))){
                budgetTableView.getItems().add(b);
            }
        }

    }

    @javafx.fxml.FXML
    public void approveBudgetButtonOnAction(ActionEvent actionEvent) {
        if (budgetIDTextField.getText().isEmpty()){
            Alert alert = new Alert (Alert.AlertType.INFORMATION);
            alert.setTitle("Validation Error");
            alert.setContentText("Please enter the Budget ID");
            alert.showAndWait();
            return;
        }
        ObservableList<CapExBudget> budgets = FXCollections.observableArrayList();
        budgets = GenericFileManager.readAll(CapExBudget.class, "CapExBudget.bin");
        for (CapExBudget b : budgets){
            if (budgetIDTextField.getText().equals(b.getBudgetID())){
                b.setBudgetStatus("Approved");
            }
        }
        GenericFileManager.writeAll(budgets, "CapExBudget.bin");
    }

    @javafx.fxml.FXML
    public void rejectBudgetButtonOnAction(ActionEvent actionEvent) {
        if (budgetIDTextField.getText().isEmpty()){
            Alert alert = new Alert (Alert.AlertType.INFORMATION);
            alert.setTitle("Validation Error");
            alert.setContentText("Please enter the Budget ID");
            alert.showAndWait();
            return;
        }
        ObservableList<CapExBudget> capEx = FXCollections.observableArrayList();
        capEx = GenericFileManager.readAll(CapExBudget.class, "CapExBudget.bin");
        for (CapExBudget b : capEx){
            if (budgetIDTextField.getText().equals(b.getBudgetID())){
                b.setBudgetStatus("rejected");
            }
        }
        GenericFileManager.writeAll(capEx, "CapExBudget.bin");
    }

}