package Zarin.MaintenanceManager;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class checkSuppliesController
{
    @javafx.fxml.FXML
    private Label messageL;
    @javafx.fxml.FXML
    private ComboBox<String> selectFacilityCB;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,String> statusCol;
    @javafx.fxml.FXML
    private Label messageL1;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,Integer> quantityCol;
    @javafx.fxml.FXML
    private ComboBox<String> itemCB;
    @javafx.fxml.FXML
    private TableView<SupplyItem> supplyTV;
    @javafx.fxml.FXML
    private ComboBox<String> facilityCB;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,String> itemCol;
    @javafx.fxml.FXML
    private TextField quantityTF;

    @javafx.fxml.FXML
    public void initialize() {
        facilityCB.getItems().addAll(
                "Pitch",
                "VIP Lounge",
                "Restroom Block A",
                "Generator Room"
        );
        selectFacilityCB.getItems().addAll(
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

            messageL.setText("Please select Facility, Item and enter Quantity.");
            return;
        }
        int quantity;
        try {
            quantity = Integer.parseInt(quantityTF.getText().trim());
        } catch (NumberFormatException e) {
            messageL.setText("Quantity must be a number.");
            return;
        }
        String status = calculateStatus(quantity);
        try {
            File f = new File("SupplyData.bin");
            SupplyItem si = new SupplyItem(
                    facilityCB.getValue(),
                    itemCB.getValue(),
                    quantity,
                    status
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
            messageL.setText("Supply Saved");
            facilityCB.getSelectionModel().clearSelection();
            itemCB.getSelectionModel().clearSelection();
            quantityTF.clear();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
        supplyTV.getItems().clear();
        messageL1.setText("");

        String selectedFacility = selectFacilityCB.getValue();

        if (selectedFacility == null) {
            messageL1.setText("Please select a facility to load supplies.");
            return;
        }

        File f = new File("SupplyData.bin");

        if (!f.exists()) {
            messageL1.setText("No supply data found.");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            boolean found = false;
            while (true) {
                try {
                    SupplyItem si = (SupplyItem) ois.readObject();

                    if (si.getFacility().equals(selectedFacility)) {
                        supplyTV.getItems().add(si);
                        found = true;
                    }
                } catch (EOFException e) {
                    break;
                }
            }
            if (!found) {
                messageL1.setText("No supplies found for this facility.");
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String calculateStatus(int quantity) {
        if (quantity >= 10) {
            return "Sufficient";
        } else {
            return "Low";
        }
    }
}