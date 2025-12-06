package Zarin.MaintenanceManager;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class requestSuppliesController
{
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,String> facilityCol;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,String> statusCol;
    @javafx.fxml.FXML
    private Label messageL1;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,Integer> quantityCol;
    @javafx.fxml.FXML
    private TextField quantityTF;
    @javafx.fxml.FXML
    private ComboBox<String> itemCB;
    @javafx.fxml.FXML
    private TableView<SupplyItem> requestTV;
    @javafx.fxml.FXML
    private ComboBox<String> facilityCB;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,String> itemCol;

    @javafx.fxml.FXML
    public void initialize() {
        facilityCB.getItems().addAll(
                "Pitch",
                "VIP Lounge",
                "Restroom Block A",
                "Generator Room"
        );
        itemCB.getItems().addAll(
                "Toilet Paper",
                "Soap",
                "Paper Towels"
        );
        facilityCol.setCellValueFactory(new PropertyValueFactory<>("facility"));
        itemCol.setCellValueFactory(new PropertyValueFactory<>("item"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
        messageL.setText("");
        if (facilityCB.getValue() == null
                || itemCB.getValue() == null
                || quantityTF.getText().isEmpty()) {

            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Invalid Quantity");
            a.setContentText("Please enter a valid quantity (e.g., 1, 5, 20).");
            a.showAndWait();
            return;
        }

        int quantity;
        try {
            quantity = Integer.parseInt(quantityTF.getText().trim());
        } catch (NumberFormatException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Invalid Quantity");
            a.setContentText("Please enter a valid quantity (e.g., 1, 5, 20).");
            a.showAndWait();
            return;
        }
        if (quantity <= 0) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Invalid Quantity");
            a.setHeaderText(null);
            a.setContentText("Please enter a valid quantity (e.g., 1, 5, 20).");
            a.showAndWait();
            return;
        }
        try {
            File f = new File("SupplyData.bin");
            SupplyItem si = new SupplyItem(
                    facilityCB.getValue(),
                    itemCB.getValue(),
                    quantity,
                    "Pending"
            );
            if (f.exists()) {
                FileOutputStream fos = new FileOutputStream(f, true);
                ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(si);
                oos.close();
            } else {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(si);
                oos.close();
            }
            messageL.setText("Supply request submitted.");
            requestTV.getItems().add(si);

            facilityCB.getSelectionModel().clearSelection();
            itemCB.getSelectionModel().clearSelection();
            quantityTF.clear();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
        requestTV.getItems().clear();
        messageL1.setText("");

        File f = new File("SupplyRequest.bin");

        if (!f.exists()) {
            messageL1.setText("No supply requests found.");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            boolean found = false;

            while (true) {
                try {
                    SupplyItem si = (SupplyItem) ois.readObject();
                    if ("Pending".equals(si.getStatus())) {
                        requestTV.getItems().add(si);
                        found = true;
                    }

                } catch (EOFException e) {
                    break;
                }
            }
            if (!found) {
                messageL1.setText("No pending supply requests.");
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}