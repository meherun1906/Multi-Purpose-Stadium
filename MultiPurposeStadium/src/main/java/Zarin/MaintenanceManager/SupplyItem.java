package Zarin.MaintenanceManager;

import java.io.Serializable;

public class SupplyItem implements Serializable {
    private String facility;
    private String item;
    private int quantity;
    private String status;

    public SupplyItem(String facility, String item, int quantity, String status) {
        this.facility = facility;
        this.item = item;
        this.quantity = quantity;
        this.status = status;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
