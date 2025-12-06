package Meherun.CEO;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class SetVIPBenefitsController
{
    @javafx.fxml.FXML
    private TextField benefitTextField;
    @javafx.fxml.FXML
    private TableColumn<VIPBenefits,String> benefitTableColumn;
    @javafx.fxml.FXML
    private TextField conditionTextField;
    @javafx.fxml.FXML
    private TableColumn<VIPBenefits, String> conditionTableColumn;
    @javafx.fxml.FXML
    private TableView<VIPBenefits> benefitsTableView;
    @javafx.fxml.FXML
    private Label benefitsMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        benefitTableColumn.setCellValueFactory(new PropertyValueFactory<>("benefit"));
        conditionTableColumn.setCellValueFactory(new PropertyValueFactory<>("condition"));
        ObservableList<VIPBenefits> benefits = GenericFileManager.readAll(VIPBenefits.class, "VIPBenefits.bin");
        benefitsTableView.setItems(benefits);
        }

    @javafx.fxml.FXML
    public void addBenefitButtonOnAction(ActionEvent actionEvent) {
        if (benefitTextField.getText().isEmpty() || conditionTextField.getText().isEmpty()){
            Alert alert = new Alert (Alert.AlertType.INFORMATION);
            alert.setTitle("Validation Error");
            alert.setContentText("All fields must be filled.");
            alert.showAndWait();
            return;
        }
        VIPBenefits b = new VIPBenefits(benefitTextField.getText(),conditionTextField.getText());
        GenericFileManager.append(b, "VIPBenefits.bin");
        benefitsMessageLabel.setText("Benefit added successfully.");
        benefitsTableView.getItems().add(b);
        benefitTextField.clear();
        conditionTextField.clear();

    }
}