package Zarin.MaintenanceManager;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class filterSupplyController
{
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,Integer> qtyCol;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,String> statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> filFacCB;
    @javafx.fxml.FXML
    private TableView<SupplyItem> supplyTV;
    @javafx.fxml.FXML
    private TableColumn<SupplyItem,String> itemCol;
    @javafx.fxml.FXML
    private Label messageL1;

    @javafx.fxml.FXML
    public void initialize() {
        filFacCB.getItems().addAll(
                "Pitch",
                "VIP Lounge",
                "Restroom Block A",
                "Generator Room"
        );
        itemCol.setCellValueFactory(new PropertyValueFactory<>("item"));
        qtyCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }
    @javafx.fxml.FXML
    public void filOA(ActionEvent actionEvent) {
        supplyTV.getItems().clear();
        messageL1.setText("");
        String selectedFacility = filFacCB.getValue();
        if (selectedFacility == null) {
            messageL1.setText("Please select a facility.");
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
            ois.close();
            if (!found) {
                messageL1.setText("No supplies found for this facility.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}